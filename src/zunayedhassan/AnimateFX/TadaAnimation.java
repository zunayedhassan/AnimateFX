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
public class TadaAnimation extends AnimationFX {
    public TadaAnimation(Node node) {
        super(node);
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.scaleXProperty(), 1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 0, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(100),    
                    new KeyValue(node.scaleXProperty(), 0.9, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 0.9, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(200),    
                    new KeyValue(node.scaleXProperty(), 0.9, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 0.9, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(300),    
                    new KeyValue(node.scaleXProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(400),    
                    new KeyValue(node.scaleXProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(500),    
                    new KeyValue(node.scaleXProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(600),    
                    new KeyValue(node.scaleXProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(700),    
                    new KeyValue(node.scaleXProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(800),    
                    new KeyValue(node.scaleXProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), -3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(900),    
                    new KeyValue(node.scaleXProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1.1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 3, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.scaleXProperty(), 1, WEB_EASE),
                    new KeyValue(node.scaleYProperty(), 1, WEB_EASE),
                    new KeyValue(node.rotateProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
