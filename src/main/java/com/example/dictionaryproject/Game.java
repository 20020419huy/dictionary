package com.example.dictionaryproject;

import javafx.concurrent.Worker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import org.w3c.dom.Document;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Scanner;

public class Game {
    public AnchorPane main;
    public WebView webView;
    public WebEngine webEngine;
    private final String url = "C:\\Users\\nguye\\OneDrive\\Desktop\\workSpace\\DictionaryProject\\src\\main\\resources\\com\\example\\dictionaryproject\\webGame\\index.html";
    public Game(AnchorPane main) {
        this.main = main;
        this.webView = new WebView();
    }

    public void initGame() {
        this.webView.setPrefWidth(850);
        this.webView.setPrefHeight(600);
        this.webEngine = this.webView.getEngine();
        File file = new File(this.url);
        try {
            this.webEngine.load(file.toURI().toURL().toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        int count = 0;
        String data = "";
        try {
            File myObj = new File("C:\\Users\\nguye\\OneDrive\\Desktop\\workSpace\\DictionaryProject\\src\\main\\java\\com\\example\\dictionaryproject\\note.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + "__";
                count ++;
            }
            data = data.substring(0, data.length() - 2);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        String finalData = data;
        int finalCount = count;
        webEngine.getLoadWorker().stateProperty().addListener((observable, oldState, newState) -> {
            if (newState == Worker.State.SUCCEEDED) {
                Document doc = webEngine.getDocument();
                doc.getElementById("dataNote").setAttribute("data-dataNote", finalData);
                if(finalCount >= 4) {
                    this.webEngine.executeScript("activeButtonNote()");
                }
            }
        });
        this.main.getChildren().add(this.webView);
    }

}
