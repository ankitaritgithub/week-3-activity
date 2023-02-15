import java.util.Scanner;

public class StringStudy4 {
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
        System.out.println("==============================");
        System.out.println("9. Extract a Substring");
        String wf = "Wakanda Forever";
        String subString = wf.substring(3);
        System.out.println(subString);
        String subString2 = wf.substring(3, 7);
        System.out.println(subString2);
        System.out.println("==============================");
        System.out.println("10. Finding a character at a given index");
        System.out.println(name.charAt(4));
        char charAtIndex = name.charAt(6);
        System.out.println(charAtIndex);
        System.out.println("==============================");
        System.out.println("11. char Array from a string");
        char arr2[] = name.toCharArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("==============================");
        System.out.println("12.Check if a string is empty");
        String emptyString = new String();
        String emptyString2 = " ";
        System.out.println(emptyString);
        System.out.println(emptyString2);
        System.out.println(emptyString.equals((" ")));
        System.out.println(emptyString2.equals((" ")));
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString2.isEmpty());
        System.out.println(emptyString.isEmpty());
        System.out.println(emptyString.isBlank());
        System.out.println("==============================");
        System.out.println("13. Comparing strings lexicographically -> alphabatically");
        String textOne = "QHey!";
        String textTwo = "QBey";
        System.out.println(textOne.compareTo(textTwo));
        System.out.println(textTwo.compareTo(textTwo));
        System.out.println(textOne.compareTo(textTwo));
        System.out.println("==============================");
        System.out.println("14, Trimming and Spaces fromm front and end");
        String s5 = new String("Hello ");
        String s6 = new String(" Hello ");
        String s7 = new String(" Hello People ");
        System.out.println("*" + s5.trim() + "*");
        System.out.println("*" + s6.trim() + "*");
        System.out.println("*" + s7.trim() + "*");
        System.out.println("==============================");
        System.out.println("15. Replacing a character");
        System.out.println(name.replace('o', '0'));
        System.out.println(name.replace("oo", "000"));
        sc.close();
    }
}
