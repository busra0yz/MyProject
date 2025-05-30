public class Method_1 {
    // Örnek 1 : İki sayının toplamını yazdıran metot

    public static int Sum(int a, int b) {
        return a + b;
    }

    //Örnek 2 : 1'den N'e kadar olan sayıların ortalamasını döndüren metot

    public static double Average(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        double avg = (double) sum / N;
        return avg;
    }

    // Örnek 3 : Bir dizinin elemanlarının toplamını yazdıran metot

    public static void ArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    // Örnek 4 : Bir dizinin elemanlarının ortalamasını döndüren metot

    public static double Array_avg(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        double array_avg = (double) sum / N;
        return array_avg;
    }

    // Örnek 5 : Bir dizideki en küçük elemanı dödüren metot

    public static double EnK(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Örnek 6 : Bir dizideki en büyük elemanı döndüren metot

    public static double EnB(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

    // Örnek 7 : Bir matrisin her satırındaki en küçük elemanları bulup döndüren metot

    public static int[] satirMin(int[][] matris) {
        int[] minler = new int[matris.length];

        for (int i = 0; i < matris.length; i++) {
            int min = matris[i][0];
            for (int j = 1; j < matris[i].length; j++) {
                if (matris[i][j] < min) {
                    min = matris[i][j];
                }
            }
            minler[i] = min;
        }

        return minler;
    }

    // Örnek 8 : Bir matrisin her sütunundaki en büyük elemanları bulup döndüren metot

    public static int[] sutunMax(int[][] matris) {
        int satirSayisi = matris.length;
        int sutunSayisi = matris[0].length;
        int[] makslar = new int[sutunSayisi];

        for (int j = 0; j < sutunSayisi; j++) {
            int max = matris[0][j];
            for (int i = 1; i < satirSayisi; i++) {
                if (matris[i][j] > max) {
                    max = matris[i][j];
                }
            }
            makslar[j] = max;
        }

        return makslar;
    }


    public static void main(String[] args) {
        // Örnek 1:

        int result = Sum(2, 3);
        System.out.println("Sum: " + result);

        //Örnek 2:

        double average = Average(5);
        System.out.println("Average: " + average);


        // Örnek 3 :

        int[] dizi = {2, 5, 6, 3, 8};
        ArraySum(dizi);

        // Örnek 4 :

        double array_avg = Array_avg(4);
        System.out.println(array_avg);

        // Örnek 5 :

        int[] sayilar = {9, 2, 6, 1, 7};
        System.out.println("En küçük eleman: " + EnK(sayilar));

        // Örnek 6 :

        int[] num = {5, 3, 8, 1, 9};
        System.out.println("En büyük eleman: " + EnB(num));


        //Örnek 7 :

//        int[][] matris = {
//                {3, 5, 2},
//                {8, 1, 4},
//                {7, 6, 9}
//        };
//
//        int[] sonuc = satirMin(matris);
//
//        for (int x : sonuc) {
//            System.out.print(x + " ");
//        }
//    }

        // Örnek 8 :
        int[][] matris = {
                {3, 5, 2},
                {8, 1, 4},
                {7, 6, 9}
        };

        int[] sonuc = sutunMax(matris);

        for (int x : sonuc) {
            System.out.print(x + " ");
        }
    }
}




