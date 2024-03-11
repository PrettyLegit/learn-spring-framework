package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class SuperContraGame implements GamingConsole {
    public void up(){
        System.out.println("Super Up");
    }

    public void down(){
        System.out.println("Down");
    }

    public void left(){
        System.out.println("Left");
    }

    public void right(){
        System.out.println("Right");
    }

}
