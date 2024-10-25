package com.example.lab8;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
            public CustomList MockCityList(){
            CustomList list = new CustomList(null, new ArrayList<>());
            return list;
    }

    @Before
    public void setUp() {
        list = MockCityList();
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    @Test
    public void testHasCity() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        assertFalse(list.hasCity(city)); // Should be false initially

        list.addCity(city);
        assertTrue(list.hasCity(city)); // Should be true after adding
    }

}
