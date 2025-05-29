import java.util.*;
class Main {
    public static void main(String[] args) {
        String s = "aaabc";
        Set<Character> se = new HashSet<>();

        for(int i=0;i<s.length();i++){
            se.add(s.charAt(i));
        }
        System.out.println(se.size());
        
    }
}