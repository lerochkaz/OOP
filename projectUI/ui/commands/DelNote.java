package ui.commands;

import ui.Console;

public class DelNote extends Command {

    public DelNote(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Удалить запись";
    }

    @Override
    public void execute() {
        System.out.println("Удаляю...");
    }
}
