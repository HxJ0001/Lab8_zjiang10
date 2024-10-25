package com.example.lab8;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * Creates a mock list for testing.
     * @return an empty CustomList
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Before
    public void setUp() {
        list = MockCityList();
    }

    /**
     * Tests adding a city to the list.
     * Checks if the size of the list increases by one after addition.
     */
    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
}
