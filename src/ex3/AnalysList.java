//package ex3;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//
///*
//Реализуйте метод, который принимает на вход целочисленный массив arr:
//- Создаёт список ArrayList, заполненный числами из исходого массива arr.
//- Сортирует список по возрастанию и выводит на экран.
//- Находит минимальное значение в списке и выводит на экран - Minimum is {число} - Находит максимальное значение в списке и выводит на экран - Maximum is {число}
//- Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
//Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:
//
//Integer[] arr - массив целых чисел.
// */
//public class AnalysList {
//    public static void main(String[] args) {
//        int [] arr = {4, 2, 7, 5, 1, 3, 8, 6, 9};
//analyzeNumbers(arr);
//    }
//static void analyzeNumbers(int[] arr){
//    List<Integer> list = new ArrayList<>();
//    int sum = 0;
//    for (int i = 0; i < arr.length; i++) {
//        list.add(arr[i]);
//        sum += arr[i];
//    }
//    list.sort(null);
//    System.out.println(list);
//    System.out.println("Minimum is " + Collections.min(list));
//    System.out.println("Maximum is " + Collections.max(list));
//    System.out.println("Average is = " + sum/ arr.length);
//}
//}
