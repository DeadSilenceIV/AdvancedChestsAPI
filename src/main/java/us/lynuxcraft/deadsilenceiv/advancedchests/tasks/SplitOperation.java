package us.lynuxcraft.deadsilenceiv.advancedchests.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Splits an array of objects in batches and process them in a specified frequency
 * {@link #start(long, long, int, Object[])}.
 *
 * @param <T> the type of the object that is going to be split.
 */
public abstract class SplitOperation<T> extends PluginTask{
    // The max amount time in seconds that the operation can take.
    protected int timeLimit;
    private T[] toOperate;
    protected int timeElapsed;
    protected List<Set<T>> batches;
    protected Set<T> lastBatch;
    protected SplitOperation(){
        timeElapsed = 0;
        batches = new ArrayList<>();
    }

    /**
     * Starts to operate.
     *
     * @param delay the delay of the operation
     * @param frequency the frequency in ticks of task
     * @param timeLimit the max amount of time in seconds that the operation can take
     * @param toOperate the objects that are going to be split.
     */
    protected void start(long delay,long frequency,int timeLimit,T[] toOperate){
        this.timeLimit = timeLimit;
        this.toOperate = toOperate;
        loadBatches();
        lastBatch = batches.get(batches.size()-1);
        this.runTask(frequency,delay);
    }

    /**
     * Loads all the batches.
      */
    private void loadBatches(){
        int amountOfObjectsPerBatch = (toOperate.length >= timeLimit) ? (int)Math.floor((double)toOperate.length/(double)timeLimit) : 1;
        List<T> residual = new ArrayList<>();
        for(int i = 0; i<= toOperate.length-1;i++){
            T object = toOperate[i];
            if(!createBatchIfPossible(i,object,amountOfObjectsPerBatch))continue;
            Set<T> lastBatch = batches.get(batches.size() - 1);
            if(lastBatch.size() < amountOfObjectsPerBatch) {
                lastBatch.add(object);
            }else residual.add(object);
        }
        spreadResidual(residual);
    }

    /**
     * Creates a new batch if possible.
     *
     * @param objectId the object position in the {@link #toOperate} array.
     * @param object the object that is going to be added to the last batch created
     * @param amountOfObjectsPerBatch the maximum amount of objects per batch
     * @return true if process of adding the page to the last batch created should continue, false otherwise.
     */
    private boolean createBatchIfPossible(int objectId,T object,int amountOfObjectsPerBatch){
        boolean canMoreBatchesBeCreated = (timeLimit == 0 && batches.size() == 0) || batches.size() < timeLimit;
        boolean isLastObjectFromBatch = (objectId+1)%amountOfObjectsPerBatch == 0;
        if(canMoreBatchesBeCreated) {
            if (objectId == 0 || amountOfObjectsPerBatch == 1) {
                batches.add(new HashSet<>());
            } else if (isLastObjectFromBatch && amountOfObjectsPerBatch > 1) {
                // Adds the remaining object to the last batch and creates another.
                batches.get(batches.size() - 1).add(object);
                batches.add(new HashSet<>());
                return false;
            }
        }
        return true;
    }

    /**
     * Spread the residual objects through all the batches.
     *
     * @param residual the residual objects.
     */
    private void spreadResidual(List<T> residual){
        if(!residual.isEmpty()){
            int index = 0;
            for(int i = 0; i <= residual.size()-1;i++){
                T residualObject = residual.get(i);
                batches.get(index).add(residualObject);
                index = (index == batches.size()-1) ? 0 : index+1;
            }
        }
    }
}
