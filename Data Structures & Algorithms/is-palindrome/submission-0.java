class Solution {
    public boolean isPalindrome(String s) {
        char[] chArr = s.toCharArray();
        int left = 0;
        int right = chArr.length - 1;

        while(left < right){
            if(!Character.isLetterOrDigit(chArr[left])){
                left++;
            }else if(!Character.isLetterOrDigit(chArr[right])){
                right--;
            }else if(Character.toLowerCase(chArr[left]) != Character.toLowerCase(chArr[right])){
                return false;
            } else {
                left++;
                right--;
            }
        }

        return true;
    }
}

