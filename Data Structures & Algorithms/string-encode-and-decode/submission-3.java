class Solution {
    public String encode(List<String> strs) {
        String ans = "";
        for (String c : strs) {
            if (c.equals("")) {
                ans += "emptySpace";
            }
            ans += c + "~";
        }
        return ans;
    }

    public List<String> decode(String str) {
        if(str == null || str.equals("")){
            return new ArrayList<>();
        }
        List<String> a = new ArrayList<>();
        String[] words = str.split("~");
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("emptySpace")) {
                a.add("");
            } else {
                a.add(words[i]);
            }
        }
        return a;
    }
}
