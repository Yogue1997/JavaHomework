import java.util.Scanner;

class User {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int userInput = scan.nextInt();

        int prev = 0;
        int curr = 1;
        int ans;

        // for (int i = 0; i < userInput; i++) {
        //     ans = prev + curr;
        //     System.out.print(" " + curr);
        //     prev = curr;
        //     curr = ans;

        // }

    

    System.out.println("Enter a string: ");
    String userString = scan.nextLine();
    
    if(isPalindrome(userString.toLowerCase()))
        System.out.println("This is a palindrome");
    else 
        System.out.println("This is NOT a palindrome");

}



    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }
}