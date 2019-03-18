package ru.vbugaenko.stackoverflow.q957939;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * JUnit тест для метода
 * https://ru.stackoverflow.com/questions/957939/
 *
 * @since 18.03.2019
 */

public class CookTest {
    private Cook cook;
    private List<Food> foods;

    @Before
    public void prepareData(){
        cook  = new Cook();
        foods = new ArrayList<>();
        cook.cook(foods, "food_1");
    }

    @Test
    public void increaceSize_test() {
        assertTrue(foods.size() == 1);
    }

    @Test
    public void containFoodWithSameTitle_test() {
        assertTrue(foods.get(0).getTitle().equals("food_1"));
    }

    @Test
    public void containFoodWithDifferentTaste_test() {
        for (int i=2; i < 11; i++)
            cook.cook(foods, "food_"+i);
        assertTrue(foods.removeIf(food -> food.getTaste()==Taste.BITTER));
        assertTrue(foods.removeIf(food -> food.getTaste()==Taste.SALTY));
        assertTrue(foods.removeIf(food -> food.getTaste()==Taste.SOUR));
        assertTrue(foods.removeIf(food -> food.getTaste()==Taste.SWEET));
    }

}
