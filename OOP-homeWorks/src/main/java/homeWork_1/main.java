package homeWork_1;

public class main {
    public static void main(String[] args) {
        Person irina = new Person("Ирина", 56);
        Person igor = new Person("Игорь", 60);
        Person vasya = new Person("Вася", 30);
        Person masha = new Person("Маша", 27);
        Person jane = new Person("Женя", 10);
        Person ivan = new Person("Ваня", 8);
        Person Sasha = new Person("Саша", 9);
        Person Sasha10 = new Person("Саша", 10);
        Person Sasha11 = new Person("Саша", 11);
        Person Sasha12 = new Person("Саша", 12);
        Person Sasha3 = new Person("Саша", 3);
        GeoTree gt = new GeoTree();
        gt.setPerentChild(irina, vasya); // Ирина родитель Васи
        gt.setPerentChild(irina, masha); // Ирина родитель Маши
        gt.setPerentChild(vasya, jane); // Вася родитель Жени
        gt.setPerentChild(vasya, ivan); // Вася родитель Ивана
        gt.setWifeHusband(irina, igor); // Ирина жена Игоря
        gt.setPerentChild(igor, vasya); // Игорь родитель Васи
        gt.setPerentChild(igor, masha); // Игорь родитель Маши
        gt.setPerentChild(igor, Sasha); // Игорь родитель Саши
        gt.setPerentChild(igor, Sasha10); // Игорь родитель Саши
        gt.setPerentChild(igor, Sasha3); // Игорь родитель Саши

        // Ищем детей Ирины
        System.out.println("Дети Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.parent));
        // Ищем детей Игоря
        System.out.println("Дети Игоря");
        System.out.println(new Research(gt).spend(igor, Relationship.parent));

        // Ищем мужа Ирины (Чья жена Ирина?)
        System.out.println("Муж Ирины");
        System.out.println(new Research(gt).spend(irina, Relationship.wife));

        // Ищем людей определенного возраста
        System.out.println(new Research(gt).searchAge());
    }
}
