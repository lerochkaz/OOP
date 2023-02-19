import java.util.Iterator;

public class program {
    public static void main(String[] args) {
        FamilyTree family = new FamilyTree();
        Human Galina = new Human("Галина", "женщина", 1941);
        Human Alexey = new Human("Алексей", "мужчина", 1940);
        Human Ludmila = new Human("Людмила", "женщина", 1970, Galina, Alexey);
        Human Andrey = new Human("Андрей", "мужчина", 2000, Ludmila, null);
        Human Valeria = new Human("Валерия", "женщина", 1995, Ludmila, null);
        family.add(Galina);
        family.add(Alexey);
        family.add(Ludmila);
        family.add(Andrey);
        family.add(Valeria);

        // Итератор. Вариант 1:
        Iterator<Human> iterator = family.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getInfo());
        }

        family.sortByAge();
        System.out.println("\n Сортировка по возрасту:");

        // Итератор. Вариант 2:
        for (Human human : family) {
            System.out.println(human.getInfo());
        }

        family.sortByName();
        System.out.println("\n Сортировка по имени:");

        for (Human human : family) {
            System.out.println(human.getInfo());
        }
    }

}
