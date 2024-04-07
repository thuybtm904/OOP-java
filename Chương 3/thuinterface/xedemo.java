/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuinterface;

/**
 *
 * @author HP One
 */
import java.util.*;
public class xedemo {
    static int n;
    static Xe a[];
    static Scanner sn = new Scanner(System.in);

    
    public static void nhap() {
        System.out.print("Nhap so xe: ");
        n = sn.nextInt();
        a = new Xe[n];
        for (int i = 0;i<n;i++) {
            a[i] = new Xe();
            a[i].nhap();
        }
    }
    
    public static void xuat() {
        Xe.inTD();
        for (int i=0; i<n; i++) {
            a[i].inDL();
        }
    }
    
    public static void timmax() {
        float d = a[0].getTrongTai();
        for (int i=1;i<n;i++) {
            if (d<a[i].getTrongTai()) d=a[i].getTrongTai();
        }
        
        System.out.println("Danh sach xe có trong tai lon nhat la:");
        Xe.inTD();
        for (int i=0;i<n;i++) {
            if (a[i].getTrongTai()==d)
                a[i].inDL();
        }
    }
    
    public static void xoa() {
        System.out.print("Nhap vi tri can xoa: ");
        int k = sn.nextInt();
        if (k<1 || k>n) {
            System.out.print("Vi tri xe ngoai pham vi.");
            System.exit(0);
        }
        else {
            for (int i=k-1;i<n-1;i++) a[i] = a[i+1];
            n--;
            xuat();
        }
    }
    public static void main(String[] args) {
        nhap();
        xuat();
        timmax();
        xoa();
    }
    
}
