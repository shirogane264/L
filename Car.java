package Collections;

import java.util.Objects;

public class Car {
    private String brend;
    private int number;

    public String getBrend() {
        return brend;
    }

    public int getNumber() {
        return number;
    }

    public Car(String brend, int number) {
        this.brend = brend;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number && Objects.equals(brend, car.brend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brend, number);
    }
}
