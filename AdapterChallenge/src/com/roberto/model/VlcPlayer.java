package com.roberto.model;

import com.roberto.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer {

    private String fileName;

    @Override
    public void loadFileName(String fileName) {
            this.fileName = fileName;
    }

    @Override
    public void listen() {
        System.out.println("Now listening to: " + fileName + ".vlc");
    }

    public String getFileName() {
        return fileName;
    }
}
