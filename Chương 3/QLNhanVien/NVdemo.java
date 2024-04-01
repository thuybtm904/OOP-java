package QLNhanVien;
import java.util.*;
public class NVdemo {
    
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        int n = sn.nextInt();
        NhanVien a[] = new NhanVien[n];
        
        for (int i=0;i<n;i++) {
            System.out.println("1. Nhan vien san xuat  ;  2. Nhan vien van phong");
            int loai = sn.nextInt();
            if (loai == 1) a[i] = new NVSX();
            else a[i] = new NVVP();
            
            a[i].nhap();
        }
        
        int sum = 0;
        for (int i=0;i<n;i++) 
            sum += a[i].tongLuong();
        
        System.out.print("Tong so tien luong cong ty phai tra hang thang cho nhan vien la: " + sum);
    } 
}