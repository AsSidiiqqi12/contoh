package Generic;

import java.util.ArrayList;
import java.util.List;

public class Kampus <T> {
    String name;
    List<T> mahasiwa;

    public Kampus(String name) {
        this.name = name;
        mahasiwa = new ArrayList<>();
    }

    public void addItem(T item) {
        mahasiwa.add(item);
    }

    public List<T> getMahasiwa() {
        return mahasiwa;
    }

    public String getName() {
        return name;
    }
}
