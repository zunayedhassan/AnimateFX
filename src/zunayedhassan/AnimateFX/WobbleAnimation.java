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
public class WobbleAnimation extends AnimationFX {
    public WobbleAnimation(Node node) {
        this(node, 200);
    }
    
    public WobbleAnimation(Node node, double width) {
        super(node);
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.translateXProperty(), 0, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 0, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(150),    
                    new KeyValue(node.translateXProperty(), -0.25 * width, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -5, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(300),    
                    new KeyValue(node.translateXProperty(), 0.2 * width, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(450),    
                    new KeyValue(node.translateXProperty(), -0.15 * width, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(600),    
                    new KeyValue(node.translateXProperty(), 0.1 * width, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 2, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(750),    
                    new KeyValue(node.translateXProperty(), -0.05 * width, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -1, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.translateXProperty(), 0, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
