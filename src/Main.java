import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] seoul = {"Jain", "kim"};
        String answer;

        int idx = 0;
        String kim = "kim";

        for (int i = 0; i < seoul.length ; i++) {
            if(kim.equals(seoul[i])){
                idx=i;
                break;
            }
        }
        answer = "김서방은 "+idx+"에 있다";
        System.out.println(answer);


    }
}