class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null||digits.length()==0)
        {
            return res;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        backtrack(digits,0,new StringBuilder(),res,map);
        return res;
    }
    public void backtrack(String digits,int i,StringBuilder curr,List<String> res,String[] map)
    {
        if(i==digits.length())
        {
            res.add(curr.toString());
            return;
        }
        String letters=map[digits.charAt(i)-'0'];
        for(char c:letters.toCharArray())
        {
            curr.append(c);
            backtrack(digits,i+1,curr,res,map);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}