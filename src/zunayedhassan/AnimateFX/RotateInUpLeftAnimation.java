package zunayedhassan.AnimateFX;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

/**
 *
 * @author Zunayed Hassan
 */
public class RotateInUpLeftAnimation extends AnimationFX {
    protected Rotate rotate = null;
    
    public RotateInUpLeftAnimation(Node node, double height) {
        super(node);
        
        this.rotate = new Rotate(0, 0, height);
        
        this.timeline = new Timeline(
                new KeyFrame(Duration.millis(0),    
                    new KeyValue(node.opacityProperty(), 0, WEB_EASE),
                    new KeyValue(rotate.angleProperty(), 90, WEB_EASE)
                ),
                new KeyFrame(Duration.millis(1000),    
                    new KeyValue(node.opacityProperty(), 1, WEB_EASE),
                    new KeyValue(rotate.angleProperty(), 0, WEB_EASE)
                )
        );
        
        this.timeline.setDelay(Duration.seconds(0.2));
        
        this.timeline.statusProperty().addListener(new ChangeListener<Animation.Status>() {
            @Override
            public void changed(ObservableValue<? extends Animation.Status> observable, Animation.Status oldValue, Animation.Status status) {
                if (status == Animation.Status.STOPPED) {
                    node.getTransforms().remove(rotate);
                }
            }
        });
    }
    
    @Override
    public void Play() {
        this.node.getTransforms().add(this.rotate);
        super.Play();
    }
}
