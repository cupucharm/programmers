class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int n = denom1 * numer2 + denom2 * numer1; // 분자
        int m = denom1 * denom2; // 분모
        
        int s = n > m ? m : n;
        int a = 1;
        
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                if (m % i == 0) {
                    a = i;
                }
            }
        }
        
        n /= a;
        m /= a;
        
        int[] answer = {n, m};
        
        return answer;
    }
}