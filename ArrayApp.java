import java.util.Random;
import java.util.Scanner;

public class ArrayApp {
    public  static void print_array1D(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1) + " inci eleman: " + array[i]);
        }
    }

    public static void arrayApp_print(int[] array){
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<array.length;i++){
            System.out.println((i+1) + " inci eleman");
            array[i]=scan.nextInt();
        }
    }

    public static void randomm(int[] array){
        Random random=new Random();
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt(51);
        }
    }

    public static int[] arrayApp_print() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz:");
        int length = scan.nextInt();
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + " inci eleman");
            array[i] = scan.nextInt();
        }
        return array;
    }
}
