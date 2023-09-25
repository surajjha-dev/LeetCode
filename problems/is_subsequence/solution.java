class Solution {
    public boolean isSubsequence(String s, String t) {

        int sp = 0, tp = 0, sl = s.length();

        if (sl == 0)
          return true;
        for (int j = 0; j < t.length(); j++) {
            if (s.charAt(sp) == t.charAt(j))
                 sp++;
            if (sp >= sl)
              return true;     
        }

        return false;    
    }
}