class Solution {
    public char findTheDifference(String s, String t) {
        // int sc = 0, st = 0;
        // st+=t.charAt(0);
        // for(int i=0;i<s.length();i++) {
        //     sc+=s.charAt(i);
        //     st+=t.charAt(i+1);
        // }
        // return Character.toChars(st-sc)[0];
        
        int c = 0;
        for (int i=0;i<s.length();i++) {
            c ^= s.charAt(i); 
        }
        for (int i=0;i<t.length();i++) {
            c ^= t.charAt(i); 
        }
        return (char)c;
    }
}