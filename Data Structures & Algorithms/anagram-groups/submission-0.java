class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> t = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        if(strs.length == 0){
            return list;
        }
        
        String word = "";
        for(int i = 0; i < strs.length; i++){
            char[] let = strs[i].toCharArray();
            Arrays.sort(let);
            word = new String(let);

            if(t.containsKey(word)){
                t.get(word).add(strs[i]);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                t.put(word, temp);
            }
        }
        t.forEach((key, value) -> {
            list.add(value);
        });
        return list;
    }
}