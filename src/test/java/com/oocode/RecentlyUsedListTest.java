package com.oocode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RecentlyUsedListTest {
    @Test
    public void isEmpty() {
        RecentlyUsedList list = new RecentlyUsedList();
        assertEquals(list.retrieveMostRecent(), null);
    }

    @Test
    public void addingOneItem() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("TestItem");
        assertEquals(list.retrieveMostRecent(), "TestItem");
    }

    @Test
    public void addingTwoItems() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("TestItem");
        list.addItem("TestItem2");
        assertEquals(list.retrieveMostRecent(), "TestItem2");
    }

    @Test
    public void retrieveItemFromListUsingIndex() throws WrongIndexException {
        RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("TestItem");
        list.addItem("TestItem2");
        list.addItem("TestItem3");
        list.addItem("TestItem2");
        assertEquals(list.retrieveItem(1), "TestItem3");
        assertEquals(list.retrieveItem(0), "TestItem2");
        assertEquals(list.retrieveItem(100), null);
    }

    @Test
    public void retrieveItemFromListUsingNegativeIndex() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("TestItem");
        assertThrows(WrongIndexException.class, () -> {list.retrieveItem(-1);});
    }

    @Test
    public void moveDuplicatesUponInsertion() throws WrongIndexException {
        RecentlyUsedList list = new RecentlyUsedList();
        list.addItem("TestItem");
        list.addItem("TestItem2");
        list.addItem("TestItem3");
        list.addItem("TestItem2");
        assertEquals(list.retrieveItem(2), "TestItem");
        assertEquals(list.retrieveItem(1), "TestItem3");
        assertEquals(list.retrieveItem(0), "TestItem2");
    }

}
