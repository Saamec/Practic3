import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DeleteEven deleteEven = new DeleteEven();
        MergeSort sort = new MergeSort();
        MinMaxMean minMaxMean = new MinMaxMean();

        int[] array = {34,573,87,53,39,6,567,236,97,92,68,23,1,67};
        List<Integer> array2 = new ArrayList<>(
                Arrays.asList(54, 84, 32, 70, 60, 56, 98, 16, 58));

        sort.SortUnsorted(array, 0, array.length -1);
        for (int value: array) {
            System.out.print(value + " ");
        }

        System.out.println(" ");

        List<Integer> rez = new ArrayList<>();
        rez.addAll(deleteEven.Deleter(array));
        for (int value: rez) {
          System.out.print(value + " ");
        }

        System.out.println(" ");

        double[] mmm = minMaxMean.MMM(array2);
        System.out.println("Минимальное число " + (int)mmm[0] + ", Максимальное число " + (int)mmm[1] + ", Среднее арифметическое " + mmm[2]);


    }
}