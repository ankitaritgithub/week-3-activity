import java.util.Scanner;

public class StringStudy3 {
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
        System.out.println("=====================================");
        System.out.println("1: Checking IF STRINGS ARE EQUAL IN VALUE");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
        System.out.println("=====================================");
        System.out.println("3: Creating new String object from character array");
        char arr[] = { 'C', 'I', 'P', 'H', 'E', 'R' };
        String strFromArr = new String(arr);
        System.out.println(strFromArr);
        System.out.println("=====================================");
        System.out.println("4: Creating partial String object from character array");
        String partialstrFromArr2 = new String(arr, 2, 3);
        System.out.println(partialstrFromArr2);
        System.out.println("==============================");
        System.out.println("5. Changing the case");
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        name = name.toUpperCase();
        System.out.println(name);
        System.out.println("==============================");
        System.out.println("6.Splitting");
        System.out.println("Please Enter your Full Name: ");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String strArr[] = fullName.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
        System.out.println("Please Enter Something seprerated by comas: ");
        String csvText = sc.nextLine();
        String csvArr[] = fullName.split(" ");
        for (int i = 0; i < csvArr.length; i++) {
            System.out.println(csvArr[i]);
        }
        System.out.println("Please Enter Something seprerated by dots: ");
        String dotText = sc.nextLine();
        String dotArr[] = csvText.split("[.]");
        for (int i = 0; i < dotArr.length; i++) {
            System.out.println(dotArr[i]);
        }
        String backslashText = ("Hello i attended \"java\" class");
        String backslashArr[] = csvText.split("[.]");
        for (int i = 0; i < backslashArr.length; i++) {
            System.out.println(backslashArr[i]);
        }
        System.out.println("==============================");
        System.out.println("7. Length of String");
        int len = name.length();
        System.out.println("Length of : " + name + " is " + len);
        System.out.println("==============================");
        System.out.println("7. Finding Index of a char in a string");
        int index = name.indexOf('e');
        System.out.println("index of e in : " + name + " is : " + index);
        int index2 = name.indexOf('E');
        System.out.println("index of e in : " + name + " is : " + index2);
        int index3 = name.indexOf("School");
        System.out.println("index of school in : " + name + " is : " + index3);
        int index4 = name.indexOf('o', 10);
        System.out.println("index of e in : " + name + " is : " + index4);
        int indexOfO = 0;
        while (true) {
            indexOfO = name.indexOf('o', indexOfO + 1);
            if (indexOfO == -1)
                break;
            System.out.println("O found at : " + indexOfO);
        }
    }
}
