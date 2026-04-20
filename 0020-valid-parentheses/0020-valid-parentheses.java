class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='('||c=='{'||c=='[')
            {
                stk.push(c);
            }
            else
            {
                if(stk.isEmpty())
                {
                    return false;
                }
                char c1=stk.pop();
                if(c==')'&&c1!='(') return false;
                if(c=='}'&&c1!='{') return false;
                if(c==']'&&c1!='[') return false;
            }
        }
        return stk.isEmpty();
    }
}