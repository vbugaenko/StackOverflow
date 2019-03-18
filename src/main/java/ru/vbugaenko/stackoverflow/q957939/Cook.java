package ru.vbugaenko.stackoverflow.q957939;

import java.util.List;
import java.util.Random;

public class Cook {

    public void cook(List<Food> foods, String title) {
        Food f = new Food(randomTaste(), title);
        foods.add(foods.size(), f);
    }

    private Taste randomTaste() {
        Random rand = new Random();
        int r = rand.nextInt(4);
        Taste t = null;
        switch (r)
        {
            case 0: t = Taste.SWEET;  break;
            case 1: t = Taste.SOUR;   break;
            case 2: t = Taste.SALTY;  break;
            case 3: t = Taste.BITTER; break;
        }
        return t;
    }

}
