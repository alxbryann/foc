package com.alxbryann.foc.model;

import com.alxbryann.foc.view.View;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Controller controller = new Controller();
        Model model = new Model(controller);
        controller.setModel(model);
        View view = new View(controller);

    }
}
