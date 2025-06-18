class Solution {
  int answer = 0;
    public int solution(int k, int[][] dungeons) {
        boolean[] getRoute = new boolean[dungeons.length];
        
        int count = 0;
        getAnswer(k, dungeons, getRoute, count);
        return answer;
    }
    
    void getAnswer(int k, int[][] dungeons, boolean[] getRoute, int count){
        boolean end = false;
        for(int i=0; i<dungeons.length; i++){
            if(getRoute[i]!=true && dungeons[i][0] <= k){
                getRoute[i] = true;
                getAnswer(k - dungeons[i][1], dungeons, getRoute, count+1);
                getRoute[i] = false;
                end = true;
            }
        }
        
        if(end == false){
            if(answer < count){
                answer = count;
            }
        }
        return;
    }
    
    
}