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
public class RollInAnimation extends AnimationFX {
    public RollInAnimation(Node node) {
        this(node, 300);
    }
    
    public RollInAnimation(Node node, double width) {
        super(node);
		
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                    new KeyValue(node.translateXProperty(), -width, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -120, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                    new KeyValue(node.translateXProperty(), 0, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
