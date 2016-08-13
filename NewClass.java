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

public class NewClass {
     
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number:");
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<n-2;i++)
            {
                for(int j=i+1;j<n-1;j++)
                {
                    int sum=a[i]+a[j];
                    for(int k=j+1;k<n;k++)
                    {
                        if(a[k]==sum)
                        {
                            System.out.println(a[i]+"+"+a[j]+"="+a[k]);
                        }
                    }
                }
            }
            
    }
}

