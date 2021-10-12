package com.example.dictionaryproject;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import org.json.*;
import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {
    public HBox bgSearch;
    public HBox bgNote;
    public HBox bgGame;
    public HBox bgSetting;
    public AnchorPane content;
    public AnchorPane control;
    public ImageView buttonNote;
    public ImageView buttonSearch;
    public ImageView buttonGame;
    public ImageView buttonSetting;


    public TextField inputSearch;
    public AnchorPane submitSearch;

    public AnimationApp animationApp;
    public ImageView imageNotFound;

    public void test() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.animationApp = new AnimationApp();
        animationApp.buttonClick(bgSearch, bgNote, bgGame, bgSetting);
        animationApp.buttonClick(bgNote, bgSearch, bgGame, bgSetting);
        animationApp.buttonClick(bgGame, bgNote, bgSearch, bgSetting);
        animationApp.buttonClick(bgSetting, bgNote, bgGame, bgSearch);
        animationApp.hoverAnimation(bgSearch);
        animationApp.hoverAnimation(bgNote);
        animationApp.hoverAnimation(bgGame);
        animationApp.hoverAnimation(bgSetting);


    }
}