class Solution {
    public int[] solution(int money) {
        int iceAmericano = 5500;
        int[] answer = {money/iceAmericano, money%iceAmericano};
        return answer;
    }
}