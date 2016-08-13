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
public class BounceAnimation extends AnimationFX {
    public BounceAnimation(Node node) {
        this(node, 100);
    }
    
    public BounceAnimation(Node node, double height) {
        super(node);
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),     new KeyValue(node.translateYProperty(),     0, WEB_EASE)),
                new KeyFrame(Duration.millis(200),   new KeyValue(node.translateYProperty(),     0, WEB_EASE)),
                new KeyFrame(Duration.millis(400),   new KeyValue(node.translateYProperty(), -0.30 * height, WEB_EASE)),
                new KeyFrame(Duration.millis(500),   new KeyValue(node.translateYProperty(),     0, WEB_EASE)),
                new KeyFrame(Duration.millis(600),   new KeyValue(node.translateYProperty(), -0.15 * height, WEB_EASE)),
                new KeyFrame(Duration.millis(800),   new KeyValue(node.translateYProperty(),     0, WEB_EASE)),
                new KeyFrame(Duration.millis(1000),  new KeyValue(node.translateYProperty(),     0, WEB_EASE))
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
