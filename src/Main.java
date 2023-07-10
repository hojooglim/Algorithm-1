import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//      [숫자 문자열과 영단어]
        String s = "one4seveneight";
//      --------------------------------

        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");

        for(String n : map.keySet()){
            s = s.replaceAll(n, map.get(n));
        }

        int answer = Integer.parseInt(s);
        System.out.println(answer);


    }
}