package javaProject.options;

import javaProject.staff.Base;

public abstract class Option implements Performable {
    protected Base base;

    public Option(Base base) {
        this.base = base;
    }

}
