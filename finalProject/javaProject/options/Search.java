package javaProject.options;

import javaProject.staff.Base;

public class Search extends Option {

    public Search(Base base) {
        super(base);
    }

    @Override
    public void perform() {
        base.searchPerson();
        System.out.println("Поиск окончен");
    }

    @Override
    public String description() {
        return "Найти сотрудника";
    }

}
