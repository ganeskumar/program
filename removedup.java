/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
import java.util.Arrays;
import java.util.Scanner;
public class removedup {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char a[]=str.toCharArray();
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
            if(a[i]==a[j])
            {
                a[i]='0';
            }
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(a[i]!='0')
            {
                System.out.print(a[i]);
            }
        }
    }
}
