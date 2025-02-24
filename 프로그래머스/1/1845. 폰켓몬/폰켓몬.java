class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 1. 배열 길이 / 2를 구한 뒤 set 길이랑 비교해서 더 짧은게 답임
        // 2. 단순 알고리즘으로 풀기
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                        nums[j]=-1;
                    }
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=-1){
                count++;
            }
        }
        if(count>=nums.length/2){
            answer = nums.length/2;
        }
        else{
            answer = count;
        }
        return answer;
    }
}