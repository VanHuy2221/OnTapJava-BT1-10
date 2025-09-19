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
public class SinhVien {
    protected String hoTen;
    protected String maSV;
    protected String ngaySinh;
    protected String lop;
    
    public SinhVien(){
        
    }
    
    public SinhVien(String hoTen, String maSV, String ngaySinh, String lop){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.maSV = maSV;
        this.lop = lop;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\tNhap vao ho ten: "); hoTen = sc.nextLine();
        System.out.print("\tNhap vao ma sinh vien: "); maSV = sc.nextLine();
        System.out.print("\tNhap vao ngay sinh: "); ngaySinh = sc.nextLine();
        System.out.print("\tNhap vao lop: "); lop = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        System.out.println("\tHo ten: "+hoTen);
        System.out.println("\tMa sinh vien: "+maSV);
        System.out.println("\tNgay sinh: "+ngaySinh);
        System.out.println("\tLop: "+lop);
    }
}
