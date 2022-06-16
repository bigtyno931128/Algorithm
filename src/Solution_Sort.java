import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//프로그래머스 -완주 하지 못한 선수
public class Solution_Sort {

    public String solution(String[] participant, String[] completion) {

        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1);
            // leo : 1 eden : 1 , kiki : 1
        }


        for (String player : completion) {
            map.put(player, map.get(player) - 1);

        }

        // leo : 1 eden : 0 , kiki : 0

        // result :  leo : 1 eden : 0 , kiki : 0  = map

        Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator();

        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();

            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        Solution_Sort sol = new Solution_Sort();
        System.out.println(sol.solution(part, comp));
    }

}
