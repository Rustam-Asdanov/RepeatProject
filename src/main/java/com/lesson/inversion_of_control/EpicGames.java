package com.lesson.inversion_of_control;

public class EpicGames {

    private Games theGames;

    public EpicGames(Games theGames) {
        this.theGames = theGames;
    }

    public void getProduct(){
        System.out.println("Вы купили игру " + theGames.getGameName());
    }
}
