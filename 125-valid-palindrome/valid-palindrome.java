class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            //skip non-alpha-numeric character from the left
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            //skip non-alphanumeric character from right
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            //compare character case-insensitively
            else{
                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));

                if(leftChar != rightChar){
                    return false;
                }
                left++;
                right--;
            }   
        }
        return true;
    }
}