package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    public String name;
    public int login;
    public ArrayList<String> oldNames;
    public ArrayList<Integer> oldLogins;
    @Override
    public String toString() { return "Name: "+ this.name + "\nLogin:" + this.login + "\n";}
    Person(){
        oldNames = new ArrayList<>();
        oldLogins = new ArrayList<>();
        System.out.print("Insert name:\n");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();
        this.oldNames.add(this.name);
        System.out.print("Insert login:\n");
        this.login = input.nextInt();
        this.oldLogins.add(this.login);
    }
    void info(){
        System.out.print(this);
    }
    void changeInfo(){
        System.out.print("Do you want to change your info?\n 1-Y 2-N\n");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        switch(option){
            case 1:
                changeName();
                changeLogin();
                break;
            case 2:
                break;
        }
    }
    void changeName(){
        System.out.print("Insert new name:");
        this.oldNames.add(this.name);
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();
    }
    void changeLogin(){
        System.out.print("Insert new login:");
        this.oldLogins.add(this.login);
        Scanner input = new Scanner(System.in);
        this.login = input.nextInt();
    }
    void undo(){
        this.name = this.oldNames.get(this.oldNames.size()-1);
        this.login = this.oldLogins.get(this.oldLogins.size()-1);
        this.oldNames.remove(this.oldNames.size()-1);
        this.oldLogins.remove(this.oldLogins.size()-1);
        info();
    }
}
