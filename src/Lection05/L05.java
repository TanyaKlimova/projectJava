package Lection05;

public class L05 {
    public static void main(String[] args) {
        Person mainEmployee = new Person("Татьяна", "Яковлевна", "Климова", "8(000)000-00-00", "Экономист1", 50000, 1983);
        Person[] office = {
                mainEmployee,
                new Person("Иван", "Иванович", "Иванов", "8(111)111-11-11", "Экономист2", 40000, 1973),
                new Person("Федора", "Федоровна", "Федорова", "8(111)111-11-12", "Экономист3", 30000, 1963),
                new Person("Сидор", "Сидорович", "Сидоров", "8(111)111-11-13", "Экономист4", 20000, 1953),
                new Person("Мария", "Максимовна", "Максимова", "8(111)111-11-14", "Экономист5", 10000, 1943),
        };
        getAllPersonsInoffice(office);

        getoldPersons(office, 40);
    }

    private static void getAllPersonsInoffice(Person[] office) {
        System.out.println("All persons: ");
        for (int i = 0; i < office.length; i ++)
            System.out.println((i + 1) + " " + office[i].getFullInfo());
    }

    private static void getoldPersons(Person[] office, int year){
        for (int i = 0; i < office.length; i ++)
            if (office[i].getAge() > year)
                System.out.println(office[i].getFullInfo());
    }
}
