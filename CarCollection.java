package Collections;

public interface CarCollection {
    int size();

    void clear();

    boolean remove(Car car);

    boolean add(Car car);

    boolean contains(Car car);

}
