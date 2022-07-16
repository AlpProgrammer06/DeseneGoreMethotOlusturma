package com.company;

import java.util.Scanner;

/*Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan
5 rakamını çıkarın. Her çıkarma işlemi sırasında ekrana son değeri
 yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
  Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
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