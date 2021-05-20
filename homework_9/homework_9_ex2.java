package com.tms.homework_9;

public class homework_9_ex2 {
    //Метод который вычисляет сколько видов символов в слове.
    private static int world(String w) {
    StringBuilder sb= new StringBuilder();
        String letter;
        for (int i=0; i<w.length(); i++) {
            letter = String.valueOf(w.charAt(i));
            if (sb.indexOf(letter) == -1) {
                sb.append(letter);
            }
            }
        return sb.length();
        }



    public static void main(String[] args) {
        //Преобразование слов строки в элементы массива.
        String str = "ttyuit t Mia hotrk";
        String[] array = str.split(" ");
        //Сортирует элементы массива от минимального количества видов символов в слове к максимальному.
        String rez = array[0];
        for (int i = 0; i < array.length; i++) {
            if (world(array[i]) < world(rez)) {
                rez = array[i];
            }
        }
        System.out.println("Слово с наименьшим видом символов"+rez);
    }
        }



