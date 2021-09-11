package com.lesson.homeworkFive;

public class FootballPlayer {
    private FootballClub theFootballClub;

    public void setTheFootballClub(FootballClub theFootballClub) {
        this.theFootballClub = theFootballClub;
    }

    public void getInfo(){
        System.out.println("Месси играет за " + theFootballClub.getClubName());
    }
}
