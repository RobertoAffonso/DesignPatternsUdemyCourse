package com.roberto.model;

import com.roberto.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private String audioType;

    public String getAudioType() {
        return audioType;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing " + audioType + " file. Name: " + fileName + "." + audioType);
        } else {
            System.out.println("File type is not compatible.");
        }
    }
}
