package javaProject.options;

import javaProject.staff.Base;

public class Add extends Option {

    public Add(Base base) {
        super(base);
    }

    @Override
    public void perform() {
        base.addPerson();
        System.out.println("Сотрудник добавлен");
    }

    @Override
    public String description() {
        return "Добавить сотрудника";
    }
}
