import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//      [모의고사]
        int[] answers = {1,3};
//      ----------------------------------
        int[] user1 = {1, 2, 3, 4, 5};
        int[] user2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] user3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] num = new int[3];
        ArrayList<Integer> list = new ArrayList<>();
        int u1 = 0;
        int u2 = 0;
        int u3 = 0;

        for(int i=0; i<answers.length; i++){
            if(user1[i%5] == answers[i]){
                num[0]++;
            }
            if(user2[i%8] == answers[i]){
                num[1]++;
            }
            if(user3[i%10] == answers[i]){
                num[2]++;
            }
        }

        int max = Math.max(Math.max(num[0], num[1]), num[2]);
        if(max == num[0]){
            list.add(1);
        }
        if(max == num[1]){
            list.add(2);
        }
        if(max == num[2]){
            list.add(3);
        }

        Integer[] answer = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(answer));



    }
}

