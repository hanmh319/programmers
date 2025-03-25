import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        boolean[] forAnswer = new boolean[n];
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i] = -1;
                    reserve[j] = -1;
                }
            }
        }
        
        for(int i=0; i<lost.length; i++){
            if(lost[i] != -1)
            forAnswer[lost[i]-1] = true;
        }
        
        for(int i=0; i<reserve.length; i++){
            if(reserve[i] != -1){
                

            if(reserve[i]>1&&forAnswer[reserve[i]-2])   {
                  forAnswer[reserve[i]-2] = false;
                   continue;      
            }
            if(reserve[i]>1&&reserve[i]<n&&forAnswer[reserve[i]-2]) {
                forAnswer[reserve[i]-2] = false;
                continue;
            }
            if(reserve[i]>1&&reserve[i]<n&&forAnswer[reserve[i]]) {
                forAnswer[reserve[i]] = false;
                continue;
            }
            if(reserve[i]<n &&forAnswer[reserve[i]]){
                forAnswer[reserve[i]] = false;
                continue;
            }
            }
        }
        
        for(int i=0; i<forAnswer.length; i++){
            if(!forAnswer[i])
                answer++;
        }
        
        return answer;
    }
}