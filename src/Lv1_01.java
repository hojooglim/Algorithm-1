import java.util.Arrays;

public class Lv1_01 {
    public static void main(String[] args) {
//      [과일 장수]

        int k = 3; // 최대 점수
        int m = 4; // 사과의 개수
        int[] score = {1, 2, 3, 1, 2, 3, 1};
//      --------------------------------------------
        int answer = 0;
        int num = 0;
        int[] apple = new int[score.length];

        Arrays.sort(score); // 정렬 : [1,1,1,2,2,3,3]

        for(int i=0; i<score.length; i++){ // 역정렬 : [3,3,2,2,1,1,1]
            apple[i] = score[score.length - i -1];
        }

        while(true){ // if문에 해당 될때까지 무한반복
            if(apple.length <= num || num+m > apple.length){
                // apple배열 길이(7) <= num(apple배열의 인덱스) 또는 num(apple배열의 인덱스)+m(4) > apple배열 길이(7)
                // 7 <= 4 또는 4+4 > 7
                break;
            }
            answer += apple[num+m-1] * m; // apple[인덱스+사과수-1(배열은 0부터 시작이니깐 -1)] * m(사과수)
            num += m; // num이 apple[]의 인덱스니깐 m의 수 만큼 더해준다. 배수라 보면 쉬움.
        }

        System.out.println(answer);






    }
}
