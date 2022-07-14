package String;

import java.util.Scanner;

public class ReplaceString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = new String();
        str = in.nextLine();
        System.out.println("enter length:" +str.length());
        for(int i = 0; i < str.length()-1; i++){
            System.out.println((i+1) +" string is: " +str.charAt(i));
        }
    }
}
