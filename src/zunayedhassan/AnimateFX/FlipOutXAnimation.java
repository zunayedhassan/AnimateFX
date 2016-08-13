package zunayedhassan.AnimateFX;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.geometry.Point3D;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 *
 * @author Zunayed Hassan
 */
public class FlipOutXAnimation extends AnimationFX {
    public FlipOutXAnimation(Node node) {
        super(node);
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0), 
                    new KeyValue(node.rotateProperty(), 0, WEB_EASE),
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000), 
                    new KeyValue(node.rotateProperty(), -90, WEB_EASE),
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
    
    @Override
    public void Play() {
        this.node.setRotationAxis(Point3D.ZERO);
        this.node.setRotationAxis(Rotate.X_AXIS);
        super.Play();
    }
}
