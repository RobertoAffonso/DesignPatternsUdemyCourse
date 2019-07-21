package com.roberto.adapter;

import com.roberto.interfaces.AdvancedMediaPlayer;
import com.roberto.interfaces.MediaPlayer;

public class AdvancedMediaPlayerAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMediaPlayer.loadFileName(fileName);
        advancedMediaPlayer.listen();
    }
}
