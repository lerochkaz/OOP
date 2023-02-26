package ui.commands;

import ui.Console;

public class AddNote extends Command {

    public AddNote(Console console) {
        super(console);
    }

    @Override
    public String description() {
        return "Добавить новую запись";
    }

    @Override
    public void execute() {
        getConsole().addNote();
    }
}
