package Boxes;

import java.util.Objects;

public class Box implements Comparable {
    private Integer weight;

    public Box(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(weight, box.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "weight = " + weight + "; Hashcode = " + Integer.toHexString(hashCode());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
