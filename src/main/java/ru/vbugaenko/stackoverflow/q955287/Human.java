package ru.vbugaenko.stackoverflow.q955287;

import java.util.List;

public class Human {
    private String name;
    public Human() {
        name = "";
    }
    Human (String name) {
        this.name = name;
    }
    void setName(String n) {
        name = n;
    }
    String getName() {
        return name;
    }
    public Food eat(List<Food> foods) {
        Food f = foods.get(foods.size()-1);
        foods.remove(foods.size()-1);
        return f;
    }
}
