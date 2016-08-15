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
public class findfirstelement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i+1<n;i++)
        {
            if(a[i]==a[i+1])
            {
                System.out.println(a[i]+"is the first element repeated");
                break;
            }
    }
}
}