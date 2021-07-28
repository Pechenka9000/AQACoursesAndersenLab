package school.lesson1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import  java.io.IOException;

public class HomeWorkApp {
    public static void main(String[] args) throws IOException{
     /*2*/  HomeWorkApp.printThreeWords();
     /*3*/  System.out.println(HomeWorkApp.checkSumSign());
            HomeWorkApp.checkSumSignVol2();
     /*4*/  HomeWorkApp.printColor();
     /*5*/  HomeWorkApp.compareNumbers();
    }
    public static void printThreeWords(){
       System.out.println("Orange");
       System.out.println("Banana");
       System.out.println("Apple");
    }
    public static String checkSumSign(){
        int a = 27;
        int b = -21;
        int sum= a + b;
        if(sum >= 0)return "Сумма положительная";
        else return "Сумма отрицательная";

    }
    public static void  checkSumSignVol2() throws IOException {
        /* В задании сказано "объявить переменные, но не сказано
        как именно. Я решил использовать 2 различных способа.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число 'a'");
        int a = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 'b'");
        int b = Integer.parseInt(reader.readLine());
        int sum= a + b;
        if(sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value=157;
        if(value<=0) {
            System.out.println("Красный");
        } else
            if(value > 0 & value <=100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
    }

    public static void compareNumbers(){
        int a, b;
        a = 10; b = 5;
        String s = (a>=b)?"a >= b" : "a < b";
        System.out.println(s);
    }
}
