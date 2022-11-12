

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