package sistempenggajian;
public class SistemPenggajian {
    public static void main (String[] args){
        
        Posisi posisiDE = new Posisi();
        posisiDE.nama= "Data Engineer";
        posisiDE.gajiPokok=4000000;
        posisiDE.uangMakanPerHari =37000;
        
        Pegawai pegawai1 = new Pegawai();
        
        pegawai1.nama="Ani";
        pegawai1.nip="12345";
        pegawai1.alamat="Depok";
        pegawai1.posisiPegawai=posisiDE;
        pegawai1.jumlahHariMasuk=20;
        
        pegawai1.cetakInfoPegawai();
        
        Posisi posisiHRD = new Posisi();
        posisiHRD.nama= "Staf HRD";
        posisiHRD.gajiPokok=3500000;
        posisiHRD.uangMakanPerHari =35000;
        
        Pegawai pegawai2 = new Pegawai();
        
        pegawai2.nama="Budi";
        pegawai2.nip="56789";
        pegawai2.alamat="Tebet";
        pegawai2.posisiPegawai=posisiHRD;
        pegawai2.jumlahHariMasuk=22;
        
         pegawai2.cetakInfoPegawai();
        
    }
}

