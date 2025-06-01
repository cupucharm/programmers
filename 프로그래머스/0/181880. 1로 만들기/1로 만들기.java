class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int n = num_list[i];
            while (true) {
                if (n % 2 != 0) {
                    n -= 1;
                }
            
                n = (n >= 2) ? n / 2 : 0;
                if (n == 0) { break;}
                answer++;
                if (n == 1){
                    break;
                } 
            }
        }
        
        return answer;
    }
}