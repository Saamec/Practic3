import java.util.ArrayList;
import java.util.List;

public class MinMaxMean {
    public double[] MMM(List<Integer> array){
    int min = array.get(0);
    int max = 0;
        int sum = 0;
    for (int i = 0; i < array.size(); i++){
        if (array.get(i) < min) min = array.get(i);
        if (array.get(i) > max) max = array.get(i);
        sum += array.get(i);
    }
        double mean = (double) (sum) / array.size();

        return new double[]{min, max, mean};
    }
}
