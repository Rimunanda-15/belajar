import java.util.Arrays;

public class sumLargest {
    public static void main(String[] args) {
        int[] numbers = { 5, 8, 3, 9, 2 };
        int result = sumOfTwoLargest(numbers);
        System.out.println(numbers);
        System.out.println("Jumlah dua angka terbesar: " + result);
    }

     public static int sumOfTwoLargest(int[] numbers) {
        // Mengurutkan array dalam urutan menurun
        Arrays.sort(numbers);
        // Mengembalikan penjumlahan dua angka terbesar
        return numbers[numbers.length - 1] + numbers[numbers.length - 2];
    }
}