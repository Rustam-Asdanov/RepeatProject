package com.lesson.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("store")
public class EpicGames {

    @Autowired
    @Qualifier("adventure")
    private Games games;

//    @Autowired
//    public EpicGames(@Qualifier("sportGame") Games games) {
//        this.games = games;
//    }

//    @Autowired
//    public void setGames(@Qualifier("sportGame")Games games) {
//        this.games = games;
//    }

    public void getGame(){
        System.out.println("I get "+ games.getNameOfGame());
    }
}
