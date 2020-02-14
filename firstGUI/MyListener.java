import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyListener implements EventHandler<ActionEvent> {

	@Override
	public void handle(ActionEvent eventOBJ) {
		System.out.println("Event accured");

	}

}
