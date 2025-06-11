class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        getPlusorMinus(numbers, target, 0, 0); 
      
        return answer;
    }
    // 총 갯수 = 모든 걸 탐색해야됨 (경로 자체의 특징 및 최종 결과값 저장) 
    // 재귀 = DFS로 풀기?
    // 메서드 1 = 배열 요소(시작점 1씩 증가) 관해서 전부 다 더하기
    // 메서드 2 = 배열 요소(시작점 1씩 증가) 관해서 전부 다 빼기
    // 는 중복이 발생함..
    
    
    void getPlusorMinus(int[] numbers, int target, int index, int sum)
    {
        if(index == numbers.length){
            if(sum == target){
                answer++;

            }
                            return;
        }
        
        getPlusorMinus(numbers, target, index + 1, sum + numbers[index]);
        getPlusorMinus(numbers, target, index + 1, sum - numbers[index]);
    }
}