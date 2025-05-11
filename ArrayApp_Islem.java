public class ArrayApp_Islem {

    // Ortalama Hesaplama

    public static double Array_avg(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        double array_avg = (double) sum / N;
        return array_avg;
    }

    // Min Deger Bulma

    public static double Min(int[] array) {
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Max Deger Bulma

    public static double Max(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }

}
