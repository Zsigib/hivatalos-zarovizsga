package hu.nive.ujratervezes.zarovizsga.aquarium;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Aquarium {

    private List<Fish> fish = new ArrayList<>();

    public List<String> getStatus() {

        List<String> result = new ArrayList<>();

        for (Fish a : fish)
        {
            result.add(a.status());
        }
        return result;
    }

    public void removeFish() {
        Iterator<Fish> iterator = fish.iterator();

        while (iterator.hasNext()) {
            Fish i = iterator.next();
            if (i.getWeight() > 10)
            {
               iterator.remove();
            }
        }
    }

    public void addFish(Fish f) {
        fish.add(f);
    }

    public void feed() {
        for (Fish f : fish)
        {
            f.feed();
        }
    }
}
