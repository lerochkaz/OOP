package javaProject.staff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeBase implements Base, Iterable<Person> {
    private List<Person> employeesList;
    private int amount;
    private Request request;

    public EmployeeBase() {
        employeesList = new ArrayList<>();
        request = new Request();
    }

    public int getAmount() {
        return amount;
    }

    public void addPerson() {
        String[] fullName = request.requestFullName().split(" ");
        Person newPerson = new Person(fullName[0], fullName[1], fullName[2], request.requestYearOfBirth(),
                request.requestJobTitle());
        employeesList.add(newPerson);
        amount++;
    }

    public void deletePerson() {
        Person person = searchByFullName();
        if (person == null) {
            System.out.println("Сотрудник не найден");
        } else {
            employeesList.remove(person);
            amount--;
        }
    }

    public void searchPerson() {
        if (checkBase()) {
            Person person = searchByFullName();
            if (person == null) {
                System.out.println("Сотрудник не найден");
            } else {
                System.out.println(person);
            }
        }
    }

    private Person searchByFullName() {
        String[] fullName = request.requestFullName().split(" ");
        Person foundPerson = null;
        for (Person person : employeesList) {
            if (fullName[0].equals(person.getSurname()) && fullName[1].equals(person.getName())
                    && fullName[2].equals(person.getPatronymic())) {
                foundPerson = person;
            }
        }
        return foundPerson;
    }

    public void printBase() {
        if (checkBase()) {
            System.out.println("Колличество сотрудников: " + getAmount());
            for (Person person : employeesList) {
                System.out.println(person);
            }
        }

    }

    @Override
    public Iterator<Person> iterator() {
        return employeesList.iterator();
    }

    private boolean checkBase() {
        if (getAmount() < 1) {
            System.out.println("Нет ни одного сотрудника");
            return false;
        } else {
            return true;
        }
    }

}
