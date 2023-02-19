import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Human> {
    private List<Human> humanList;

    public FamilyTree() {
        humanList = new ArrayList<>();
    }

    public boolean add(Human human) {
        if (human == null) {
            return false;
        }
        if (!humanList.contains(human)) {
            humanList.add(human);
            if (human.getMother() != null) {
                human.getMother().addChild(human);
            }
            if (human.getFather() != null) {
                human.getFather().addChild(human);
            }
            return true;
        }
        return false;
    }

    public Human getByName(String name) {
        for (Human human : humanList) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;
    }

    // Реализация сортировки. Вариант 1
    public void sortByAge() {
        Collections.sort(humanList);
    }

    // Реализация сортировки. Вариант 2
    public void sortByName() {
        Collections.sort(humanList, new FamilyComparatorByName());
    }

    @Override
    public Iterator<Human> iterator() {
        return new FamilyIterator(humanList);
    }

}