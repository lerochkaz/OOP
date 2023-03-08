package javaProject.options;

import javaProject.staff.Base;

public class Delete extends Option {

    public Delete(Base base) {
        super(base);
    }

    @Override
    public void perform() {
        base.deletePerson();
        System.out.println("Удаление окончено");
    }

    @Override
    public String description() {
        return "Удалить сотрудника";
    }

}
