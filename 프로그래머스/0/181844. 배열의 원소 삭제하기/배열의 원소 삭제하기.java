class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
       
        int check = -1;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            check = -1;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==(delete_list[j])){
                    check = 1;
                    break;
                }

            }
            if(check == -1)
                count++;
        }
        System.out.print(count);
        int[] answer = new int[count];
        count = 0;
        for(int i=0; i<arr.length; i++){
            check = -1;
            for(int j=0; j<delete_list.length; j++){
                if(arr[i]==(delete_list[j])){
                    check = 1;
                    break;
                }

            }
            if(check == -1){
                answer[count] = arr[i];
                count++;
                
            }
        }
        return answer;
    }
}