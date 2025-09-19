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
public class TaiLieu {
    private String maTaiLieu;
    private String tenNXB;
    private int soBanPhatHanh;
    
    public TaiLieu(){
    }
    
    public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh){
        this.maTaiLieu = maTaiLieu;
        this.tenNXB = tenNXB;
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\tNhap ma tai lieu: "); maTaiLieu = sc.nextLine();
        System.out.print("\tNhap ten nha xuat ban: "); tenNXB = sc.nextLine();
        System.out.print("\tNhap so ban phat hanh: "); soBanPhatHanh = sc.nextInt(); sc.nextLine();
    }
    
    public void HienThiThongTin(){
        System.out.println("\tMa tai lieu: "+maTaiLieu);
        System.out.println("\tTen nha xuat ban: "+tenNXB);
        System.out.println("\tSo ban phat hanh: "+soBanPhatHanh);
    }
    
    public String getMaTaiLieu(){
        return maTaiLieu;
    }
}
