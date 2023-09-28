class Solution {


    public int numMatchingSubseq(String s, String[] words) {
        int ans = 0;
        Map<String, Integer> count = new HashMap<>();
        for (String w : words) {
            count.put(w, count.getOrDefault(w, 0)+1);
        }


        for (String sub : count.keySet()) {
            if (isSubsequence(sub, s))
              ans+=count.get(sub);
        }
        return ans;
    }

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