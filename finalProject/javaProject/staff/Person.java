package javaProject.staff;

public class Person {
    private String surname;
    private String name;
    private String patronymic;
    private int yearOfBirth;
    private String jobTitle;

    public Person(String surname, String name, String patronymic, int yearOfBirth, String jobTitle) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.yearOfBirth = yearOfBirth;
        this.jobTitle = jobTitle;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString() {
        return "Сотрудник ФИО: " + surname + " " + name + " " + patronymic + ", год рождения: " + yearOfBirth
                + ", должность: " + jobTitle;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        } else if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person pers = (Person) obj;
        return surname.equals(pers.getSurname()) && name.equals(pers.getName())
                && patronymic.equals(pers.getPatronymic()) && yearOfBirth == pers.getYearOfBirth()
                && jobTitle.equals(pers.getJobTitle());
    }
}
