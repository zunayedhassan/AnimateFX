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
public class BounceOutLeftAnimation extends AnimationFX {
    public BounceOutLeftAnimation(Node node) {
        this(node, 300);
    }
    
    public BounceOutLeftAnimation(Node node, double width) {
        super(node);
        
        double endX = -width;
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.translateXProperty(), 0, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(200),    
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                    new KeyValue(node.translateXProperty(), 20, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                    new KeyValue(node.translateXProperty(), endX, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
