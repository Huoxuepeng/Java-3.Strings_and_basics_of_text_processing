package InsertString;

import java.util.Scanner;

public class InsertLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string is:  ");
        StringBuilder sb = new StringBuilder("aaa acl add a");
        char str = 'a';
        System.out.println(sb);
        for(int i = 0;i < sb.length(); i++){
            if(sb.charAt(i) == str){
                sb.insert((i+1),"b");
            }
        }
        System.out.println("new string is: "+sb);

    }
}
