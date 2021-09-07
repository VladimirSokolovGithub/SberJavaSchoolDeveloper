package ru.vsokolov.lesson05_reflection_proxy_annotations;

public class Parent {

    private String name;
    private String surName;
    private int balance;
    private int num1;
    private int num2;

    public Parent(String name, String surName, int balance) {
        this.name = name;
        this.surName = surName;
        this.balance = balance;
    }

    public Parent(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Parent() {

    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getBalance() {
        return balance;
    }

    public int calcTwoNumber(int num1, int num2){
        return num1+num2;
    } //*

    private boolean returnTrue(){
        return true;
    } //*
}
