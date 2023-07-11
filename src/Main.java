import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
//      [두 개 뽑아서 더하기]
//      -------------------------------------
        HashSet<Integer> num = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                num.add(numbers[i] + numbers[j]);
            }
        }

        ArrayList<Integer> arr = new ArrayList<>(num);
        Collections.sort(arr);

        // int[] 타입으로 변환
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] += arr.get(i);
        }
        System.out.println(answer);
    }
}