import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        // answer 배열의 크기는 commands.length만큼
        int[] answer = new int[commands.length];
        // 문제 풀이 순서 고민
        // i만큼 반복, i는 commands.length
        for (int i=0; i<commands.length; i++){
        // commands[i][0], commands[i][1] 의 차이 + 1 개 크기의 배열 생성
            int[] forAnswer = new int[commands[i][1] - commands[i][0] + 1];
        // array 내 [i][0]-1 부터 [i][1]-1 까지의 숫자를 담는다.
            int count = 0;
                for(int j=0; j<forAnswer.length; j++){
                forAnswer[j] = array[commands[i][0 ]-1 + count];
                count++;            
                }

           
        // array.sort 사용, 혹은 선택 정렬 사용
            Arrays.sort(forAnswer);
        // commands[i][k] 의 숫자를 반환, answer에 입력 
            answer[i] = forAnswer[commands[i][2]-1];
        }
       

        return answer;
        
    }
}