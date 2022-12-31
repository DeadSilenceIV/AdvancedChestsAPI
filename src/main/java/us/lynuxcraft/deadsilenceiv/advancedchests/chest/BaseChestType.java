package us.lynuxcraft.deadsilenceiv.advancedchests.chest;

import lombok.Getter;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.compressor.PageBatchCompressor;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.dispenser.DispenserService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.search.SearchService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sells.PageBatchSeller;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.smelter.SmelterService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.sorter.SorterService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.storage.mysql.MysqlService;
import us.lynuxcraft.deadsilenceiv.advancedchests.services.chest.storage.yaml.YamlService;

import java.util.Objects;

public abstract class BaseChestType implements ChestType{
    @Getter private String name;
    protected MysqlService mysqlService;
    protected YamlService yamlService;
    protected SorterService sorterService;
    protected SmelterService smelterService;
    protected PageBatchSeller pageBatchSeller;
    protected DispenserService dispenserService;
    protected PageBatchCompressor pageBatchCompressor;
    protected SearchService searchService;
    public BaseChestType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseChestType that = (BaseChestType) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}
