package us.lynuxcraft.deadsilenceiv.advancedchests.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class LocationUtils {

    public static String serializeLoc(Location l) {
        StringBuilder s = new StringBuilder();
        s.append("@w;").append(l.getWorld().getName());
        s.append(":@x;").append(l.getX());
        s.append(":@y;").append(l.getY());
        s.append(":@z;").append(l.getZ());
        s.append(":@pi;").append(l.getPitch());
        s.append(":@ya;").append(l.getYaw());
        return s.toString();
    }

    public static Location deserializeLoc(String s) {
        Location l = new Location(Bukkit.getWorlds().get(0), 0, 0, 0,0,0);
        String[] att = s.split(":");
        for(String attribute : att) {
            String[] split = attribute.split(";");
            if(split[0].equalsIgnoreCase("@w"))
                l.setWorld(Bukkit.getWorld(split[1]));
            if(split[0].equalsIgnoreCase("@x"))
                l.setX(Double.parseDouble(split[1]));
            if(split[0].equalsIgnoreCase("@y"))
                l.setY(Double.parseDouble(split[1]));
            if(split[0].equalsIgnoreCase("@z"))
                l.setZ(Double.parseDouble(split[1]));
            if(split[0].equalsIgnoreCase("@pi"))
                l.setPitch((float) Double.parseDouble(split[1]));
            if(split[0].equalsIgnoreCase("@ya"))
                l.setYaw((float) Double.parseDouble(split[1]));

        }
        return l;
    }

    public static boolean verify(Location location){
        return (location != null && location.getWorld() != null);
    }

}
