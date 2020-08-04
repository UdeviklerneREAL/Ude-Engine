package com.udegames.udeEngine.MusicPlayer;

import com.udegames.udeEngine.MusicPlayer.AePlayWave;

public class MusicPlayer {

    public static void play(String wavFile)
    {
        try{
            AePlayWave musicPlayer = new AePlayWave(wavFile);
            musicPlayer.run();
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
