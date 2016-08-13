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
public class BounceInUpAnimation extends AnimationFX {
    public BounceInUpAnimation(Node node) {
        this(node, 300);
    }
    
    public BounceInUpAnimation(Node node, double width) {
        super(node);
        
        double startY = width;
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                    new KeyValue(node.translateYProperty(), startY, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(600),    
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                    new KeyValue(node.translateYProperty(), -30, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(800),    
                    new KeyValue(node.translateYProperty(), 10, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.translateYProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
