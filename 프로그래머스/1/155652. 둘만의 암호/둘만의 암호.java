class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        int count = 0;
        String temp;
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            count =0;
            while(true){
                a++;
                count++;
                if(a==123){
                    a = 97;
                }
                temp = String.valueOf(a);
                if(skip.contains(temp)){
                    count--;
                }
                if(count==index){
                    break;
                }
            }
            answer += temp;
        }
        
        return answer;
    }
}