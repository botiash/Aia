package com.company;

public class Main {

             static int ekilik(int a) { // bizge tek bir man kazhet
                 int b=0; // zhana ainimali
                 String temp = ""; // barligin biriktiru ushin zholga biriktiremiz
                 while(a !=0){
                     b = a%2;// 2 bolg kald saktap zholga biriktiredi
                     temp = b + temp;
                     a = a/2; // sicl a sanin 2 ge bolui 0 ten bolg isteidi
                 } System.out.print(temp); // manderimiz temp zholina saktsldi, oni ekranga shigarami
                 return b;
             }
            public static void main(String [] args) {
                ekilik(8); // func shakiramiz
            }
        }


