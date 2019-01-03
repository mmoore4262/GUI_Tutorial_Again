package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class SampleController {
    public Label helloWorld;
    public Label timey;
    public int clix=0;


    public void sayHelloWorld(ActionEvent actionEvent) {
        clix++;
        helloWorld.setText("Hello World!" + "\n"+ "Number of times you've clicked this button "+ clix);
        timey.setText("Time should be here G");
        countDown(clix);
    }

    public void countDown(int clix)
    {
        if (clix==0)
        {
            
            long now=System.nanoTime();
        }
        else
        {

        }
    }
    public void count (ActionEvent actionEvent)
    {

    }
}
