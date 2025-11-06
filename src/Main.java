import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание №1 ");


        int[] integers = new int[3];
        double[] fractional = {1.57, 7.654, 9.986};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};


        System.out.println(" Задание №2 ");


        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int a = 0; a < integers.length; a++) {
            System.out.print(integers[a]);
            if (a < integers.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("");


        for (int i = 0; i < fractional.length; i++) {
            System.out.print(fractional[i]);
            if (i < fractional.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("");


        for (int c = 0; c < numbers.length; c++) {
            System.out.print(numbers[c]);
            if (c < numbers.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();


        System.out.println(" Задание №3 ");


        for (int x = integers.length -1; x >= 0; x--) {
            System.out.print(integers[x]);
            if (x > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println("");


        for (int b = fractional.length - 1; b >= 0; b--) {
            System.out.print(fractional[b]);
            if (b > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println("");


        for (int r = numbers.length - 1; r >= 0; r--) {
            System.out.print(numbers[r]);
            if (r > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println("");


        System.out.println(" Задание №4 ");


        for (int z = 0; z < integers.length; z++) {
            if (integers[z] % 2 != 0) {
                integers[z] += 1;
            }
        }
        System.out.print(Arrays.toString(integers));
    }
}