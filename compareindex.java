/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
import java.util.Scanner;
import java.io.*;
public class compareindex {
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter number:");
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=s.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(i==a[i])
        {
            System.out.println(i);
        }
    }
}
}