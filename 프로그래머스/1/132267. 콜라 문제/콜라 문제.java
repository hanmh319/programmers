class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int forCoke = a;
        int getCoke = b;
        int haveCoke = n;
        
        while(true){
            if(haveCoke>=forCoke){
                answer += (haveCoke/forCoke)*getCoke;
                haveCoke = (haveCoke/forCoke)*getCoke + (haveCoke%forCoke);
            }
            else{
                break;
            }
        }
        
        return answer;
    }
}