package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main{

    /*
    public static void myMessage(){
        System.out.println("Here is an intro to Methods");
    }

    public static void main(String[] args) {
        myMessage();
    */

    public static void main(String[] args) {
            System.out.println("type in a min and a max number");
            System.out.println(getRandom(getIntInput(),getIntInput()));
        }

    public static int getIntInput() {
        return new Scanner(System.in).nextInt();
        }

    public static int getRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt((max-min)+1)+min;
    }
}
