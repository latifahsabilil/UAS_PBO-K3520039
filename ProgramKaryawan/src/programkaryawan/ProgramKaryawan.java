/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programkaryawan;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class ProgramKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean pilihMenu = true;
        menuKaryawan2 menuK = new menuKaryawan2();
        
        while(pilihMenu){    
            System.out.println("===================================");
            System.out.println("Menu Utama");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            System.out.println("1. Tambah data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
            
            Scanner input = new Scanner( System.in );
            System.out.print("Menu pilihan: ");
            
            int Pilih = input.nextInt();
            boolean Tambah = true;
            boolean Hapus = true;
            boolean Cari = true;
            boolean Display = true;
            switch(Pilih){
                case 1 : 
                    while(Tambah){
                        System.out.println("");
                        System.out.println("===================================");
                        System.out.println("Menu Tambah Data");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                        String tbh = input.nextLine();
                        
                        //input kode, nama, Alamat, tanggal lahir, Golongan. status. jumlah anak,
                        System.out.print("Masukan Kode Karyawan             : ");
                        String Kode = input.nextLine();
                        System.out.print("Masukan Nama Karyawan             : ");
                        String Nama = input.nextLine();
                        System.out.print("Masukan Alamat                    : ");
                        String Alamat = input.nextLine();
                        System.out.print("Masukan Tanggal Lahir (YYYY-MM-DD): ");
                        String Lahir = input.nextLine();
                        System.out.print("Masukan Golongan (A/B/C)          : ");
                        String Golongan = input.nextLine();
                        System.out.println("");
                        
                        System.out.println("Masukan Status Menikah");
                        System.out.println("0. Belum");
                        System.out.println("1. Menikah");
                        System.out.print("Status Karyawan                   : ");
                        int status = input.nextInt();
                        int nAnak;
                        if( status == 1 ){
                            System.out.print("Jumlah Anak                       : ");
                            nAnak = input.nextInt();
                        } else {
                            status = 0;
                            nAnak = 0;
                        }
                        
                        DataKaryawan dataK = new DataKaryawan(Kode, Nama, Alamat, Lahir, Golongan, status, nAnak);  
                        menuK.tambah(dataK);
                        
                        //SUBMENU
                        System.out.println("");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("2. Tambah Data Kembali");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int pilih = input.nextInt();
                        if(pilih == 1){
                            Tambah = false;
                        }
                    }
                    break;

                
                    
                case 2 : 
                    
                    while(Hapus) {
                        System.out.println("");
                        System.out.println("===================================");
                        System.out.println("Menu Hapus Data");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                        String tbh = input.nextLine();
                        
                        System.out.print("Masukan kode karyawan yang mau dihapus : ");
                        String Kode = input.nextLine(); 
                        menuK.hapus(Kode);
                        

                        //SUBMENU
                        System.out.println("");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int pilih = input.nextInt();
                        if(pilih == 1){
                            Hapus = false;
                        }
                        
                    }
                    break;

                
                case 3 :                     
                    
                    while(Cari){
                        System.out.println("");
                        System.out.println("===================================");
                        System.out.println("Menu Cari Data");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                        String tbh = input.nextLine();
                        
                        System.out.print("Masukan Kode Karyawan : ");
                        String Id = input.nextLine();

                        menuK.cari(Id);

                        //SUBMENU
                        System.out.println("");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int pilih = input.nextInt();
                        if(pilih == 1 ){
                            Cari = false;
                        }
                    }
                    break;

                
                case 4 : 
                    
                    while(Display){
                        menuK.display();                        
                        
                        //SUBMENU
                        System.out.println("");
                        System.out.println("----------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Pilih Submenu : ");
                        System.out.println("1. Kembali ke menu utama");
                        System.out.println("");
                        System.out.print("Menu Pilihan : ");
                        
                        int pilih = input.nextInt();
                        if(pilih == 1){
                            Display = false;
                        }
                    }
                    break;

                    
                case 5 : 
                    System.exit(0);
                
            }   
            
        }
    }
    
}
