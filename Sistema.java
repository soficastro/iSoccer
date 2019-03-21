package com.company;

import java.util.Scanner;

public class Sistema {

    public Person eu;

    boolean initialMenu(){
        System.out.print("1-New user 2-Exit\n");
        Scanner input = new Scanner(System.in);
        int option = input.nextInt();
        if (option == 1){
            return menu2();
        }
        else {
            return false;
        }
    }
    boolean menu2(){
        this.eu = new Person();
        return menu3();
    }
    boolean menu3(){
        boolean exit = false;
        while (!exit){
            System.out.print("1-Display info 2-Change info 3-Undo 4-Exit\n");
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            if (option == 1){
                this.eu.info();
            }
            else if(option == 2){
                this.eu.changeInfo();
            }
            else if(option == 3){
                this.eu.undo();
            }
            else{
                exit = true;
            }
        }
        return  exit;
    }
}
