package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

public class PacmanGame implements GamingConsole {
    public void up(){
        System.out.println("Pacman Up");
    }

    public void down(){
        System.out.println("Pacman Down");
    }

    public void left(){
        System.out.println("Pacman Left");
    }

    public void right(){
        System.out.println("Pacman Right");
    }
}
