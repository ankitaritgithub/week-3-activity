public class CheckPalidrome {
    static boolean checkPalidrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "MADAM";
        String s1 = "CIPHER";
        String s2 = "Madam";
        System.out.println(checkPalidrome(s));
        System.out.println(checkPalidrome(s1));
        System.out.println(checkPalidrome(s2));
    }

}
