import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5,0,2,7};

        //중복x
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 1+i; j < numbers.length; j++) {
                int a = numbers[i]+numbers[j];
                hashSet.add(a);
            }
        }

        Integer[] answer = hashSet.toArray(new Integer[0]);
        Arrays.sort(answer);

    }
}