package zunayedhassan;

import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ToolBar;

import zunayedhassan.AnimateFX.AnimationFX;
import zunayedhassan.AnimateFX.BounceAnimation;
import zunayedhassan.AnimateFX.BounceInAnimation;
import zunayedhassan.AnimateFX.BounceInDownAnimation;
import zunayedhassan.AnimateFX.BounceInLeftAnimation;
import zunayedhassan.AnimateFX.BounceInRightAnimation;
import zunayedhassan.AnimateFX.BounceInUpAnimation;
import zunayedhassan.AnimateFX.BounceOutAnimation;
import zunayedhassan.AnimateFX.BounceOutDownAnimation;
import zunayedhassan.AnimateFX.BounceOutLeftAnimation;
import zunayedhassan.AnimateFX.BounceOutRightAnimation;
import zunayedhassan.AnimateFX.BounceOutUpAnimation;
import zunayedhassan.AnimateFX.FadeInAnimation;
import zunayedhassan.AnimateFX.FadeInDownAnimation;
import zunayedhassan.AnimateFX.FadeInDownBigAnimation;
import zunayedhassan.AnimateFX.FadeInLeftAnimation;
import zunayedhassan.AnimateFX.FadeInLeftBigAnimation;
import zunayedhassan.AnimateFX.FadeInRightAnimation;
import zunayedhassan.AnimateFX.FadeInRightBigAnimation;
import zunayedhassan.AnimateFX.FadeInUpAnimation;
import zunayedhassan.AnimateFX.FadeInUpBigAnimation;
import zunayedhassan.AnimateFX.FadeOutAnimation;
import zunayedhassan.AnimateFX.FadeOutDownAnimation;
import zunayedhassan.AnimateFX.FadeOutDownBigAnimation;
import zunayedhassan.AnimateFX.FadeOutLeftAnimation;
import zunayedhassan.AnimateFX.FadeOutLeftBigAnimation;
import zunayedhassan.AnimateFX.FadeOutRightAnimation;
import zunayedhassan.AnimateFX.FadeOutRightBigAnimation;
import zunayedhassan.AnimateFX.FadeOutUpAnimation;
import zunayedhassan.AnimateFX.FadeOutUpBigAnimation;
import zunayedhassan.AnimateFX.FlashAnimation;
import zunayedhassan.AnimateFX.FlipAnimation;
import zunayedhassan.AnimateFX.FlipInXAnimation;
import zunayedhassan.AnimateFX.FlipInYAnimation;
import zunayedhassan.AnimateFX.FlipOutXAnimation;
import zunayedhassan.AnimateFX.FlipOutYAnimation;
import zunayedhassan.AnimateFX.HingeAnimation;
import zunayedhassan.AnimateFX.PulseAnimation;
import zunayedhassan.AnimateFX.RollInAnimation;
import zunayedhassan.AnimateFX.RollOutAnimation;
import zunayedhassan.AnimateFX.RotateInAnimation;
import zunayedhassan.AnimateFX.RotateInDownLeftAnimation;
import zunayedhassan.AnimateFX.RotateInDownRightAnimation;
import zunayedhassan.AnimateFX.RotateInUpLeftAnimation;
import zunayedhassan.AnimateFX.RotateInUpRightAnimation;
import zunayedhassan.AnimateFX.RotateOutAnimation;
import zunayedhassan.AnimateFX.RotateOutDownLeftAnimation;
import zunayedhassan.AnimateFX.RotateOutDownRightAnimation;
import zunayedhassan.AnimateFX.RotateOutUpLeftAnimation;
import zunayedhassan.AnimateFX.RotateOutUpRightAnimation;
import zunayedhassan.AnimateFX.ShakeAnimation;
import zunayedhassan.AnimateFX.SwingAnimation;
import zunayedhassan.AnimateFX.TadaAnimation;
import zunayedhassan.AnimateFX.WobbleAnimation;

/**
 *
 * @author Zunayed Hassan
 */
public class RootUI extends BaseUI {
    public static final double WIDTH = 300;
    public static final double HEIGHT = 50;
    
    public Button AnimatedObject = new Button("Preview");
    public StackPane Canvas = new StackPane(this.AnimatedObject);
    
    public Button FlashButton = new Button("Flash");
    public Button BounceButton = new Button("Bounce");
    public Button PulseButton = new Button("Pulse");
    public Button ShakeButton = new Button("Shake");
    public Button SwingButton = new Button("Swing");
    public Button TadaButton = new Button("Tada");
    public Button WobbleButton = new Button("Wobble");
    
    public Button BounceInButton = new Button("Bounce In");
    public Button BounceInDownButton = new Button("Bounce In Down");
    public Button BounceInLeftButton = new Button("Bounce In Left");
    public Button BounceInRightButton = new Button("Bounce In Right");
    public Button BounceInUpButton = new Button("Bounce In Up");
    
    public Button BounceOutButton = new Button("Bounce Out");
    public Button BounceOutDownButton = new Button("Bounce Out Down");
    public Button BounceOutLeftButton = new Button("Bounce Out Left");
    public Button BounceOutRightButton = new Button("Bounce Out Right");
    public Button BounceOutUpButton = new Button("Bounce Out Up");
    
    public Button FadeInButton = new Button("Fade In");
    public Button FadeInDownButton = new Button("Fade In Down");
    public Button FadeInDownBigButton = new Button("Fade In Down Big");
    public Button FadeInLeftButton = new Button("Fade In Left");
    public Button FadeInLeftBigButton = new Button("Fade In Left Big");
    public Button FadeInRightButton = new Button("Fade In Right");
    public Button FadeInRightBigButton = new Button("Fade In Right Big");
    public Button FadeInUpButton = new Button("Fade In Up");
    public Button FadeInUpBigButton = new Button("Fade In Up Big");
    
    public Button FadeOutButton = new Button("Fade Out");
    public Button FadeOutDownButton = new Button("Fade Out Down");
    public Button FadeOutDownBigButton = new Button("Fade Out Down Big");
    public Button FadeOutLeftButton = new Button("Fade Out Left");
    public Button FadeOutLeftBigButton = new Button("Fade Out Left Big");
    public Button FadeOutRightButton = new Button("Fade Out Right");
    public Button FadeOutRightBigButton = new Button("Fade Out Right Big");
    public Button FadeOutUpButton = new Button("Fade Out Up");
    public Button FadeOutUpBigButton = new Button("Fade Out Up Big");
    
    public Button FlipButton = new Button("Flip");
    public Button FlipInXButton = new Button("Flip In X");
    public Button FlipInYButton = new Button("Flip In Y");
    public Button FlipOutXButton = new Button("Flip Out X");
    public Button FlipOutYButton = new Button("Flip Out Y");
    
    public Button RotateInButton = new Button("Rotate In");
    public Button RotateInDownLeftButton = new Button("Rotate In Down Left");
    public Button RotateInDownRightButton = new Button("Rotate In Down Right");
    public Button RotateInUpLeftButton = new Button("Roate In Up Left");
    public Button RotateInUpRightButton = new Button("Roate In Up Right");
    
    public Button RotateOutButton = new Button("Roate Out");
    public Button RotateOutDownLeftButton = new Button("Roate Out Down Left");
    public Button RotateOutDownRightButton = new Button("Roate Out Down Right");
    public Button RotateOutUpLeftButton = new Button("Roate Out Up Left");
    public Button RotateOutUpRightButton = new Button("Roate Out Up Right");
    
    public Button HingeButton = new Button("Hinge");
    public Button RollInButton = new Button("Roll In");
    public Button RollOutButton = new Button("Roll Out");
    
    protected FlashAnimation flashAnimation   = new FlashAnimation(this.AnimatedObject);
    protected BounceAnimation bounceAnimation = new BounceAnimation(this.AnimatedObject);
    protected PulseAnimation pulseAnimation = new PulseAnimation(this.AnimatedObject);
    protected ShakeAnimation shakeAnimation = new ShakeAnimation(this.AnimatedObject);
    protected SwingAnimation swingAnimation = new SwingAnimation(this.AnimatedObject);
    protected TadaAnimation tadaAnimation = new TadaAnimation(this.AnimatedObject);
    protected WobbleAnimation wobbleAnimation = new WobbleAnimation(this.AnimatedObject);
    
    protected BounceInAnimation bounceInAnimation = new BounceInAnimation(this.AnimatedObject);
    protected BounceInDownAnimation bounceInDownAnimation = new BounceInDownAnimation(this.AnimatedObject);
    protected BounceInLeftAnimation bounceInLeftAnimation = new BounceInLeftAnimation(this.AnimatedObject);
    protected BounceInRightAnimation bounceInRightAnimation = new BounceInRightAnimation(this.AnimatedObject);
    protected BounceInUpAnimation bounceInUpAnimation = new BounceInUpAnimation(this.AnimatedObject);
    
    protected BounceOutAnimation bounceOutAnimation = new BounceOutAnimation(this.AnimatedObject);
    protected BounceOutDownAnimation bounceOutDownAnimation = new BounceOutDownAnimation(this.AnimatedObject);
    protected BounceOutLeftAnimation bounceOutLeftAnimation = new BounceOutLeftAnimation(this.AnimatedObject);
    protected BounceOutRightAnimation bounceOutRightAnimation = new BounceOutRightAnimation(this.AnimatedObject);
    protected BounceOutUpAnimation bounceOutUpAnimation = new BounceOutUpAnimation(this.AnimatedObject);
    
    protected FadeInAnimation fadeInAnimation = new FadeInAnimation(this.AnimatedObject);
    protected FadeInDownAnimation fadeInDownAnimation = new FadeInDownAnimation(this.AnimatedObject);
    protected FadeInDownBigAnimation fadeInDownBigAnimation = new FadeInDownBigAnimation(this.AnimatedObject);
    protected FadeInLeftAnimation fadeInLeftAnimation = new FadeInLeftAnimation(this.AnimatedObject);
    protected FadeInLeftBigAnimation fadeInLeftBigAnimation = new FadeInLeftBigAnimation(this.AnimatedObject);
    protected FadeInRightAnimation fadeInRightAnimation = new FadeInRightAnimation(this.AnimatedObject);
    protected FadeInRightBigAnimation fadeInRightBigAnimation = new FadeInRightBigAnimation(this.AnimatedObject);
    protected FadeInUpAnimation fadeInUpAnimation = new FadeInUpAnimation(this.AnimatedObject);
    protected FadeInUpBigAnimation fadeInUpBigAnimation = new FadeInUpBigAnimation(this.AnimatedObject);
    
    protected FadeOutAnimation fadeOutAnimation = new FadeOutAnimation(this.AnimatedObject);
    protected FadeOutDownAnimation fadeOutDownAnimation = new FadeOutDownAnimation(this.AnimatedObject);
    protected FadeOutDownBigAnimation fadeOutDownBigAnimation = new FadeOutDownBigAnimation(this.AnimatedObject);
    protected FadeOutLeftAnimation fadeOutLeftAnimation = new FadeOutLeftAnimation(this.AnimatedObject);
    protected FadeOutLeftBigAnimation fadeOutLeftBigAnimation = new FadeOutLeftBigAnimation(this.AnimatedObject);
    protected FadeOutRightAnimation fadeOutRightAnimation = new FadeOutRightAnimation(this.AnimatedObject);
    protected FadeOutRightBigAnimation fadeOutRightBigAnimation = new FadeOutRightBigAnimation(this.AnimatedObject);
    protected FadeOutUpAnimation fadeOutUpAnimation = new FadeOutUpAnimation(this.AnimatedObject);
    protected FadeOutUpBigAnimation fadeOutUpBigAnimation = new FadeOutUpBigAnimation(this.AnimatedObject);
    
    protected FlipAnimation flipAnimation = new FlipAnimation(this.AnimatedObject);
    protected FlipInXAnimation flipInXAnimation = new FlipInXAnimation(this.AnimatedObject);
    protected FlipInYAnimation flipInYAnimation = new FlipInYAnimation(this.AnimatedObject);
    protected FlipOutXAnimation flipOutXAnimation = new FlipOutXAnimation(this.AnimatedObject);
    protected FlipOutYAnimation flipOutYAnimation = new FlipOutYAnimation(this.AnimatedObject);
    
    protected RotateInAnimation rotateInAnimation = new RotateInAnimation(this.AnimatedObject);
    protected RotateInDownLeftAnimation rotateInDownLeftAnimation = new RotateInDownLeftAnimation(this.AnimatedObject, HEIGHT);
    protected RotateInDownRightAnimation rotateInDownRightAnimation = new RotateInDownRightAnimation(this.AnimatedObject, WIDTH, HEIGHT);
    protected RotateInUpLeftAnimation rotateInUpLeftAnimation = new RotateInUpLeftAnimation(this.AnimatedObject, HEIGHT);
    protected RotateInUpRightAnimation rotateInUpRightAnimation = new RotateInUpRightAnimation(this.AnimatedObject, WIDTH, HEIGHT);
    
    protected RotateOutAnimation rotateOutAnimation = new RotateOutAnimation(this.AnimatedObject);
    protected RotateOutDownLeftAnimation rotateOutDownLeftAnimation = new RotateOutDownLeftAnimation(this.AnimatedObject, HEIGHT);
    protected RotateOutDownRightAnimation rotateOutDownRightAnimation = new RotateOutDownRightAnimation(this.AnimatedObject, WIDTH, HEIGHT);
    protected RotateOutUpLeftAnimation rotateOutUpLeftAnimation = new RotateOutUpLeftAnimation(this.AnimatedObject, HEIGHT);
    protected RotateOutUpRightAnimation rotateOutUpRightAnimation = new RotateOutUpRightAnimation(this.AnimatedObject, WIDTH, HEIGHT);
    
    protected HingeAnimation hingeAnimation = new HingeAnimation(this.AnimatedObject, Settings.WINDOW_HEIGHT - HEIGHT);
    protected RollInAnimation rollInAnimation = new RollInAnimation(this.AnimatedObject);
    protected RollOutAnimation rollOutAnimation = new RollOutAnimation(this.AnimatedObject);
    
    public RootUI() {        
        this.Canvas.setId("canvas");
        this.AnimatedObject.setPrefSize(WIDTH, HEIGHT);
        this.AnimatedObject.setId("big-yellow");
        
        this.setTop(this.Canvas);
        
        VBox vbox = new VBox(5);
        vbox.setPadding(new Insets(0, 10, 20, 10));
        vbox.setAlignment(Pos.CENTER);
        
        ScrollPane scrollPane = new ScrollPane(vbox);
        scrollPane.setId("animation-example-scrollPane");
        scrollPane.setFitToWidth(true);
        this.setCenter(scrollPane);

        TitlePane attentionSeekerLabel = new TitlePane("Attention Seekers");
        CustomFlowPane attentionSeekerFlowPane = new CustomFlowPane();
        
        TitlePane bouncingEntrancesLabel = new TitlePane("Bouncing Entrances");
        CustomFlowPane bouncingEntrancesFlowPane = new CustomFlowPane();
        
        TitlePane bouncingExitsLabel = new TitlePane("Bouncing Exists");
        CustomFlowPane bouncingExitsPane = new CustomFlowPane();
        
        TitlePane fadingEntrancesLabel = new TitlePane("Fading Entrances");
        CustomFlowPane fadingEntrancesPane = new CustomFlowPane();
        
        TitlePane fadingExistsLabel = new TitlePane("Fading Entrances");
        CustomFlowPane fadingExistsPane = new CustomFlowPane();
        
        TitlePane flippersLabel = new TitlePane("Flippers");
        CustomFlowPane flippersPane = new CustomFlowPane();
        
        TitlePane rotatingEntrancesLabel = new TitlePane("Rotating Entrances");
        CustomFlowPane rotatingEntrancesPane = new CustomFlowPane();
        
        TitlePane rotatingExitsLabel = new TitlePane("Rotating Exits");
        CustomFlowPane rotatingExitsPane = new CustomFlowPane();
        
        TitlePane specialsLabel = new TitlePane("Specials");
        CustomFlowPane specialsPane = new CustomFlowPane();
        
        attentionSeekerFlowPane.getChildren().addAll(
                this.FlashButton,
                this.BounceButton,
                this.PulseButton,
                this.ShakeButton,
                this.SwingButton,
                this.TadaButton,
                this.WobbleButton
        );
        
        bouncingEntrancesFlowPane.getChildren().addAll(
                this.BounceInButton,
                this.BounceInDownButton,
                this.BounceInLeftButton,
                this.BounceInRightButton,
                this.BounceInUpButton
        );
        
        bouncingExitsPane.getChildren().addAll(
                this.BounceOutButton,
                this.BounceOutDownButton,
                this.BounceOutLeftButton,
                this.BounceOutRightButton,
                this.BounceOutUpButton
        );
        
        fadingEntrancesPane.getChildren().addAll(
                this.FadeInButton,
                this.FadeInDownButton,
                this.FadeInDownBigButton,
                this.FadeInLeftButton,
                this.FadeInLeftBigButton,
                this.FadeInRightButton,
                this.FadeInRightBigButton,
                this.FadeInUpButton,
                this.FadeInUpBigButton
        );
        
        fadingExistsPane.getChildren().addAll(
                this.FadeOutButton,
                this.FadeOutDownButton,
                this.FadeOutDownBigButton,
                this.FadeOutLeftButton,
                this.FadeOutLeftBigButton,
                this.FadeOutRightButton,
                this.FadeOutRightBigButton,
                this.FadeOutUpButton,
                this.FadeOutUpBigButton
        );
        
        flippersPane.getChildren().addAll(
                this.FlipButton,
                this.FlipInXButton,
                this.FlipInYButton,
                this.FlipOutXButton,
                this.FlipOutYButton
        );
        
        rotatingEntrancesPane.getChildren().addAll(
                this.RotateInButton,
                this.RotateInDownLeftButton,
                this.RotateInDownRightButton,
                this.RotateInUpLeftButton,
                this.RotateInUpRightButton
        );
        
        rotatingExitsPane.getChildren().addAll(
                this.RotateOutButton,
                this.RotateOutDownLeftButton,
                this.RotateOutDownRightButton,
                this.RotateOutUpLeftButton,
                this.RotateOutUpRightButton
        );
        
        specialsPane.getChildren().addAll(
                this.HingeButton,
                this.RollInButton,
                this.RollOutButton
        );
        
        vbox.getChildren().addAll(
                attentionSeekerLabel,
                attentionSeekerFlowPane,
                bouncingEntrancesLabel,
                bouncingEntrancesFlowPane,
                bouncingExitsLabel,
                bouncingExitsPane,
                fadingEntrancesLabel,
                fadingEntrancesPane,
                fadingExistsLabel,
                fadingExistsPane,
                flippersLabel,
                flippersPane,
                rotatingEntrancesLabel,
                rotatingEntrancesPane,
                rotatingExitsLabel,
                rotatingExitsPane,
                specialsLabel,
                specialsPane
        );
        
        this.setBottom(
                new ToolBar(
                        new Label("Author: ZunayedHassanBD@gmail.com | Inspired by: Daniel Eden and Canned Animation from FxExperience")
                )
        );
        
        // Events
        FlowPane[] buttonsFlowPanes = new FlowPane[] {
            attentionSeekerFlowPane,
            bouncingEntrancesFlowPane,
            bouncingExitsPane,
            fadingEntrancesPane,
            fadingExistsPane,
            flippersPane,
            rotatingEntrancesPane,
            rotatingExitsPane,
            specialsPane
        };
        
        ArrayList<Button> animationButtons = new ArrayList<>();
        
        for (FlowPane flowPane : buttonsFlowPanes) {
            for (Node node : flowPane.getChildren()) {
                animationButtons.add((Button) node);
            }
        }
        
        AnimationFX[] animations = new AnimationFX[] {
            flashAnimation,
            bounceAnimation,
            pulseAnimation,
            shakeAnimation,
            swingAnimation,
            tadaAnimation,
            wobbleAnimation,
            bounceInAnimation,
            bounceInDownAnimation,
            bounceInLeftAnimation,
            bounceInRightAnimation,
            bounceInUpAnimation,
            bounceOutAnimation,
            bounceOutDownAnimation,
            bounceOutLeftAnimation,
            bounceOutRightAnimation,
            bounceOutUpAnimation,
            fadeInAnimation,
            fadeInDownAnimation,
            fadeInDownBigAnimation,
            fadeInLeftAnimation,
            fadeInLeftBigAnimation,
            fadeInRightAnimation,
            fadeInRightBigAnimation,
            fadeInUpAnimation,
            fadeInUpBigAnimation,
            fadeOutAnimation,
            fadeOutDownAnimation,
            fadeOutDownBigAnimation,
            fadeOutLeftAnimation,
            fadeOutLeftBigAnimation,
            fadeOutRightAnimation,
            fadeOutRightBigAnimation,
            fadeOutUpAnimation,
            fadeOutUpBigAnimation,
            flipAnimation,
            flipInXAnimation,
            flipInYAnimation,
            flipOutXAnimation,
            flipOutYAnimation,
            rotateInAnimation,
            rotateInDownLeftAnimation,
            rotateInDownRightAnimation,
            rotateInUpLeftAnimation,
            rotateInUpRightAnimation,
            rotateOutAnimation,
            rotateOutDownLeftAnimation,
            rotateOutDownRightAnimation,
            rotateOutUpLeftAnimation,
            rotateOutUpRightAnimation,
            hingeAnimation,
            rollInAnimation,
            rollOutAnimation
        };
        
        for (int i = 0; i < animations.length; i++) {
            AnimationFX animation = animations[i];
            Button button = animationButtons.get(i);
            
            animation.GetTimeline().setOnFinished(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    animation.ResetNode();
                }
            });
            
            button.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    animation.Play();
                }
            });
        }
    }
}
