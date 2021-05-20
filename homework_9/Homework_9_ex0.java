package com.tms.homework_9;

import java.util.Locale;
public class Homework_9_ex0 {
   private static String docNumb="4563-ABH-6543-HNF-2Y6U";
    private static StringBuilder sb=new StringBuilder(docNumb);
    //Выводит на экран в одну строку два первых блока по 4 цифры.
    private static void paragraph1(){
       System.out.println("Выводит на экран в одну строку два первых блока по 4 цифры.");
       System.out.print( docNumb.substring (0, 4));
       System.out.print(" "+docNumb.substring (9, 13));
       System.out.println();
       System.out.println("-----------------------------");
   }
    //Выводит на экран номер документа , но буквы заменяет на *.
    private static void paragraph2(){
        System.out.println("Выводит на экран номер документа , но буквы заменяет на *.");
        System.out.println(docNumb.replace("ABH","***").replace("HNF","***"));
        System.out.println("-----------------------------");
    }
    //Выводит буквы из номeра документа.
    private static void paragraph3(){
        System.out.println("Выводит буквы из номeра документа.");
        System.out.println(docNumb.toLowerCase(Locale.ROOT).substring(5,8)+"/"+docNumb.toLowerCase(Locale.ROOT).substring(14,17)+ "/"+ docNumb.toLowerCase(Locale.ROOT).substring(19,20)+"/"+ docNumb.toLowerCase(Locale.ROOT).substring(21,22));
        System.out.println("-----------------------------");
    }
    //Выводит на экран буквы из номера документа в верхнем регистре.
    private  static void paragraph4(){
        System.out.println("Выводит на экран буквы из номера документа в верхнем регистре.");
        System.out.println("Litters:"+sb.substring(5,8)+"/"+sb.substring(14,17)+ "/"+ sb.substring(19,20)+"/"+ sb.substring(21,22));
        System.out.println("-----------------------------");
    }
    //Проверяет входит ли в номер документа последовательность abc и выводит сообщение об этом.
    private static void paragraph5(){
        System.out.println("Проверяет входит ли в номер документа последовательность abc и выводит сообщение об этом.");
        if (docNumb.equalsIgnoreCase("ABC")){
            System.out.println("Последовательность АВС входит в данную строку.");
        }
        else {
            System.out.println("Последовательность АВС не входит в данную строку.");
        }

        System.out.println("-----------------------------");
    }
    //Метод который проверяет начинается ли номер документа с последовательности 555 и выводит сообщение об этом.
    private static void paragraph6(){
        System.out.println("Проверяет начинается ли номер документа с последовательности 555 и выводит сообщение об этом.");
       if (docNumb.startsWith("555")){
           System.out.println("Номер документа начинается с 555");
       }
       else {
           System.out.println("Номер документа не  начинается с 555");
       }

        System.out.println("-----------------------------");
    }
//Проверяет не заканчивается ли номер документа на последовательность 1A2B.
private static void paragraph7(){
        System.out.println("Проверяет не заканчивается ли номер документа на последовательность 1A2B.");
        if (docNumb.endsWith("555")){
            System.out.println("Номер документа заканчивается на 1А2В");
        }
        else {
            System.out.println("Номер документа не заканчивается на 1А2В");
        }

        System.out.println("-----------------------------");
    }
     public static void main(String[] args) {
        System.out.println("Номер документа");
        System.out.println("4563-ABH-6543-HNF-2Y6U");
        System.out.println("--------------------------------");
        paragraph1();
        paragraph2();
        paragraph3();
        paragraph4();
        paragraph5();
        paragraph6();
        paragraph7();
    }
}


