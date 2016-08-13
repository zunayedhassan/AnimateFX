package zunayedhassan;

import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

/**
 *
 * @author Zunayed Hassan
 */
public class CustomFlowPane extends FlowPane {
    public CustomFlowPane() {
        this.setAlignment(Pos.CENTER);
        this.setVgap(5);
        this.setHgap(5);
    }
}
