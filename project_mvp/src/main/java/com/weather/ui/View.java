package com.weather.ui;

import com.weather.presenter.Presenter;

public interface View {
    void setPresenter(Presenter presenter);

    void start();

    void answer(String string);
}
