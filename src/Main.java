public class Main {
    public static void main(String[] args) {
//      [수박수박수박수박수박수?]
        int n = 3;
//      --------------------------------
        String answer = "";

        for(int i=0; i<n; i++){
            answer += (i%2==0) ? "수" : "박";
        }
        System.out.println(answer);
    }
}