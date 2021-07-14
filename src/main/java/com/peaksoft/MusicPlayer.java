package com.peaksoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MusicPlayer {

    private Music music1;
    private Music music2;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("classicMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;

    }


    public MusicPlayer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }


    public String playMusic() {
        return "Go play music  " + music1.getSong() + "," + music2.getSong();



    }
    }

