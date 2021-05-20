package Lection06;

public class ZOO {

    public static void main(String[] args) {
        String tempWinEvent = "получилось";
        String tempLossEvent = "не получилось";
        String eventName;
        String eventResult;

        Cat cat1 = new Cat("Ночка", 3, 1);
        Cat cat2 = new Cat("Черныш", 4, 1);
        Dog dog1 = new Dog("Жуля", 10, 15);
        Dog dog2 = new Dog("Аякс", 25, 30);
        Animal[] animals = {cat1, cat2, dog1, dog2};

        float runLength = 400;
        float swimLength = 150;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getType() + " " + animals[i].getName () + "может";

            eventName = "пробежать на" + animals[i].getMaxRun() + "Пытается пробежать на";
            eventResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;

            int swimResult = animals[i].swim(swimLength);
            eventName = "проалыть на" + animals[i].getMaxSwim() + "Пытается проплыть на";
            eventResult = (swimResult == animals[i].SWIM_OK)? tempWinEvent : tempLossEvent;

            if (swimResult == animals[i].SWIM_NONE)
                eventResult = " не умеет плавать";
            result(nameString, eventName, swimLength, eventResult);

        }
        System.out.println("All animals = " + Animal.countAnimal + "> cat count" + Cat.countCat + " > dog count =" + Dog.countDog);
    }

    private static void result(String namAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(namAnimal + event + eventLength + "м и" + resultEvent);
    }
}
