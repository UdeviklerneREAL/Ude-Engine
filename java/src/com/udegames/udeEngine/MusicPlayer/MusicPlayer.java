package com.udegames.udeEngine.MusicPlayer;

import com.udegames.udeEngine.MusicPlayer.AePlayWave;

/*
* The MusicPlayer class allows you to play music and sound effects for your game
*/

public class MusicPlayer {

    public static void play(String wavFile) {
        try{
            AePlayWave musicPlayer = new AePlayWave(wavFile);
            musicPlayer.start();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void play(String wavFile, boolean threaded){
        if (threaded){
            play(wavFile);
        } else if (!threaded) {
            try{
                AePlayWave musicPlayer = new AePlayWave(wavFile);
                musicPlayer.run();
            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    public static void play(String wavFile, AePlayWave.Position position){
        try{
            AePlayWave musicPlayer = new AePlayWave(wavFile, position);
            musicPlayer.start();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void play(String wavFile, AePlayWave.Position position, boolean threaded){
        AePlayWave musicPlayer = new AePlayWave(wavFile, position);
        if (threaded){
            musicPlayer.start();
        } else if (!threaded){
            musicPlayer.run();
        }
    }
}
