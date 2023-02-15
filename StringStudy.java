public class StringStudy {
    public static void main(String[] args) {
        String name = "Cipherschools";
        String name2 = "Cipherschools";
        String name3 = new String("Cipherschools");
        String name4 = new String("Cipherschools");
        System.out.println(name == name2);
        System.out.println(name3 == name4);
        System.out.println(name == name3);
        System.out.println("=====================================");
        System.out.println("1. CONCATENATION");
        String s1 = "Hello";
        s1 = s1 + "Peeps";
        System.out.println(s1);
        System.out.println(s1 + " How are u doing?");
        System.out.println(s1);
        String s2 = new String("Hello");
        String s3 = new String("People");
        String s4 = s2.concat(s3);
        System.out.println(s4);
        System.out.println(s2);
    }

}
