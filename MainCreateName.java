package akm;

import java.util.Scanner;

public class MainCreateName {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Day      : ");
        int d= sc.nextInt();
        System.out.print("Question : ");
        String q= sc.next();
        System.out.print("Name     : ");
//
        String str= sc.nextLine();str= sc.nextLine();
        str=str.trim();
        int len= str.length();
        String ans="";

//        System.out.println("str : "+str+"");
        for (int i = 0; i <len; i++) {
            char ch=str.charAt(i);
            if (i==0){
                ans=ans+Character.toUpperCase(ch);
                if (str.charAt(i+1)==' ')ans+="_";
            }else if (ch==' '){

            }else if (i<len-2&&str.charAt(i-1)==' '&&str.charAt(i+1)==' '){
                ans+="_"+Character.toUpperCase(ch)+"_";
            }else if (str.charAt(i-i)==' '){
                ans+=Character.toUpperCase(ch);
            }
            else if ((!Character.isDigit(ch)
                    && !Character.isLetter(ch))){
                ans+="_";
            }else if (str.charAt(i-1)==' '){
                ans+=Character.toUpperCase(ch);
            }else {
                ans+=ch;
            }
        }
        ans="D"+d+"Q"+q+"_"+ans;
        System.out.println("\n\t"+ans);

    }
}

/***
 * D7Q3_MajorityElement__N_2Times_with_a_Program
 * D7Q3_MajorityElement__N_2Times_With_A_Program
 * D7Q3_MajorityElement__N_2Times_WithTheProgram
 *D7Q3_FindTheMiddleOfLinkedList
 */






