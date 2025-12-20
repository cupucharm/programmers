import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] ch = new char[a.length()];
        
        int n = 'a' - 'A';
        
        for(int i = 0; i < a.length(); i++) {
            ch[i] = a.charAt(i);
            
            if (ch[i] < 'a') {
                ch[i] += n;
            } else {
                ch[i] -= n;
            }
            
            System.out.print(ch[i]);
        }
    }
}