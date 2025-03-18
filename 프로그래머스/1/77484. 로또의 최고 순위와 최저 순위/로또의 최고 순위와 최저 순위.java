class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCheck = 0;
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                zeroCheck++;
            }
        }
        
        // 구매, win_nums 교차확인
        int winCheck = 0;
        for(int i=0; i<lottos.length; i++){
            for(int j=0 ; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    winCheck++;
                }
            }   
        }
        int hope;
        
        hope = winCheck + zeroCheck;
        if(hope>=6){
            hope = 6;
        }
        if(hope<=1){
            hope=1;
        }
        
        if(winCheck <= 1){
            winCheck = 1;
        }
        int[] answer = {7-hope, 7-winCheck };
        
        return answer;
    }
}