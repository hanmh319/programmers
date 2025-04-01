class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length()==4||s.length()==6){
            try{
                int forAnswer = Integer.parseInt(s);
            } catch (Exception e) {
                return false;
            }
        }
        else{
            return false;
        }
     
        
        
        
        
        return answer;
    }
}