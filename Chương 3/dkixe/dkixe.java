package oopjava;
import java.util.Scanner;

public class dkixe {
    private String hodem;
    private String ten;
    private String loaixe;
    private int dungtich;
    private double gia;
    private double thue;
    
    public dkixe() {
        
    }

    public String getTen() {
        return ten;
    }
    
    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }
    
    
    public void nhap() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Nhap ho dem:");
        hodem = sn.nextLine();
        System.out.print("Nhap ten:");
        ten = sn.nextLine();
        System.out.print("Nhap loai xe:");
        loaixe = sn.nextLine();
        System.out.print("Nhap dung tich:");
        dungtich = sn.nextInt();
        System.out.print("Nhap gia xe:");
        gia = sn.nextFloat();
    }
    
    
    public double tthue() {
        if (dungtich<100) return gia*0.01;
        else if (dungtich<200) return gia*0.03;
        else return gia*0.05;
    }
    
//    public void inds() {
//        System.out.println(hodem + "\t\t\t" + ten + "\t\t\t" + loaixe + "\t\t\t" + dungtich + "\t\t\t" + gia);
//    }
//    
//    public void inthue() {
//        System.out.println(hodem + "\t\t\t" + ten + "\t\t\t" + thue);
//    }
    
    public void inds(){
 System.out.printf("%-15s %-15s %-15s %15d %15.2f %15.2f %n",hodem,ten, loaixe,dungtich,gia, thue);
 } 
    
}