package com.lesson.dependency_injection;

public class TransferMarket {

    private FootballClubs privateFootballClubs;

    public TransferMarket(FootballClubs myClub){
        privateFootballClubs = myClub;
    }

    public void yourPurchase(){
        System.out.println("Player name: " + privateFootballClubs.getPlayerName());
        System.out.println("Player cost: " + privateFootballClubs.getPlayerCost());
    }
}
