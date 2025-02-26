import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int dup=-1;
        int count=0;
        // 만들어야 할 배열 크기 확인
        for(int i=0; i<arr.length; i++){
            if(dup!=arr[i]){
                count++;
                dup=arr[i];
            }
        }
        int[] answer = new int[count];
        // 배열에 대입
        count = 0;
        dup= -1;
        for(int i=0; i<arr.length; i++){
            if(dup!=arr[i]){
                dup = arr[i];
                answer[count] = arr[i];
                count++;
            }
        }
        
        System.out.println("Hello Java");

        return answer;
    }
}