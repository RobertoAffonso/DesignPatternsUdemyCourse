package com.roberto;

import com.roberto.adapter.AdvancedMediaPlayerAdapter;
import com.roberto.interfaces.AdvancedMediaPlayer;
import com.roberto.interfaces.MediaPlayer;
import com.roberto.model.AudioPlayer;
import com.roberto.model.Mp4Player;
import com.roberto.model.VlcPlayer;

public class AdapterPlayerDemo {

    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Challenge***");
        System.out.println("\n");

        /**
         * Creating an AudioPlayer
         */
        MediaPlayer  audioPlayer = new AudioPlayer(); // Creates the AudioPlayer object
        audioPlayer.play("mp3", "EnterSandman"); // Calls the play method.

        /**
         * Creating the first adapter.
         */
        AdvancedMediaPlayer mp4Player = new Mp4Player();
        MediaPlayer mediaPlayerAdapter = new AdvancedMediaPlayerAdapter(mp4Player);
        mediaPlayerAdapter.play("mp4", "The Rock");

        /**
         * Creating the second adapter.
         */
        AdvancedMediaPlayer vlcPlayer = new VlcPlayer(); // Creating a VLCPlayer object.
        MediaPlayer mediaPlayerAdapter2 = new AdvancedMediaPlayerAdapter(vlcPlayer); // Adapting the VLC player to an AudioPlayer.
        mediaPlayerAdapter2.play("vlc", "Skyfall"); // Calling the AudioPlayer´s play method.

        audioPlayer.play("avi", "lolz"); // Calls the play method passing an invalid file type.
    }
}
