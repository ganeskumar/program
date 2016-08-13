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
public class leastdigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        String str=s.next();
        char a[]=str.toCharArray();
        Arrays.sort(a);
        System.out.println("Enter the digit to delete");
        int del=s.nextInt();
        if(del<a.length)
        {
        for(int i=0;i<a.length-del;i++)
        {
            System.out.print(a[i]);
        }
    }
        else
        {
            System.out.println("its too big");
        }
    }
}
