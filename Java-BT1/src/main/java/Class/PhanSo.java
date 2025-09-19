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

public class PhanSo {
    // thuoc tinh
    private int tuSo;
    private int mauSo;
    
    // phuong thuc
    // ham khoi tao khong doi so
    public PhanSo(){
        tuSo = 0;
        mauSo = 1;
    }
    
    // ham khoi tao co doi so
    public PhanSo(int tuSo, int mauSo){
        this.tuSo = tuSo;
        this.mauSo= mauSo;
    }
    
    // ham nhap phan so
    public void NhapPS(Scanner sc){
        int a;
        int b;
        
        do{
            System.out.print("Nhap tu so: ");
            a = sc.nextInt();
            
            System.out.print("Nhap mau so: ");
            b = sc.nextInt();
            
            if(b == 0) {
                System.out.println("Mau so khong hop le");
            }else{
                tuSo = a;
                mauSo = b;
            }
        }while(b == 0);
    }
    
    // ham hien thi phan so
    public void HienthiPS(){
        if(tuSo*mauSo < 0){
            System.out.println("\t-"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
        }else{
            System.out.println("\t"+Math.abs(tuSo)+"/"+Math.abs(mauSo));
        }
    }
    
    // ham cong
    public PhanSo CongPS(PhanSo ps2){
        int a = tuSo*ps2.mauSo + ps2.tuSo*mauSo;
        int b = mauSo*ps2.mauSo;
        
        return new PhanSo(a,b);
    }
    
    // ham tru
    public PhanSo TruPS(PhanSo ps2){
        int a = tuSo*ps2.mauSo - ps2.tuSo*mauSo;
        int b = mauSo*ps2.mauSo;
        
        return new PhanSo(a,b);
    }
    
    // ham nhan
    public PhanSo NhaPS(PhanSo ps2){
        int a = tuSo*ps2.tuSo;
        int b = mauSo*ps2.mauSo;
        
        return new PhanSo(a,b);
    }
    
    // ham chia
    public PhanSo ChiaPS(PhanSo ps2){
        int a = tuSo*ps2.mauSo;
        int b = mauSo*ps2.tuSo;
        
        return new PhanSo(a,b);
    }
    
    // ham tim USCLN
    private int timuscln(int a, int b){
        int r = a%b;
        
        while(r!=0){
            a=b;
            b=r;
            r=a%b;
        }
        
        return b;
    }
    
    // ham kt toi gian
    private boolean kttg(){
        if(timuscln(tuSo, mauSo) == 1){
            return true;
        }
        return false;
    }
    
    // ham toi gian
    public void toiGian(){
        int x = timuscln(tuSo, mauSo);
        
        tuSo /= x;
        mauSo /= x;
    }
}
