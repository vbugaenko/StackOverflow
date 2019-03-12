package ru.vbugaenko.stackoverflow;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit тест для метода
 * https://ru.stackoverflow.com/questions/955287/
 *
 * @since 12.03.2019
 */

public class HumanTest {
    List<Food> list;

    @Before
    public void prepareList(){
        list = new ArrayList<>();
        list.add(new Food("meat"));
        list.add(new Food("fruits"));
        list.add(new Food("fish"));
    }

    @Test
    public void eatReturnLastFoodFromList() {

    }

    @Test
    public void eatRemovLastFoodFromList() {
        Human h = new Human();
        h.eat(list);
        assertFalse(list.contains(new Food("fish")));
        assertTrue(list.size() == 2);
    }

}