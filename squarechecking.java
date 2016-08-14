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
public class squarechecking {
   public static double calculate(int m,int n,int o,int p)
   {
       double dist=Math.pow(m-n,2)+Math.pow(o-p,2);
       double d5=Math.pow(dist, 0.5);
       return d5;
   }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double d1,d2,d3,d4;
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int d=s.nextInt();
        int e=s.nextInt();
        int f=s.nextInt();
        int g=s.nextInt();
        int h=s.nextInt();
        d1=calculate(a,b,c,d);
        d2=calculate(c,d,e,f);
        d3=calculate(e,f,g,h);
        d4=calculate(g,h,a,b);
        if(d1==d2 && d2==d3 && d3==d4 && d4==d1)
        {
            System.out.println("square");
        }
        else
        {
            System.out.println("not square");
        }
    }
}
