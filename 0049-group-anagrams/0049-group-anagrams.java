class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res=new HashMap<>();
        for(String s:strs)
        {
            char[] a=s.toCharArray();
            Arrays.sort(a);
            String k=new String(a);
            res.putIfAbsent(k,new ArrayList<>());
            res.get(k).add(s);
        }
        return new ArrayList<>(res.values());
    }
}