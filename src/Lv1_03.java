public class Lv1_03 {
    public static void main(String[] args) {
//      [부족한 금액 계산하기]
        int price = 3;
        int money = 20;
        int count = 4;
//      -------------------------------------
        long answer = 0;
        long total = 0;

        for(int i=1; i<=count; i++){
            total += price * i;
        }

        if(money < total){
            answer = total-money;
        }else{
            answer = 0;
        }

        System.out.println(answer);
    }
}
