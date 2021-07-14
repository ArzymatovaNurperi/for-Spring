package com.peaksoft;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicMusic implements Music{

@PostConstruct
public void doMyInit(){
    System.out.println("DOING MY INIT");
}
@PreDestroy
public void doMyDestroy(){
        System.out.println("DOING MY DESSTROY");
    }
    @Override
    public String getSong() {
        return "think";
    }
}
