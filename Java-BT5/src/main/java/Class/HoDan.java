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
public class HoDan extends Nguoi{
    private int soNguoi;
    private int soNha;
    private Nguoi[] list;
    
    public HoDan(){
        list = new Nguoi[10];
    }
    
    public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi, int soNha){
        super(hoTen, ngaySinh, ngheNghiep);
        this.soNguoi = soNguoi;
        this.soNha = soNha;
    }
    
    public void NhapThongTin(Scanner sc){
        System.out.print("\tNhap so nguoi: "); soNguoi = sc.nextInt(); sc.nextLine();
        System.out.print("\tNhap so nha: "); soNha = sc.nextInt(); sc.nextLine();
        System.out.print("\tNhap thong tin cua tung nguoi trong gia dinh: ");
        for(int i = 0; i<soNguoi; i++){
            System.out.println("Nguoi thu "+(i+1)+" :");
            list[i] = new Nguoi();
            list[i].NhapThongTin(sc);
        }
    }
    
    public void HienThiThongTin(){
        System.out.println("\tSo nguoi: "+soNguoi);
        System.out.println("\tSo nha: "+soNha);
        System.out.println("\tThong tin cua tung nguoi trong gia dinh: ");
        for(int i = 0; i<soNguoi; i++){
            System.out.println("Nguoi thu "+(i+1)+" :");
            list[i].HienThiThongTin();
        }
    }
    
    public Nguoi[] getList(){
        return list;
    }
    
    public int getSoNguoi(){
        return soNguoi;
    }
}
