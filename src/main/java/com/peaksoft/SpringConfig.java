package com.peaksoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.peaksoft")
@PropertySource("classpath:musicplayer.properties")
public class SpringConfig {
    @Bean
    public ClassicMusic classicMusic(){
        return  new ClassicMusic();
    }@Bean
    public RockMusic rockMusic(){
        return  new RockMusic();
    }
    @Bean
    public MusicPlayer musicPlayer(){
        return new MusicPlayer(classicMusic(),rockMusic());
    }
}
