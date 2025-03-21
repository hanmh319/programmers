class Solution {
    static int count = 0;
    public int solution(int num) {
        long number = (long)num;
        int answer = (int) forSolution(number);
        if( answer >= 500){
            answer = -1;
        }
        return answer;
    }
    
    long forSolution(long a){
        if(a==1){
            return count;
        }
        count++;
        if(a%2 == 0)
            return forSolution(a/2);
        else
            return forSolution(a*3 + 1);
    }
}