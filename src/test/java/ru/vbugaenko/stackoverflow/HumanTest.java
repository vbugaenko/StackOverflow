package ru.vbugaenko.stackoverflow;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * JUnit тест для метода
 * https://ru.stackoverflow.com/questions/955287/
 *
 * @since 12.03.2019
 */

public class HumanTest {
    private static List<Food> list;
    private static Human human = new Human();

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
    public void eatRemoveLastFoodFromList() {
        human.eat(list);
        assertFalse(list.contains(new Food("fish")));
        assertTrue(list.size() == 2);
    }

    /**
     * Предложено другим человеком:
     * Нужно проверить:
     * - что размер списка уменьшился на единицу,
     * - что съеден именно последний объект,
     * - что съеденный объект больше не в списке:
     * */
    @Test
    public static void testEatMethod() {
        int size = list.size();
        Food foodToBeDeleted = list.get(list.size() - 1);
        Food foodDeleted = human.eat(list);
        assertEquals(foodDeleted, foodToBeDeleted);
        assertEquals(list.size(), size - 1);
        assertFalse(list.contains(foodToBeDeleted));
    }

}