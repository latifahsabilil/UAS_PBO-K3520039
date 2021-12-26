/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programkaryawan;

/**
 *
 * @author Lenovo
 */
import java.time.Period;
import java.time.LocalDate;

public class DataKaryawan {
    //tanggal
    public int dd;
    public int mm;
    public int yy;
    
    // karyawan
    public String kode;
    public String nama;
    public String alamat;
    public String lahir;
    public String golongan;
    
    // status
    public int gajiPokok;
    public int nAnak;
    public int usia;
    public int tPasangan;
    public int tPegawai;
    public int tAnak;
    public int gajiKotor;
    public int potongan;
    public int gajiBersih;
    public int status;
    
    // checking
    boolean statPas = false;
    boolean statP = false;
    boolean statA = false;
    
    //constructor
    public DataKaryawan(String kode, String nama, 
            String alamat, String lahir, String golongan,
            int status, int anak){
        
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.lahir = lahir;
        this.golongan = golongan;
        this.status = status;
        this.nAnak = anak;
        
        // usia
        String dtBorn= this.lahir;
        String[] born = dtBorn.split("-");
        yy = Integer.parseInt(born[0]);
        mm = Integer.parseInt(born[1]);
        dd = Integer.parseInt(born[2]);
        
        LocalDate from = LocalDate.of(yy, mm, dd);
        LocalDate today = LocalDate.now();
        
        int usiaKaryawan = Period.between(from, today).getYears();
        this.usia = usiaKaryawan;
        
        // gaji pokok
        switch (golongan) {
            case "A":
                gajiPokok = 5000000;
                break;
            case "B":
                gajiPokok = 6000000;
                break;
            case "C":
                gajiPokok = 7000000;
                break;
        }
        // tunjangan sudah menikah
        if(statPas == true){
                this.tPasangan = gajiPokok / 10;
                this.statPas = true;
        }
        
        //tunjangan memiliki anak
        switch(status){
            case 1 :
                if(nAnak > 0){
                    this.tAnak = (nAnak * gajiPokok * 5) / 100 ;
                    this.statA = true;
                }
                break;
        }
        
        //tunjangan pegawai usia > 30 tahun
        switch(status){
            case 1 :
                if(usia>30){
                    this.tPegawai = (gajiPokok * 15)/100;
                }
                break;
        }
        
        //Gaji Kotor, potongan, gaji bersih
        this.gajiKotor = gajiPokok + tPegawai + tPasangan + tAnak;
        this.potongan = (gajiKotor * 25)/100;
        this.gajiBersih = gajiKotor - potongan;
    }
    
    // method display
    public void display(){
        System.out.println("===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        
        System.out.println("Kode Karyawan  : " + this.kode);
        System.out.println("Nama Karyawan  : " + this.nama);
        System.out.println("Golongan       : " + this.golongan);
        System.out.println("Usia           : " + this.usia);
        
        if (status == 0){
            System.out.println("Status Menikah : Belum Menikah" );
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
        } else if (status == 1){
            System.out.println("Status Menikah : Menikah" );
            System.out.println("Jumlah Anak    : " + this.nAnak );
            System.out.println("----------------------------------------------------------------------------------------------------------------------");
        }
        System.out.println("Gaji Pokok     : Rp. " + this.gajiPokok );
        
        // tunjangan
        if(statPas){
            System.out.println("Tunjangan Suami/Istri : Rp. " + this.tPasangan);
        }
        if(statP){
            System.out.println("Tunjangan Pegawai     : Rp. " + this.tPegawai );
        }
        if(statA){
            System.out.println("Tunjangan Pegawai     : Rp. " + this.tAnak );
        }
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Gaji Kotor      : Rp. " + gajiKotor);
        System.out.println("Potongan        : Rp. " + potongan);
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("Gaji Bersih     : Rp. " + gajiBersih);
    }
}
