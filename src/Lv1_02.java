import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lv1_02 {
    public static void main(String[] args) {
//      [실패율]
//      N : 전체 스테이지 개수
//      stages : 사용자가 현재 멈춰있는 스테이지 번호
//      실패율 : 클리어하지 못한 플레이어 수 / 스테이지에 도달한 플레이어 수

        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
//      ----------------------------------------------------------

        int[] answer = new int[N]; // return 값을 받을 배열
        int[] count = new int[N]; //
        Map<Integer, Double> fail = new HashMap<>(); // key(스테이지), value(실패율)
        int total = stages.length;

        for(int i=0; i<stages.length; i++){
            if(stages[i] == N + 1){
                continue;
            }
            count[stages[i] - 1]++;
        }

        for(int i=0; i<count.length; i++){
            if(total == 0){
                fail.put(i, 0d);
                continue;
            }
            fail.put(i, (double)count[i] / (double)total);
            total -= count[i];
        }
        for (int i = 0; i < N; i++) {
            double max = -1;
            int maxKey = 0;

            for (int key : fail.keySet()) {
                if (max < fail.get(key)) {
                    max = fail.get(key);
                    maxKey = key;
                }
            }

            answer[i] = maxKey + 1;
            fail.remove(maxKey);

            System.out.println(Arrays.toString(answer));
        }





























    }
}
