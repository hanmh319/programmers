class Solution {
    public int[] solution(int[] arr) {
        int getLength = 0;
        for(int i=0; i<arr.length; i++){
            getLength += arr[i];
        }
        int[] answer = new int[getLength];
        
        int count = 0;
        int forCount = 0;
        for(int i=0; i<arr.length; i++){
            forCount =0;
            while(true){
                answer[count++] = arr[i];
                forCount++;
                System.out.print(arr[i] + " ");
                if(forCount == arr[i]){
                    break;
                }
            }
        }
        
        return answer;
    }
}