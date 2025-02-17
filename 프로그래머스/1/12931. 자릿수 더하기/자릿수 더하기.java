import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nWord = n + "";
        String[] answerArray = nWord.split("");
        for(int i=0; i<answerArray.length; i++){
            answer += Integer.parseInt(answerArray[i]);
        }
        return answer;
    }
}