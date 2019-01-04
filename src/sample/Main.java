package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.awt.*;
import java.awt.event.ActionEvent;
brgergergrtgergwergergerergergergerrgrgerger
public class
Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

   /* public void start(Stage primaryStage)
    {
        primaryStage.setTitle("Clickerizer!");
        Button btn = new Button();
        Text txt=new Text (10,0,"Click Score");
        boolean scoring=true;
        int score=0;

        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event)
            {
                if (scoring)
                {
                    score++;
                } else {
                    score--;
                }
            }
        });
         long timeStep=System.nanoTime()+1000000000L;
         new AnimationTimer()
         {
             public void handle(long now)
             {
                 if (now>timeStep)
                 {
                     timeStep=now+1000000000L;
                     scoring=!scoring;
                 }
                 if (!scoring)
                 {
                     btn.setText("Don't Click");
                 }
                 else
                 {
                     btn.setText("ClickMe!");
                 }
                 txt.setText("Score:"+ Integer.toString(score));
             }
         }.start();
        StackPane root = new StackPane();
        HBox hbox = new HBox();
        hbox.getChildren().addAll(btn.txt);
    }*/


    public static void main(String[] args) {
        launch(args);
    }
}
