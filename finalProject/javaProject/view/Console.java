package javaProject.view;

import java.util.Scanner;

public class Console implements View {
    private Scanner scanner;
    private Menu menu;
    private final String FINISH = "end";

    @Override
    public void start() {
        scanner = new Scanner(System.in);
        menu = new Menu();
        printWelcome();
        while (true) {
            printMenu();
            String input = scanner.nextLine();
            if (input.equals(FINISH)) {
                scanner.close();
                break;
            }

            menu.execut(Integer.parseInt(input) - 1);

        }
    }

    private void printWelcome() {
        System.out.println(
                "Добро пожаловать в кадровую систему!\nЯ помогу вести учет сотрудников.\nДля завершения программы введите \""
                        + FINISH + "\"");
    }

    private void printMenu() {
        System.out.println(menu.getMenu());
    }

}