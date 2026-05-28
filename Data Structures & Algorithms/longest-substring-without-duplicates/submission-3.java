class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLength = 0;
        HashSet<Character> hs = new HashSet<>();

        for(int right = 0; right < n; right++){
            char currentChar = s.charAt(right);

            while(hs.contains(currentChar)){
                hs.remove(s.charAt(left));
                left++;
            }

            hs.add(currentChar);
            int currentWindow = right - left + 1;
            if(currentWindow > maxLength){
                maxLength = currentWindow;
            }
        }
        return maxLength;
    }
}
