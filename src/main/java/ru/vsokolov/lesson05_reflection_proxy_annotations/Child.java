package ru.vsokolov.lesson05_reflection_proxy_annotations;

public class Child extends Parent {

    public String title;
    public String manual;
    public String money;

    public Child(String name, String surName, int balance, String title, String manual, String money) {
        super(name, surName, balance);
        this.title = title;
        this.manual = manual;
        this.money = money;
    }

    public Child(int num1, int num2, String title, String manual, String money) {
        super(num1, num2);
        this.title = title;
        this.manual = manual;
        this.money = money;
    }

    public Child(){

    }

    public String getTitle() {
        return title;
    }

    public String getManual() {
        return manual;
    }

    public String getMoney() {
        return money;
    }

    public int calcThreeNumber(int num1, int num2, int num3){
        return num1+num2+num3;
    }

    private boolean returnFalse(){
        return false;
    }

    @Override
    public int calcTwoNumber(int num1, int num2) {
        return super.calcTwoNumber(num1, num2);
    }
}
