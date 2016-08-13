package zunayedhassan.AnimateFX;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 *
 * @author Zunayed Hassan
 */
public class FadeOutAnimation extends AnimationFX {
    public FadeOutAnimation(Node node) {
        super(node);
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    new KeyValue(node.opacityProperty(), 1, WEB_EASE)),
                new KeyFrame(Duration.millis(1000),  new KeyValue(node.opacityProperty(), 0, WEB_EASE))
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
