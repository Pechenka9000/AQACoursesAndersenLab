package school.lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Utils {
    //Cканер
    public static int numScanner() {
       Scanner scanner = new Scanner(System.in);
       return scanner.nextInt();
    }

    //Ридер целых чисел из консоли.
    public static int numReader() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        return Integer.parseInt(reader.readLine());
    }

    //Ридер строк из консоли.
    public static String stringReader() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    //Создатель одномерного целочисленного массива длиной 'z'.
    public static int[] arrayCreator(int z) {
        int[] array = new int[z];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        } return array;
    }

    //Создатель целочисленного(со случайными числами) массива длинной 'z'.
    public static int[] arrayCreatorRandoms(int z, int w) {
        Random random = new Random();
        int[] array = new int[z];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(w);
        }
        return array;
    }

    public static int[] arrayCreatorConst(int[] array) {
        return array;
    }

    //Создатель двумерного целочисленного массивов длиной 'b' и высотой 'a'.
    public static int[][] arrayCreator2 (int a, int b) {
        int[][] array = new int[a][b];
        return array;
    }

    //Вывод одномерного целочисленного массива в консоль.
    public static void arrayOut(int[] array){
        System.out.println(Arrays.toString(array));
    }

    //Вывод двумерного целочисленного массива в консоль.
    public static void arrayOut2(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }



}
