package zunayedhassan.AnimateFX;

import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.scene.Node;
import javafx.scene.transform.Rotate;

/**
 *
 * @author Zunayed Hassan
 */
public class AnimationFX {
    public final Interpolator WEB_EASE = Interpolator.SPLINE(0.25, 0.1, 0.25, 1);
    protected Timeline timeline = null;
    protected Node node = null;
    
    public AnimationFX(Node node) {
        this.node = node;
    }
    
    public Timeline GetTimeline() {
        return this.timeline;
    }
    
    public void Play() {
        this.GetTimeline().play();
    }
    
    public void Stop() {
        this.GetTimeline().stop();
    }
    
    public void Pause() {
        this.GetTimeline().pause();
    }
    
    public void ResetNode() {
        this.node.setTranslateX(0);
        this.node.setTranslateY(0);
        this.node.setTranslateZ(0);
        
        this.node.setScaleX(1);
        this.node.setScaleY(1);
        this.node.setScaleZ(1);
        
        this.node.setRotate(0);

        this.node.setOpacity(1);
        
        this.node.setRotationAxis(Rotate.Z_AXIS);
    }
}
