public class Main {
    public static void main(String[] args) {
//      [음양 더하기]
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true,false,true};
//      ------------------------------------
        int answer = 0;

        for(int j=0; j<signs.length; j++){
//          삼항연산자 사용
            answer = signs[j] ? (answer += absolutes[j]) : (answer -= absolutes[j]);
        }
        System.out.println(answer);

    }
}