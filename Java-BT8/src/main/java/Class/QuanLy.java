/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author PVHuy
 */
import java.util.ArrayList;
import java.util.Scanner;
public class QuanLy {
    private ArrayList<CBGV> ds;
    
    public QuanLy(){
        ds = new ArrayList<CBGV>(10);
    }
    
    public void ThemCBGV(CBGV cbgv){
        ds.add(cbgv);
    }
    
    public void NhapDS(Scanner sc){
        CBGV cbgv;
        System.out.print("Nhap vao so luong can bo:");
        int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("Nhap vao danh sach: ");
        for(int i = 0; i<n ; i++){
            System.out.println("\tCan bo thu "+(i+1)+" la:");
            cbgv = new CBGV();
            cbgv.NhapThongTin(sc);
            ThemCBGV(cbgv);
        }
    }
    
    public void HienThiDS(){
        for(CBGV cbgv : ds){
            cbgv.HienThiThongTin();
        }
    }
    
    public void TimKiem(double luong){
        for(CBGV cb : ds){
            if(cb.getLuongThucLinh() >= luong){
                cb.HienThiThongTin();
            }
        }
    }
}
