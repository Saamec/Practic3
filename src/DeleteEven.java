import java.util.ArrayList;
import java.util.List;

public class DeleteEven {
    public List<Integer> Deleter(int [] array){
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                result.add(array[i]);
            }
        }
        return result;
    }
}
