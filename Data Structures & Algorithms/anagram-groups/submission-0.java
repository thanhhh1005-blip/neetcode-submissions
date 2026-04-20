class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap();
        for(String s: strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String str = new String(charArray);
            map.putIfAbsent(str, new ArrayList());
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
