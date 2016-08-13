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
public class FadeInDownBigAnimation extends AnimationFX {
    public FadeInDownBigAnimation(Node node) {
        this(node, 300);
    }
    
    public FadeInDownBigAnimation(Node node, double height) {
        super(node);
        
        double startY = -height;
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                    new KeyValue(node.translateYProperty(), startY, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                    new KeyValue(node.translateYProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
}
