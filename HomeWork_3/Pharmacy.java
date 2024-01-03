package HomeWork_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Pharmacy implements Iterator<PharmacyComponent>,Comparable<Pharmacy> {
    private List<PharmacyComponent> components = new ArrayList<>();
    private int index = 0;

    public Pharmacy addComponent(PharmacyComponent component){
        components.add(component);
        return this;
    }

      @Override
    public boolean hasNext() {
        return index<components.size();
    }

    @Override
    public PharmacyComponent next() {
        return components.get(index++);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return index == pharmacy.index && Objects.equals(components, pharmacy.components);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, index);
    }
    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + index +
                '}';
    }

    @Override
    public int compareTo(Pharmacy o) {
        return 0;
    }


}
