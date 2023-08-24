package Collections;

import java.util.Arrays;

public class CarArrayList implements CarList {
    private Car[] array = new Car[10];
    private int size = 0;

    @Override
    public boolean contains(Car car) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Car car, int index) {
        if (size + 1 >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        for (int i = index + 1; i < size; i++) {
            array[i] = array[i + 1];
        }
        size++;
        array[index] = car;
        return true;
    }

    @Override
    public Car get(int index) {
        chekIndex(index);
        return array[index];
    }

    @Override
    public boolean add(Car car) {
        if (size >= array.length) {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = car;
        size++;
        return true;

    }

    @Override
    public boolean remove(Car car) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(car)) {
                return removeAt(i);
            }
        }
        return false;
    }

    @Override
    public boolean removeAt(int index) {
        chekIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        array = new Car[10];
        size = 0;
    }

    private void chekIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
    }
}
