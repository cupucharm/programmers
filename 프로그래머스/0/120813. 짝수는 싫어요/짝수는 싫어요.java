class Solution {
    public int[] solution(int n) {
        n = (n % 2 == 0) ? n : n + 1;
        int[] answer = new int[n/2];
        int j = 1;
        
        for (int i = 0; i < n/2; i++) {
            answer[i] += j;
            j += 2;
        }
        
        return answer;
    }
}