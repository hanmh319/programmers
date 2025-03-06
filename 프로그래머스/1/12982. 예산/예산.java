class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int index = -1, temp = -1;
        int min = -1;
        int i, j;
        for(i=0; i<d.length-1; i++){
            min = d[i];
            index = -1;
            for(j=i+1; j<d.length; j++){
                if(min>d[j]){
                    min = d[j];
                    index = j;
                }
            }
            if(index!=-1){
                temp = d[i];
                d[i] = d[index];
                d[index] = temp;
            }
        }
        int sum = 0;
        for(i=0; i<d.length; i++){
            if(budget<d[i]){
                break;
            }
            budget -= d[i];
            answer++;
            
        }
        return answer;
    }
}