package com.peaksoft;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context=
                new AnnotationConfigApplicationContext(SpringConfig.class);
      //  Music music=context.getBean("myMusic",Music.class);
       // MusicPlayer musicPlayer=new MusicPlayer(music);
      //  MusicPlayer musicPlayer= context.getBean("musicPlayer",MusicPlayer.class);
      //  musicPlayer.playMusic();
       // MusicPlayer firstMusic=context.getBean("playerMusic",MusicPlayer.class);
       // musicPlayer.getName();
       // musicPlayer.getVolume();
      //  Computer computer=context.getBean("computer",Computer.class);
      //  System.out.println(computer);

        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println( musicPlayer.getVolume());
        // ClassicMusic classicMusic=context.getBean("classicMusic",ClassicMusic.class);
        context.close();
    }
}
