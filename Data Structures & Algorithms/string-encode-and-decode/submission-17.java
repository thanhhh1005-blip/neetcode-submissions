class Solution {

    public String encode(List<String> strs) {
        String rs = "";
        for(String str : strs){
            rs += str.length() + "#" + str;
        }
        return rs;
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> rs = new ArrayList<>();
        while(i < str.length()){
            int j = i;
            String number = "";
            while(str.charAt(j) != '#'){
                number += str.charAt(j);
                j++;
            }
            j++;
            int len = Integer.parseInt(number);
            String word = "";
            for(int k = j ; k < j + len; k++){
                char c = str.charAt(k);
                word += c;
            }
            j += word.length();
            i = j;
            rs.add(word);
        }
        return rs;
    }
}
