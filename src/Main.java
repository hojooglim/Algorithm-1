public class Main {
    public static void main(String[] args) {
        int price = 3;
        int money = 20;
        int count = 4;

        long countPrice = 0;
        long answer = -1;
        // 즉, 처음 이용료가 100이었다면 2번째에는 200, 3번째에는 300으로 요금이 인상됩니다.
        for (int i = 1; i <= count ; i++) {
            countPrice += price*i;
            answer = money-countPrice;
        }

        //금액에서 얼마가 모자라는지를 return
        //단, 금액이 부족하지 않으면 0을 return
        if (answer<0) {
            System.out.println(answer*-1);
        } else {
            System.out.println(0);
        }
    }
}