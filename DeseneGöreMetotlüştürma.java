package com.company;

import java.util.Scanner;

/*Kural : Girilen say� 0 veya negatif oldu�u yere kadar girilen say�dan
5 rakam�n� ��kar�n. Her ��karma i�lemi s�ras�nda ekrana son de�eri
 yazd�r�n. Say� negatif veya 0 olduktan sonra tekrar 5 ekleyin.
  Yine her ekleme i�leminde say�n�n son de�erini ekrana yazd�r�n.
 */


public class Main {

    static int negatif(int x){
       if(x<=0){
           return x;
       }else{
           System.out.println(x + " ");
           return x-5;
       }

    }
    static int positive(int x,int y) {
        if(x > y){
            return x;
        }
        else {
            System.out.print(x + " ");
            return positive(x+5,y);
        }


    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a number:");
            int number = scanner.nextInt();

            positive(negatif(number), number);

            if(number==0){
                break;
            }
            System.out.print("\nEnter '0' for output.");
        }


    }
}