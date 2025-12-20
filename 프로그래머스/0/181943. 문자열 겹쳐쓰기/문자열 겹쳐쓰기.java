class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        char[] ch = new char[my_string.length()];
        String answer = "";
        
        for (int i = 0; i< my_string.length(); i++) {
            if (i < s || i > s + overwrite_string.length() - 1) {
                ch[i] = my_string.charAt(i);    
            } else {
                ch[i] = overwrite_string.charAt(i - s);
            }
            
             answer += ch[i];
        }
        
        return answer;
    }
}