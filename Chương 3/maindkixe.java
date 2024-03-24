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
public class maindkixe {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        System.out.println("1. Nhap danh sach xe.");
        System.out.println("2. In danh sach xe");
        System.out.println("3. Xuat thue");
        System.out.println("4. Sap xep danh sach theo ten chu xe tang dan");
        System.out.println("5. Dua ra xe nop thue lon nhat");
        System.out.println("6. Thoat");
        
        int lc;
        int n;
        dkixe[] a = null;
        do {
            System.out.print("Nhap lua chon cua ban: ");
            lc = sn.nextInt();
            switch (lc) {
                case 1: {
                    System.out.print("Nhap so xe:");
                    n = sn.nextInt();
                    a = new dkixe[n];
                    for (int i=0;i<n;i++) {
                        a[i] = new dkixe();
                        a[i].nhap();
                        a[i].setThue(a[i].tthue());                      
                    }  
                    break;
                }
                
                case 2: {
                    System.out.printf("%-15s %-15s %-15s %15s %15s %15s %n", "Ho dem","Ten","Loai xe","Dung tich","Gia","Thue phai nop"); 
                    for (int i=0;i<a.length;i++)
                        a[i].inds();
                    break;
                }    
                
                case 3: {
                    System.out.printf("%-15s %-15s %-15s %15s %15s %15s %n", "Ho dem","Ten","Loai xe","Dung tich","Gia","Thue phai nop"); 
                    for (int i=0;i<a.length;i++)
                        a[i].inds();
                    break;
                }
                
                case 4: {
                    for (int i=0;i<a.length-1;i++)
                        for (int j=1;j<a.length;j++)
                        {
                            if (a[i].getTen().compareToIgnoreCase(a[j].getTen())>0) {
                                dkixe tg;
                                tg=a[i];
                                a[i]=a[j];
                                a[j]=tg;
                            }
                        }
                    System.out.println("Danh sach xe sau khi sap xep:");
                    System.out.printf("%-15s %-15s %-15s %15s %15s %15s %n", "Ho dem","Ten","Loai xe","Dung tich","Gia","Thue phai nop");
                    for (int i=0;i<a.length;i++)
                        a[i].inds();
                    break;        
                }
                
                case 5: {
                    double maxx = a[0].getThue();
                    for (int i=1;i<a.length;i++)
                        if (maxx<a[i].getThue()) maxx=a[i].getThue();
                    System.out.println("Danh sach xe phai nop thue lon nhat:");
                    System.out.printf("%-15s %-15s %-15s %15s %15s %15s %n", "Ho dem","Ten","Loai xe","Dung tich","Gia","Thue phai nop");
                    for (int i=0;i<a.length;i++)
                        if (a[i].getThue()==maxx) {
                            a[i].inds();
                        }
                    break;    
                }          
            }
                
        } while (lc!=6);
        
        
    }

    

    

}
