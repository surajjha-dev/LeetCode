class Solution {
    public boolean isValid(String s) {
            
       Stack<Character> stack = new Stack<Character>();
            
       if (s.length() == 1)
            return false;
            
       for (int i = 0; i < s.length(); i++) {
            
            Character ch = s.charAt(i);
               
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
               
            if (ch == ')' || ch == '}' || ch == ']') {
               if (stack.size() > 0)  {
                 Character poped = stack.pop();
                       
                  if (ch == ')' && poped != '(')
                       return false;
                  else if (ch == '}' && poped != '{')
                       return false;
                  else if (ch == ']' && poped != '[')
                       return false;  
               }  else 
                   return false;
            }   
       }
            
            if (stack.isEmpty() || stack.size() == 0)
                return true;
            else 
                return  false;
    }
}