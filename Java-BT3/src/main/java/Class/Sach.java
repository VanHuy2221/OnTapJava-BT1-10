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
public class Sach extends TaiLieu{
    private String tacGia;
    private int soTrang;
    
    public Sach(){
    }
    
    public Sach(String maTaiLieu, String tenNXB, int soBanPhatHanh, String tacGia, int soTrang){
        super(maTaiLieu, tenNXB, soBanPhatHanh);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }
    
    public void NhapThongTin(Scanner sc){
        super.NhapThongTin(sc);
        System.out.print("\tNhap tac gia: "); tacGia = sc.nextLine();
        System.out.print("\tNhap so trang: "); soTrang = sc.nextInt(); sc.nextLine();
    }
    
    public void HienThiThongTin(){
        super.HienThiThongTin();
        System.out.println("\ttac gia: "+tacGia);
        System.out.println("\tSo trang: "+soTrang);
    }
}
