import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        for(int i=0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        
        int max1 = 0;
        int max2 = 0;
        for(int i=0; i<sizes.length; i++){
            if(max1 <= sizes[i][0]){
                max1 = sizes[i][0];
            }
            if(max2 <= sizes[i][1]){
                max2 = sizes[i][1];
            }
        }
        
        answer = max1 * max2;
        return answer;
    }
    

}