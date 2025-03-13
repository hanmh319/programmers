class Solution {
    public String solution(int n) {
        String answer = "";
        int count = 1;
        while(true){
            if(count%2==0){
                answer += "박";
            }
            else{
                answer += "수";
            }
            
            if(count==n){
                break;
            }
            count++;
        }
        return answer;
    }
}