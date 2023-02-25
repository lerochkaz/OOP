package com.weather.ui;

import javax.swing.*;

import com.weather.presenter.Presenter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DesktopUI extends JFrame implements View {
    private Label ICity;
    private JTextArea answer, zero;
    private TextField city;
    private Button findInfo;
    private Presenter presenter;

    @Override
    public void setPresenter(Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void start() {
        setSize(400, 600);
        ICity = new Label("город: ");
        answer = new JTextArea();
        zero = new JTextArea();
        findInfo = new Button("Узнать погоду");
        city = new TextField();

        setLayout(new GridLayout(3, 2));
        add(ICity);
        add(city);
        add(answer);
        add(zero);
        add(findInfo);

        findInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                presenter.onClick(city.getText());
            }
        });

        setVisible(true);
    }

    @Override
    public void answer(String answer) {
        this.answer.setText(answer);
    }

}
