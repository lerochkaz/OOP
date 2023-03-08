package javaProject.view;

import java.util.ArrayList;
import java.util.List;
import javaProject.options.Add;
import javaProject.options.Delete;
import javaProject.options.Option;
import javaProject.options.Print;
import javaProject.options.Search;
import javaProject.staff.Base;
import javaProject.staff.EmployeeBase;

public class Menu {
    private List<Option> commands;
    private Base base;

    public Menu() {
        base = new EmployeeBase();
        commands = new ArrayList<>();
        commands.add(new Add(base));
        commands.add(new Delete(base));
        commands.add(new Search(base));
        commands.add(new Print(base));
    }

    public void execut(int num) {
        Option option = commands.get(num);
        option.perform();
    }

    public String getMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append("- ");
            stringBuilder.append(commands.get(i).description());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
