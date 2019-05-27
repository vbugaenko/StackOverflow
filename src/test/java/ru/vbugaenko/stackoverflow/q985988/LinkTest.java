package ru.vbugaenko.stackoverflow.q985988;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * JUnit тест для метода
 * https://ru.stackoverflow.com/questions/985988/
 *
 * @since 27.05.2019
 */

public class LinkTest {
    private Link<String> linkList;

    private final String e0 = "Test";
    private final String e1 = "Zero";
    private final String e2 = "One";
    private final String e3 = "Two";

    private final String str = "Test";

    private LinkedList<String> lltheSameElems;
    private LinkedList<String> lldiffElems;

    @Before
    public void prepare_data(){
        linkList = new Link<>();
        linkList.addByIndex(0, e0);
        linkList.addByIndex(1, e1);
        linkList.addByIndex(2, e2);
        linkList.addByIndex(3, e3);

        lltheSameElems = new LinkedList<>();
        lltheSameElems.add(0, e0);
        lltheSameElems.add(1, e1);
        lltheSameElems.add(2, e2);
        lltheSameElems.add(3, e3);

        lldiffElems = new LinkedList<>();
        lldiffElems.addFirst(str);
    }

    @Test
    public void linkList_ContainsAllAddedElements_test() {
        assertEquals(4, linkList.size());
        assertEquals(e0, linkList.get(0));
        assertEquals(e1, linkList.get(1));
        assertEquals(e2, linkList.get(2));
        assertEquals(e3, linkList.get(3));
    }

    @Test
    public void true_ifListsHaveTheSameElements_test() {
        //test for confirm that actually lists have the same elements
        assertEquals(linkList.size(), lltheSameElems.size());

        for(int i = 0; i<linkList.size(); i++)
            assertEquals(linkList.get(i), lltheSameElems.get(i));

        //test
        assertTrue(lltheSameElems.equals(linkList));
        assertTrue(linkList.equals(lltheSameElems));
    }

    @Test
    public void false_ifListsHaveDifferentElements_test() {
        assertNotEquals(linkList, lldiffElems);
    }



}