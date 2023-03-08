package javaProject.options;

import javaProject.staff.Base;

public class Print extends Option {

    public Print(Base base) {
        super(base);
    }

    @Override
    public void perform() {
        base.printBase();
    }

    @Override
    public String description() {
        return "Показать список сотрудников";
    }

}