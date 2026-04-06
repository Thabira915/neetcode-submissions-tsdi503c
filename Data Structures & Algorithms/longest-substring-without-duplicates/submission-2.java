class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hmap = new HashMap<>();
        int left = 0;
        int res = 0;

     for(int right = 0; right < s.length(); right++){

        if(hmap.containsKey(s.charAt(right))){
            left = Math.max(hmap.get(s.charAt(right))+1, left);
        }
       hmap.put(s.charAt(right), right);
       res = Math.max(res, right - left + 1);
     }

      return res;
    }
}
