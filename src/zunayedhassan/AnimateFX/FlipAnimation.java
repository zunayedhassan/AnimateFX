package zunayedhassan.AnimateFX;

import javafx.animation.Interpolator;
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
public class FlipAnimation extends AnimationFX {
    public FlipAnimation(Node node) {
        super(node);
        
        this.node = node;
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0), 
                    new KeyValue(node.rotateProperty(), 0, Interpolator.EASE_OUT),
                    new KeyValue(node.translateZProperty(), 0, Interpolator.EASE_OUT)
                ),
                new KeyFrame(Duration.millis(400), 
                    new KeyValue(node.translateZProperty(), -150, Interpolator.EASE_OUT),
                    new KeyValue(node.rotateProperty(), -170, Interpolator.EASE_OUT)
                ),
                new KeyFrame(Duration.millis(500), 
                    new KeyValue(node.translateZProperty(), -150, Interpolator.EASE_IN),
                    new KeyValue(node.rotateProperty(), -190, Interpolator.EASE_IN),
                    new KeyValue(node.scaleXProperty(), 1, Interpolator.EASE_IN),
                    new KeyValue(node.scaleYProperty(), 1, Interpolator.EASE_IN)
                ),
                new KeyFrame(Duration.millis(800), 
                    new KeyValue(node.translateZProperty(), 0, Interpolator.EASE_IN),
                    new KeyValue(node.rotateProperty(), -360, Interpolator.EASE_IN),
                    new KeyValue(node.scaleXProperty(), 0.95, Interpolator.EASE_IN),
                    new KeyValue(node.scaleYProperty(), 0.95, Interpolator.EASE_IN)
                ),
                new KeyFrame(Duration.millis(1000), 
                    new KeyValue(node.scaleXProperty(), 1, Interpolator.EASE_IN),
                    new KeyValue(node.scaleYProperty(), 1, Interpolator.EASE_IN)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
    }
    
    @Override
    public void Play() {
        this.node.setRotationAxis(Point3D.ZERO);
        this.node.setRotationAxis(Rotate.Y_AXIS);
        super.Play();
    }
}
