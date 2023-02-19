import java.util.ArrayList;
import java.util.List;

public class Human implements Comparable<Human> {
    private String name;
    private Gender gender;
    private int yearOfBirth;
    private Human mother;
    private Human father;
    private List<Human> children;

    public Human(String name, String gender, int yearOfBirth, Human mother, Human father) {
        this.name = name;
        this.gender = Gender.getGender(gender);
        this.yearOfBirth = yearOfBirth;
        this.mother = mother;
        this.father = father;
        children = new ArrayList<>();
    }

    public Human(String name, String gender, int yearOfBirth) {
        this(name, gender, yearOfBirth, null, null);
    }

    public String getName() {
        return name;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public boolean addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
            return true;
        }
        return false;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("имя: ");
        sb.append(name);
        sb.append(", год рождения: ");
        sb.append(yearOfBirth);
        sb.append(", ");
        sb.append(getMotherInfo());
        sb.append(", ");
        sb.append(getFatherInfo());
        sb.append(", ");
        sb.append(getChildrenInfo());
        return sb.toString();
    }

    public String getMotherInfo() {
        String res = "мать: ";
        if (mother != null) {
            res += mother.getName();
        } else {
            res += "неизвестна";
        }
        return res;
    }

    public String getFatherInfo() {
        String res = "отец: ";
        if (father != null) {
            res += father.getName();
        } else {
            res += "неизвестен";
        }
        return res;
    }

    public String getChildrenInfo() {
        StringBuilder res = new StringBuilder();
        res.append("дети: ");
        if (children.size() != 0) {
            res.append(children.get(0).getName());
            for (int i = 1; i < children.size(); i++) {
                res.append(", ");
                res.append(children.get(i).getName());
            }
        } else {
            res.append("отсутсвуют");
        }
        return res.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Human)) {
            return false;
        }
        Human human = (Human) obj;
        return human.getName().equals(getName());
    }

    @Override
    public int compareTo(Human o) {
        if (yearOfBirth > o.getYearOfBirth()) {
            return 1;
        } else if (yearOfBirth < o.getYearOfBirth()) {
            return -1;
        } else {
            return 0;
        }

        // return ((Integer) yearOfBirth).compareTo((Integer) o.getYearOfBirth());
    }
}
