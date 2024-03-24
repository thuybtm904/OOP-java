/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopjava;

/**
 *
 * @author HP One
 */
import java.util.Scanner;

public class ptb2 {
    private float a,b,c;
    
    public ptb2() {
        
    }
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("a = ");
        a = sn.nextFloat();
        System.out.print("b = ");
        b = sn.nextFloat();
        System.out.print("c = ");
        c = sn.nextFloat();
    }
    
    public void gpt() {
        if (a==0) {
            if (b==0 && c==0) System.out.println(a + "\t\t" + b + "\t\t" + c + "\t\tVo so nghiem");
            else if (b==0 && c!=0 ) System.out.println(a + "\t\t" + b + "\t\t" + c + "\t\tVo nghiem");
            else System.out.println(a + "\t\t" + b + "\t\t" + c + "\t\t" + -c/b);
        }
        else {
            float delta = b*b - 4*a*c;
            if (delta < 0) System.out.println(a + "\t\t" + b + "\t\t" + c + "\t\tVo nghiem");
            else if (delta==0) System.out.println(a + "\t\t" + b + "\t\t" + c + "\t\t" + -b/(2*a));
            else System.out.println(a + "\t\t" + b + "\t\t" + c + "\t\t" + (-b-Math.sqrt(delta))/(2*a) + " , " + (-b+Math.sqrt(delta))/(2*a));
        }
         
    }
    
    
    public static void main(String[] args) {
      
        ptb2[] a = new ptb2[3];
        for (int i=0;i<3;i++) {
            a[i] = new ptb2();
            a[i].nhap();
        }
            
        System.out.println("a\t\tb\t\tc\t\tNghiem");
        for (int i=0;i<3;i++)
            a[i].gpt();
        
    }
    
}
