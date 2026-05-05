package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WorkintechList extends ArrayList<Object> {
    @Override
    public boolean add(Object o) {
        if (!this.contains(o)) {
            return super.add(o);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Number && o2 instanceof Number) {
                    Double n1 = ((Number) o1).doubleValue();
                    Double n2 = ((Number) o2).doubleValue();
                    return n1.compareTo(n2);
                }

                return o1.toString().compareTo(o2.toString());
            }
        });
    }

    public boolean remove(Object o) {
        if (!this.contains(o)) {
            super.remove(o);
            sort();
            return true;
        }
        return false;
    }
}