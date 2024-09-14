public class string {
public static boolean ispallindrome(String number){
    for(int i=0;i<number.length()/2;i++){
        int n=number.length();
        if (number.charAt(i)!=number.charAt(n-i-1)) {
            return false;
            
        }
    }
    return true;
}
    public static void main(String[] args) {
        String number="12345654321";

        boolean name=ispallindrome(number);
        if (name!=true) {
            System.out.println("The number is not palindrome");
            
        }else{
            System.out.println("TTHe number is a palindrome number");
        }
    }
}