class Solution {
    
    static int min = 0;
    static int count2 = 0;
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        min = words.length + 1;
        
        boolean[] useNum = new boolean[words.length];
            
        getMin(begin, target, words, 0, useNum);
        

        
        
        
        if(min == words.length + 1){
            return 0;
        }
        else{
            return min;
        }
    }
        /* 탐색 문제
         (메서드 1에서 해야 할 일 = 겹치는 단어 찾기) 
         우선 begin 단어의 길이 == length()
         겹치는 수가 (길이 -1)이어야함
         
         (메서드 2에서 해야 할 일 = 탐색)
         
         테스트 3 반례?
         > 배열 3번째로 갔다가 1번째 - 최종 으로 가는게 빠른 경우가 있음
         
         그럼 한번 바뀌었던 건 안 바뀌어야 함
         
         실수한 점 = 배열은 주솟값임
         
         */
    
    void getMin(String start, String target, String[] words, int getCount, boolean[] useNum)
    { 
        boolean[] useNum2 = new boolean[useNum.length];
        
        for(int i=0; i<useNum.length; i++){
            useNum2[i] = useNum[i];
        }
        
        if(start.equals(target)){ 
            System.out.println("equals 도달값 : " + getCount);
            if(getCount < min){
                
                min = getCount;
                return;
            }
        }
       getCount++;
        for(int i=0; i<words.length; i++){
            
            
            
            if(getDuplication(start, words[i])){
                if(useNum2[i] == false){
                    System.out.println("duplication 통과 : " + words[i] + " " + getCount);
                    useNum2[i] = true;
                    getMin(words[i], target, words, getCount, useNum2);     
                }
            }
        }
        
    }
    
    
    
    
    boolean getDuplication(String a, String b)
    {
        boolean duplication = false;
        int count = 0;
        for(int i = 0; i<a.length(); i++)
        {
            if(a.charAt(i)==b.charAt(i)){
                count++;
            }
        }
        if(count==a.length()-1){
            duplication = true;
        }      
        return duplication;
    }
}