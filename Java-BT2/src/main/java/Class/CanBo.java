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

public class CanBo {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String diaChi;
    
    public CanBo(){
    }
    
    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi){
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\tNhap ho ten: "); hoTen = sc.nextLine();
        System.out.print("\tNhap ngay sinh(dd/mm/yyyy): "); ngaySinh = sc.nextLine();
        System.out.print("\tNhap gioi tinh: "); gioiTinh = sc.nextLine();
        System.out.print("\tNhap dia chi: "); diaChi = sc.nextLine();
    }
    
    public void HienThiThongTin(){
        System.out.println("\tHo ten: "+hoTen);
        System.out.println("\tNgay sinh: "+ngaySinh);
        System.out.println("\tGioi tinh: "+gioiTinh);
        System.out.println("\tDia chi: "+diaChi);
    }
    
    public String getHoTen(){
        return this.hoTen;
    }
}
