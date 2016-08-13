/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ganesh
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int a[][]=new int[n][n];
 int b[][]=new int[n][n];
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
         a[i][j]=s.nextInt();
     }
 }
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
         b[i][j]=a[i][j];
     }
 }
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
        if(a[i][j]==0)
        {
            for(int w=0;w<n;w++)
            {
                b[i][w]=0;
               b[w][j]=0;
            }
        }
     }
 }
 for(int i=0;i<n;i++)
 {
     for(int j=0;j<n;j++)
     {
       System.out.print(b[i][j]+" ");
     }
     System.out.println();
 }
    }}