package com.weather.ui;

import java.util.Scanner;
import com.weather.presenter.Presenter;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
    }

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        String city = scan();
        presenter.onClick(city);
    }

    @Override
    public void answer(String text) {
        System.out.println(text);
    }

    private String scan() {
        System.out.println("Введите город: ");
        return scanner.nextLine();
    }

}
