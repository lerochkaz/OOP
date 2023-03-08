package javaProject.staff;

import java.util.Scanner;

public class Request {
    private Scanner scanner;

    public Request() {
        this.scanner = new Scanner(System.in);
    }

    public String requestFullName() {
        System.out.println("Введите ФИО через пробел: ");
        return scanner.nextLine();
    }

    public String requestSurname() {
        System.out.println("Введите фамилию: ");
        return scanner.nextLine();
    }

    public String requestName() {
        System.out.println("Введите имя: ");
        return scanner.nextLine();
    }

    public String requestPatronymic() {
        System.out.println("Введите отчество: ");
        return scanner.nextLine();
    }

    public int requestYearOfBirth() {
        System.out.println("Введите год рождения: ");
        String yearOfBirth = scanner.nextLine();
        return Integer.parseInt(yearOfBirth);
    }

    public String requestJobTitle() {
        System.out.println("Введите должность: ");
        return scanner.nextLine();
    }

}
