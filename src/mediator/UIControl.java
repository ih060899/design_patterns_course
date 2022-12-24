package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {
//    protected DialogBox owner;
//
//    public UIControl(DialogBox owner) {
//        this.owner = owner;
//    }
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer){
        eventHandlers.add(observer);
    }

    protected void notifyEventHandlers(){
        eventHandlers.forEach(EventHandler::update);
    }
}
