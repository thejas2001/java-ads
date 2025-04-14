package javaTry;

public class Palindrome {
    public static void main(String[] args) {
        String s= "abcba";
                int left=0,right=s.length()-1;
        boolean isPalindrome=true;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);
    }
}
