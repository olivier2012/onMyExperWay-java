/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstgui;

import javafx.event.Event;
import javafx.event.EventHandler;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author olivier-h
 */
public  class  myEventHandler implements EventHandler<Event> {
 private static  int EventCount=0;
 
 public int getEventCount(){
          return EventCount ;
        }

    @Override
    public void handle(Event event) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
