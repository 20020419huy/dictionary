package com.example.dictionaryproject;

import java.util.ArrayList;

public class OxfordData {
    public ArrayList<String> ipa;
    public ArrayList<String>audio;
    ArrayList<DefineExample> defineExamples;
    public OxfordData () {
        this.audio = new ArrayList<String>();
        this.ipa = new ArrayList<String>();
        this.defineExamples = new ArrayList<DefineExample>();
    }
}
