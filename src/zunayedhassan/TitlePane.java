package zunayedhassan;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 *
 * @author Zunayed Hassan
 */
public class TitlePane extends Label {
    public TitlePane(String title) {
        super(title);
        this.getStyleClass().add("title-label");
    }
}
