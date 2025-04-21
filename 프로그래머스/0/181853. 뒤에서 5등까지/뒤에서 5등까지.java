class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        int min;
        int index = -1;
        for(int j=0; j<answer.length; j++){
            min = 1000000;
            for(int i=0; i<num_list.length; i++){
                if(min > num_list[i]){
                    min = num_list[i];
                    index = i;
                }   
            }
            num_list[index] = 100000;
            answer[j] = min;
        }
        
        
        return answer;
    }
}