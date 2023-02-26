package presenter;

import ui.View;

public class Presenter {

    private View view;

    public Presenter(View view) {
        this.view = view;
        view.setPresenter(this);
    }

    public void addNote(String nextLine) {
        System.out.println("презентер работает");
    }
}
