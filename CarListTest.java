package Collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarListTest {
    private CarList carlist;

    @Before
    public void setUp() throws Exception {
        carlist = new CarArrayList();
        for (int i = 0; i < 100; i++) {
            carlist.add(new Car("Br" + i, i));
        }
    }

    @Test
    public void contains() {
        Car car1 = new Car("vc", 12);
        Car car2 = new Car("vas", 10);
        carlist.add(car1);
        assertTrue(carlist.contains(car1));
        assertFalse(carlist.contains(car2));
    }

    @Test
    public void contains2(){
        Car car = new Car("BVv", 1);
        carlist.add(car, 2);
        assertTrue(carlist.contains(car));
        System.out.println(carlist.size());
        carlist.remove(car);
        System.out.println(carlist.size());
        assertFalse(carlist.contains(car));
        assertFalse(carlist.contains(new Car("Brand200", 20)));
    }

    @Test
    public void ThenAdded100ElementsThenSizeMustBe100() {
        assertEquals(100, carlist.size());
    }

    @Test
    public void kogdaudalimMustbe99() {
        assertTrue(carlist.removeAt(1));
        assertEquals(99, carlist.size());
    }

    @Test
    public void kogdadobadobaviliwithindexMustbe101EL() {
        Car car = new Car("BVv", 1);
        carlist.add(car, 50);
        Car s = carlist.get(50);
        assertEquals("BVv", s.getBrend());
        assertEquals(101, carlist.size());
        assertTrue(carlist.contains(car));
    }

    @Test
    public void kogdaudalMusBe() {
        Car car = new Car("v" + 3, 1);
        carlist.add(car);
        assertTrue(carlist.remove(car));
        assertEquals(100, carlist.size());
    }

    @Test
    public void dolverfalse() {
        Car car = new Car("v" + 3, 1);
        assertFalse(carlist.remove(car));
    }

    @Test
    public void cleara() {
        carlist.clear();
        assertEquals(0, carlist.size());
    }

    @Test
    public void getsizeproof() {
        boolean ex = false;
        try {
            carlist.get(202);
        } catch (Exception e) {
            ex = true;
        }
        assertTrue(ex);
    }

}