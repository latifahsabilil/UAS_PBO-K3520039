/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programkaryawan;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
public class menuKaryawan2 extends menuKaryawan {
    
    ArrayList<DataKaryawan> menu = new ArrayList<DataKaryawan>();
    
    boolean del = false;
    boolean src = false;
    int nilai = 0;
    
    public void tambah(DataKaryawan dataK){
       menu.add(dataK);
    }
    
    public void hapus(String idKar){
        for(int i = 0; i < menu.size(); i++){
            if(menu.get(i).kode.equals(idKar)){
                menu.remove(i);
                del = true;
            }
        }
    }
    public void cari(String idKar){
        for(int i = 0; i < menu.size(); i++){            
            if(menu.get(i).kode.equals(idKar)){
                nilai = i;
                src = true;
                
            }
        }
        if(src){
            menu.get(nilai).display();
        }
    }
    
    public void display(){
        System.out.println("===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("KODE    NAMA    GOL    USIA    STATUS NIKAH    JUMLAH ANAK");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        
        for(int i=0; i <menu.size(); i++){
            String Kode = menu.get(i).kode;
            String Nama = menu.get(i).nama;
            String Golongan = menu.get(i).golongan;
            int Usia = menu.get(i).usia;
            String Status = "Belum Menikah";
            int anak = 0;
            if( menu.get(i).status == 1){
                Status = "Sudah Menikah";
                anak = menu.get(i).nAnak;
            }else {
                Status = "Belum Menikah";
                anak = 0;
            }

            System.out.println(Kode + "    " + Nama + "    " + Golongan+ "    " + Usia+"    " + Status + "    " + anak );
        }
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Jumlah Data : " + menu.size());
    }
    
}
