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
public class BounceInRightAnimation extends AnimationFX {
    public BounceInRightAnimation(Node node) {
        this(node, 300);
    }
    
    public BounceInRightAnimation(Node node, double width) {
        super(node);
        
        double startX = width;
        
        this.timeline = new Timeline(
               new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                    new KeyValue(node.translateXProperty(), startX, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(600),    
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                    new KeyValue(node.translateXProperty(), -30, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(800),    
                    new KeyValue(node.translateXProperty(), 10, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.translateXProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
