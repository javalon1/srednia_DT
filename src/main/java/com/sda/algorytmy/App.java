package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbe elementow: ");
        int n = scanner.nextInt();
        double wynik = 0;
        int i = 0;


       while (i < n){
           System.out.println("Proszę podać liczbe: ");
           int a = scanner.nextInt();
           wynik = wynik + a;
           i++;
       }
//hahaha
        System.out.println(wynik / n);
    }

    }
