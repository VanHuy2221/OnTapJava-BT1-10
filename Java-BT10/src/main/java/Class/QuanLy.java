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
    private ArrayList<BienLai> dsbl;
    
    public QuanLy(){
        dsbl = new ArrayList<BienLai>(10);
    }
    
    public void ThemBienLai(BienLai bl){
        dsbl.add(bl);
    }
    
    public void NhapDS(Scanner sc){
        BienLai bl;
        System.out.print("Nhap so luong bien lai: ");
        int n = sc.nextInt(); sc.nextLine();
        System.out.println("Nhap vao danh sach bien lai:");
        for(int i = 0; i<n ; i++){
            System.out.println("\tBien lai thu "+(1+i)+" la:");
            bl = new BienLai();
            bl.NhapThongTin(sc);
            ThemBienLai(bl);
        }
    }
    
    public void HienThiDS(){
        for(int i = 0; i<dsbl.size();i++){
            System.out.println("tBien lai thu "+(1+i)+" la:");
            dsbl.get(i).HienThiThongTin();
            System.out.println();
        }
    }
}
