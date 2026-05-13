class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();

        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);

            String key = new String(charArray);

            hmap.putIfAbsent(key, new ArrayList<>());
            hmap.get(key).add(s);
        }

        return new ArrayList<>(hmap.values());
    }
}
