package com.lesson.homeworks.homeworkOne;

public class OnlineOrder {

    private Company theCompany;

    public OnlineOrder(Company theCompany) {
        this.theCompany = theCompany;
    }

    public void getOrder(){
        System.out.println( "Your order is " + theCompany.getProductName() );
    }
}

