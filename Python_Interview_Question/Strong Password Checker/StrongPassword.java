/* 
A password is said to be strong if it satisfies all the following criteria:

* It has at least 8 characters.
* It contains at least one lowercase letter.
* It contains at least one uppercase letter.
* It contains at least one digit.
* It contains at least one special character. The special characters are the * * * characters in the following string: "!@#$%^&*()-+".
* It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).

Given a string password, return true if it is a strong password. Otherwise, return false
*/


public class StrongPassword {
    public static boolean solution(String S) {
        boolean lower = false, upper = false, digit = false, special = false;
        

        for (int i = 0; i < S.length(); i++) {

            if(S.length() < 6 || S.contains(" ") || S == null){
                return false;
            } 

            if(Character.isLowerCase(S.charAt(i))) lower = true;
            if(Character.isUpperCase(S.charAt(i))) upper = true;
            if(Character.isDigit(S.charAt(i))) digit = true;
            if(S.charAt(i) == '!' || S.charAt(i) == '@' || 
                S.charAt(i) == '#' || S.charAt(i) == '$' ||
                S.charAt(i) == '%' || S.charAt(i) == '^' ||
                S.charAt(i) == '&' || S.charAt(i) == '*' ||
                S.charAt(i) == '(' || S.charAt(i) == ')' || S.charAt(i) == '_') special = true;
        }

        if(lower && upper && digit && special)
            return true;
               
        return false;
    } 

    public static void main(String[] args) {
        String s = "Ab2@5c";

        System.out.println(solution(s));
    }
}