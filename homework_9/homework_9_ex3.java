package com.tms.homework_9;

import java.util.Scanner;

public class homework_9_ex3 {
    //Метод который преобразовывает слово наоборот.
    private static String word(String st){
        StringBuilder sb= new StringBuilder();
        String line;
        for(int i=st.length()-1;i>=0; i--) {
            line = String.valueOf(st.charAt(i));
            sb.append(line);

        }

        return sb.toString();
        }



    public static void main(String[] args) {


        String str = "madam ydar home 1shalahs1";
        String[] array = str.split(" ");
        System.out.print("Введите число для проверки слова , является ли онo полиндромом: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //Проверяет входит ли введенное пользователем слово в размер массива.
        if (n<= array.length) {
            //Сравнивает слово выбранное пользователем и преобразованное задом наперед это же слово.
            if (array[n].equalsIgnoreCase(word(array[n]))) {
                System.out.println("Слово является полиндромом");
            } else {
                System.out.println("Слово не является полиндромом");
            }
        }
        else{
            System.out.println("Такого слова в данной строке не существует попробуйте еще раз.");
        }
    }
}