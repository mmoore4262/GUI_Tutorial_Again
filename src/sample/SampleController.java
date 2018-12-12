package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label helloWorld;
    public int clix=0;


    public void sayHelloWorld(ActionEvent actionEvent) {
        clix++;
        helloWorld.setText("Hello World!" + "\n"+ "Number of times you've clicked this button "+ clix);

    }

    public void count (ActionEvent actionEvent)
    {

    }
}
