package String;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();
        str = in.nextLine();
        String str2 = " ";
        System.out.println("enter length:" + str.length());
        for (int i = 0; i < str.length() - 1; i++) {
            System.out.println((i + 1) + " string is: " + str.charAt(i));
        }
        if (str != null && !"".equals(str)) {

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {

                    str2 += str.charAt(i);

                }
            }
        }
        System.out.println("Then the numbers in the string are:" +str2);
    }
}
