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
    private ArrayList<TheMuon> ds;
    
    public QuanLy(){
        ds = new ArrayList<TheMuon>(10);
    }
    
    public void ThemTheMuon(TheMuon tm){
        ds.add(tm);
    }
    
    public void NhapDS(Scanner sc){
        TheMuon tm;
        System.out.print("Nhap vao so luong the muon: ");
        int n = sc.nextInt(); sc.nextLine();
        
        System.out.println("Nhap thong tin cho the muon: ");
        for(int i = 0; i<n; i++){
            System.out.println("\tThe muon thu "+(1+i)+" la:");
            tm = new TheMuon();
            tm.NhapThongTin(sc);
            ThemTheMuon(tm);
        }
    }
    
    public void HienThiDSTraCuoiThang(){
        for(TheMuon tm : ds){
            if(tm.getHanTra().getDate()== 31 || tm.getHanTra().getDate()== 30){
                tm.HienThiThongTin();
            }
        }
    }
}
