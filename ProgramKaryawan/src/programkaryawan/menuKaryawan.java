/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programkaryawan;

/**
 *
 * @author Lenovo
 */
public abstract class menuKaryawan {
        
   boolean del = false;
   boolean src = false;
   int nilai = 0;
   
   abstract public void tambah(DataKaryawan dataK);
   abstract public void hapus(String kode);
   abstract public void cari(String kode);
   
}
