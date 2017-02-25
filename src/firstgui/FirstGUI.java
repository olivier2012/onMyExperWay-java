/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author olivier-h
 */
public class FirstGUI extends Application {
    
    @Override
    public void start(Stage primaryStage) {
   
        myJFrame myJ = new myJFrame();
        myJ.setAlwaysOnTop(true);
        myJ.setVisible(true);
        
        Button btn = new Button();
        btn.setText("myJFrame class has "+ myJFrame.getMyJFrameCount()+" instances");
        
        btn.setOnAction(new EventHandler<ActionEvent>() {
            private int clickCount;
 
            
            @Override
            public void handle(ActionEvent event) {
                clickCount ++ ;
                System.out.println("Say 'Hello World'" + clickCount);
                myJ.setVisible(true);
            }
        });
        

        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
      //  scene.windowProperty().addListener(listener);
        
        primaryStage.setTitle("Hello World!" );
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
