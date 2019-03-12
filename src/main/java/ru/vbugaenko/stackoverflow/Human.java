package ru.vbugaenko.stackoverflow;

import java.util.List;

/**
 * JUnit тест для метода
 * https://ru.stackoverflow.com/questions/955287/
 *
 * @since 12.03.2019
 */

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
