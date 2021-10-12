package com.example.dictionaryproject;
import javafx.geometry.Insets;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class AnimationApp {
    private Background backgroundActive = new Background(new BackgroundFill(new Color(0.4,0.4,0.4,1), new CornerRadii(20), Insets.EMPTY));
    private Background backgroundHover = new Background(new BackgroundFill(new Color(0.5,0.5,0.5,1), new CornerRadii(20), Insets.EMPTY));
    private Background backgroundUnActive = new Background(new BackgroundFill(new Color(0,0,0,0), new CornerRadii(20), Insets.EMPTY));

    public void buttonClick(HBox active, HBox unActive1, HBox unActive2, HBox unActive3) {
        active.setOnMouseClicked((MouseEvent event) -> {
            active.setBackground(this.backgroundActive);
            unActive1.setBackground(this.backgroundUnActive);
            unActive2.setBackground(this.backgroundUnActive);
            unActive3.setBackground(this.backgroundUnActive);
        });
    }

    public void hoverAnimation(HBox bg) {
        bg.setOnMouseEntered((MouseEvent event) -> {
           if(!bg.getBackground().equals(this.backgroundActive))
            bg.setBackground(this.backgroundHover);
        });

        bg.setOnMouseExited((MouseEvent event) -> {
            if(!bg.getBackground().equals(this.backgroundActive)) {
                bg.setBackground(this.backgroundUnActive);
            }
        });
    }

}
