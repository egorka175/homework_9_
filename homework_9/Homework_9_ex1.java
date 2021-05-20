package com.tms.homework_9;

public class Homework_9_ex1 {
    public static void main(String[] args) {

//Преобразование слов строки в элементы массива.
        String str = "right left Maria homework";
        String[] array = str.split(" ");

//Сортировка элементов массива пузырьком.
        for (int h = array.length - 1; h > 0; h--) {
            for (int j = 0; j < h; j++) {

                if (array[j + 1].length() > array[j].length()) {
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;

                }

            }

        }
        //Вывод по результатам сортировки первого(самого длиного ) и последнего(самого короткого) слова.
        System.out.println("Самое короткое слово: "+array[array.length-1]);
        System.out.println("Самое длиное слово: "+array[0]);
        System.out.println(str.indexOf("q"));
    }

    }

