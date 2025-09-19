/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
import java.util.Scanner;
public class Nguoi {
    protected String hoTen;
    protected String ngaySinh;
    protected String queQuan;
    
    public Nguoi(){
        
    }
    
    public Nguoi(String hoTen, String ngaySinh, String queQuan){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\tNhap ho ten: "); hoTen = sc.nextLine();
        System.out.print("\tNhap ngay sinh: "); ngaySinh = sc.nextLine();
        System.out.print("\tNhap que quan: "); queQuan = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        System.out.println("\tHo ten: "+hoTen);
        System.out.println("\tNgay sinh: "+ngaySinh);
        System.out.println("\tQue quan: "+queQuan);
    }
}
