public class Main {

    public static void main(String[]args) {


        int[] a = new int[10];
        ArrayApp.print_array1D(a);
        ArrayApp.arrayApp_print(a);


        int[] b = new int[50];
        ArrayApp.randomm(b);
        ArrayApp.print_array1D(b);


        int[] c = ArrayApp.arrayApp_print();
        ArrayApp.print_array1D(c);

        double array_avg = ArrayApp_Islem.Array_avg(4);
        System.out.println(array_avg);



        int[] sayilar = {9, 2, 6, 1, 7};
        System.out.println("En küçük eleman: " + ArrayApp_Islem.Min(sayilar));


        int[] num = {5, 3, 8, 1, 9};
        System.out.println("En büyük eleman: " + ArrayApp_Islem.Max(num));
    }
}
