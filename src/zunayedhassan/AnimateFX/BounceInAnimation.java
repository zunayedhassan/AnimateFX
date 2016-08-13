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
public class BounceInAnimation extends AnimationFX {
    public BounceInAnimation(Node node) {
        super(node);
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                    new KeyValue(node.scaleXProperty(), 0.3, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 0.3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(500),    
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                    new KeyValue(node.scaleXProperty(), 1.05, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.05, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(700),    
                    new KeyValue(node.scaleXProperty(), 0.9, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 0.9, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.scaleXProperty(), 1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
