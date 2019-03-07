package Selenium;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.*;

public class KidCircleTest {

    @BeforeMethod
    public void setUp() {
    }

    @Test
    public void testGetEliminatedOrder() {
        List<Integer> res1 = KidCircle.getEliminatedOrder(0, 0);
        assertTrue(res1.size() == 0);
        List<Integer> actual = (ArrayList<Integer>) KidCircle.getEliminatedOrder(6, 2);
        List<Integer> expected = Arrays.asList(2, 4, 6, 3, 1, 5);
        assertThat(actual, hasItems(2));
        assertThat(actual, hasItems(4));
        assertThat(actual, hasItems(6));
        assertThat(actual, hasItems(3));
        assertThat(actual, hasItems(1));
        assertThat(actual, hasItems(5));
        assertTrue(actual.get(0) == 2);
        assertTrue(actual.get(1) == 4);
        assertTrue(actual.get(2) == 6);
        assertTrue(actual.get(3) == 3);
        assertTrue(actual.get(4) == 1);
        assertTrue(actual.get(5) == 5);
        assertTrue(KidCircle.lastKidEliminated(6,2) == 5);



    }
            }