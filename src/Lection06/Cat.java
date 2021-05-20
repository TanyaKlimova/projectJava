package Lection06;

public class Cat extends Animal {
    public static int countCat = 0;

    public Cat(String name, float maxRun, float maxSwim) {
        super("Кошка", name, maxRun, maxSwim);
        ++countCat;
    }

    @Override
    public int swim(float distance) {
        return Animal.SWIM_NONE;
    }
}
