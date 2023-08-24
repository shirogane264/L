package Collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarSetTest {
    private CarSet carSet;
    @Before
    public void setUp() throws Exception {
carSet = new CarHashSet();
        for (int i = 0; i < 100; i++) {
            carSet.add(new Car("Br" + i, i));
        }
    }

    @Test
    public void ifadd3SizeMustbe3() {
        assertEquals(100,carSet.size());
        assertTrue(carSet.add(new Car("BMV", 5)));
        assertFalse(carSet.add(new Car("BMV", 5)));
        assertFalse(carSet.add(new Car("BMV", 5)));
        assertEquals(101,carSet.size());
    }
    @Test
    public void remove() {
        Car car = new Car("BMV", 1);
        carSet.add(car);
        assertTrue(carSet.remove(car));
        assertEquals(100,carSet.size());
        assertFalse(carSet.remove(car));
        assertEquals(100,carSet.size());
    }

    @Test
    public void clear() {
        carSet.clear();
        assertEquals(0,carSet.size());
    }}