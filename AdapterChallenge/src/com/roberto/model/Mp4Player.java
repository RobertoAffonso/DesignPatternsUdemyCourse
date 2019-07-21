package com.roberto.model;

import com.roberto.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer {
    private String fileName;

    public Mp4Player() {
    }

    @Override
    public void loadFileName(String fileName) {
            this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Now listening to: " + fileName + ".mp4");
    }

    public String getFileName() {
        return fileName;
    }
}
