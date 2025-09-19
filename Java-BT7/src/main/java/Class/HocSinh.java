/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
import java.util.Date;
import java.util.Scanner;
public class HocSinh extends Nguoi{
    private String lop;
    private String khoaHoc;
    private String kyHoc;
    
    public HocSinh(){
        
    }
    
    public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc){
        this.hoTen = hoTen;
        this.khoaHoc = khoaHoc;
        this.lop = lop;
        this.kyHoc = kyHoc;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap lop hoc: "); lop = sc.nextLine();
        System.out.print("\tNhap khoa hoc: "); khoaHoc = sc.nextLine();
        System.out.print("\tNhap ky hoc: "); kyHoc = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\tLop hoc: "+lop);
        System.out.println("\tKhoa hoc: "+khoaHoc);
        System.out.println("\tKy hoc: "+kyHoc);
    }
    
    public String getLop(){
        return lop;
    }

    public Date getNgaySinh() {
       return ngaySinh;
    }
}
