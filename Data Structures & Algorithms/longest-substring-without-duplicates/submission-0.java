class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        for(int i = 0; i < s.length(); i++){
            Set<Character> hs = new HashSet<>();
            
            for(int j = i; j < s.length(); j++){
                if(hs.contains(s.charAt(j))){
                    break;
                }
                hs.add(s.charAt(j));
            }
          res = Math.max(res, hs.size());
        }

        return res;
    }
}
