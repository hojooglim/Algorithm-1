import java.util.*;

public class Main {
    public static void main(String[] args) {
        //실패율은 다음과 같이 정의한다.
        //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
        int N = 5;
        int[] stage ={2, 1, 2, 6, 2, 4, 3, 3};
        Arrays.sort(stage);
        //1,2,2,2,3,3,4,6
        // 각 스테이지 마다 실패율이 있음 -> 해쉬맵
        //조건1) 스테이지에 도착한 사람 ++
        //조건2) 스테이지에 도착햇지만 클리어하지 못한 사람 ++
        double a = 0; // 도착한사람
        double b = 0; // 도착했지만 클리어하지 못한 사람
        Double c; // 실패율 = b/a
        HashMap<Integer,Double> hashMap = new HashMap<>();
        ArrayList<Double> arrayList = new ArrayList<>();
        for (int i = 1; i <= N ; i++) {
            for (int j = 0; j < stage.length ; j++) {
                if(i <= stage[j]){ //스테이지에 도착한 사람
                    a++; // 도착한 사람;
                    if (i == stage[j]){ //도착햇지만 클리어하지 못한 사람
                        b++;
                    }
                }
            }
            c=(b/a);
            hashMap.put(i,c);
            arrayList.add(c);
            a=0;
            b=0;
        }
        //정렬이 어렵네..
        //valve를 통해서 key값 만 뽑아내면 간단한데 골치 아푸게하네~
        System.out.println(arrayList);
//        Collections.reverse(arrayList);
//        System.out.println(arrayList);// ? 0이 맨앞으로 감

        // arrayList.sort(Comparator.reverseOrder());
        Collections.sort(arrayList, Collections.reverseOrder());
        //일단 내림차순 방법 2개

        System.out.println(arrayList);
        System.out.println(hashMap);

        ArrayList<Integer> answer =new ArrayList<>();
        for (int i = 0; i <arrayList.size() ; i++) {
            for (Integer o : hashMap.keySet()) {
                if (hashMap.get(o).equals(arrayList.get(i))) {
                    if(!answer.contains(o)){
                        answer.add(o);
                    }
                }
            }
        }
        System.out.println(answer);
        //?정답률 70

    }
}