class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        String[] word = s.split("");
        int j;
        int temp;
        for(int i=word.length-1; i>=1; i--){
            int count =0;
            temp=0;
            for(j=i-1; j>=0; j--){
                count++;
                if(word[i].equals(word[j])){
                    temp = -1;
                    break;
                }
            }
            if(count==i&&temp==0){
                count=-1;
            }
            answer[i] = count;
        }
        return answer;
    }
}