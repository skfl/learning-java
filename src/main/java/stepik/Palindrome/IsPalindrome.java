package stepik.Palindrome;



public class IsPalindrome {
    public static boolean isPalindrome(String text) {
        boolean v = false;
        String a = text.replaceAll("[^a-zA-Z0-9]","").trim().toLowerCase();
        StringBuilder b = new StringBuilder();
        if(b.append(a).reverse().toString().equals(a)){
            v = true;
        }
        return v;
    }
}
