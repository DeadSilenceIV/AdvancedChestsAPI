package us.lynuxcraft.deadsilenceiv.advancedchests.utils;

import lombok.Getter;

import java.util.Objects;

public class Pair<K,V>{
    @Getter private K key;
    @Getter private V value;
    public Pair(K key,V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
