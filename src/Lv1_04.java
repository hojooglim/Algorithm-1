public class Lv1_04 {
    public static void main(String[] args) {
//      [서울에서 김서방 찾기]

        String[] seoul = {"Kim", "Jane","mari","happy"};
//      ----------------------------------
        String answer = "";
        int count = -1;
        for(String name : seoul){
            count++;
            if(name.equals("Kim")){
                break;
            }

        }
        answer = "김서방은 " + count + "에 있다";
        System.out.println(answer);

    }
}
