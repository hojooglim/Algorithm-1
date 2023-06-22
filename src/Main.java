import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        Arrays.sort(score);
        //k는 그렇게 크게 중요하지 않음.
        //스코어를 m만큼 뽑아서 그안에 작은 숫자 * m = answer
        //스코어를 정렬 큰순서대로하면 좋은데 몰라서 for문을 거꾸로 돌렸음. 큰순서대로 m만큼 배열에 담음.
        //m만큼이 담긴 배열에서 제일 작은 숫자를 뽑아서  m을 곱한 값을 만들어주고 ++;

        ArrayList<Integer> box = new ArrayList<>();
        int answer = 0;
        //다른 사람 풀이 ㅡㅡ
        //i조건? for(int i = score.length; i >= m; i -= m){
        //            answer += score[i - m] * m;
        //        }
        for (int i = score.length-1 ; i >= 0 ; i--) {
            if (box.size()<m){
                box.add(score[i]);
                if(box.size()==m){
                    answer+=box.get(m-1)*m;
                }
            }else {
                box.clear();
                box.add(score[i]);
            }
        }
    }
}