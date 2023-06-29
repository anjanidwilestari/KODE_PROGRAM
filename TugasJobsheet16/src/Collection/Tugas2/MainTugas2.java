package Collection.Tugas2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainTugas2 {
Scanner sc = new Scanner(System.in);
    List<Mahasiswa> mhs = new ArrayList<>();
    List<MataKuliah> mk = new ArrayList<>();
    List<Nilai> n = new ArrayList<>();

    void data() {
        mhs.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        mhs.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        mhs.add(new Mahasiswa("20003", "Abdur-Rahman","021xxx"));
        mhs.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        mhs.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        mhs.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        mk.add(new MataKuliah("00001", "Internet of Things", "\t\t3"));
        mk.add(new MataKuliah("00002", "Algoritma dan Struktur Data", "\t2"));
        mk.add(new MataKuliah("00003", "Algoritma dan Pemrograman", "\t2"));
        mk.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data","3"));
        mk.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman","3"));
    }

    void input() {
        System.out.println(" Masukkan Data ");
        System.out.print("Kode  : ");
        String kode = sc.next();
        System.out.print("Nilai : ");
        float nilai = sc.nextFloat();
        System.out.println("***********");
        System.out.println("        DAFTAR MAHASISWA       ");
        System.out.println("***********");
        System.out.println("NIM\tNama\t\tTelf");
        for (Mahasiswa mahasiswa : mhs) {
            System.out.println(mahasiswa.nim + "\t" + mahasiswa.nama + "\t\t" + mahasiswa.no_telp);
        }
        boolean cari = true;
        String cariMhs;
        int d = 0;
        do {
            System.out.print("Cari Mahasiswa menggunakan NIM : ");
            cariMhs = sc.next();
            for (Mahasiswa mahasiswa : mhs) {
                if (cariMhs.equals(mahasiswa.nim)) {
                    cari = false;
                    d++;
                }
            }
            if (d == 0) {
                System.out.println("Data Kode NIM Tidak Ditemukan");
            }
        } while (cari);
        System.out.println("***********");
        System.out.println("        DAFTAR MATA KULIAH      ");
        System.out.println("***********");
        System.out.println("Kode      Mata Kuliah        \tSKS");
        for (MataKuliah matakuliah : mk) {
            System.out.println(matakuliah.kode + "\t" + matakuliah.mk + "\t" + matakuliah.sks);
        }
        boolean cari2 = true;
        String cariMk;
        int konfirmasi = 0;
        do {
            System.out.print("Cari MK menggunakan Kode : ");
            cariMk = sc.next();
            for (MataKuliah mklh : mk) {
                if (cariMk.equals(mklh.kode)) {
                    cari2 = false;
                    konfirmasi++;
                }
            }
            if (konfirmasi == 0) {
                System.out.println("Data Kode Matakuliah Tidak Ditemukan");
            }
        } while (cari2);
        n.add(new Nilai(kode, nilai, cariMk, cariMhs));
    }

    void tampil() {
        System.out.println("***********");
        System.out.println("    DAFTAR NILAI MAHASISWA     ");
        System.out.println("***********");
        System.out.println("NIM\tNama \t\tMata Kuliah\t\t\tSKS\tNilai");
        n.forEach(nilai -> {
            System.out.print(nilai.nim + "\t");
            for (Mahasiswa mahasiswa : mhs) {
                if (mahasiswa.nim.equals(nilai.nim)) {
                    System.out.print(mahasiswa.nama + "\t\t\t");
                }
            }
            for (MataKuliah matkul : mk) {
                if (matkul.kode.equals(nilai.kdmatakuliah)) {
                    System.out.print(matkul.mk + "\t" + matkul.sks + "\t");
                }
            }
            System.out.println(nilai.nilai);
        });
    }

    void cariNilai() {
        tampil();
        System.out.print("Masukkan Data Mahasiswa berdasarkan NIM : ");
        String caridata = sc.next();
        int d3 = 0;
        for (Nilai carinilai : n) {
            if (carinilai.nim.equals(caridata)) {
                System.out.print(carinilai.nim + "\t");
                for (Mahasiswa mahasiswa : mhs) {
                    if (mahasiswa.nim.equals(carinilai.nim)) {
                        System.out.print(mahasiswa.nama + "\t");
                    }
                }
                for (MataKuliah matkul : mk) {
                    if (matkul.kode.equals(carinilai.kdmatakuliah)) {
                        System.out.print(matkul.mk + "\t" + matkul.sks + "\t");
                    }
                }
                System.out.println(carinilai.nilai);
                d3++;
            }
        }
        if (d3 == 0) {
            System.out.println("Data Dengan NIM " + caridata + " Tidak Ditemukan");
        }
    }

    void urutNilai() {
        for (int i = 0; i < n.size() - 1; i++) {
            for (int j = 0; j < n.size() - i - 1; j++) {
                if (n.get(j).nilai > n.get(j + 1).nilai) {
                    float swap = n.get(j).nilai;
                    n.get(j).nilai = n.get(j + 1).nilai;
                    n.get(j + 1).nilai = swap;
                }
            }
        }
        tampil();
    }

    public static void main(String[] args) {
        MainTugas2 del = new MainTugas2();
        Scanner sc = new Scanner(System.in);
        int pilih;
        del.data();
        do {
            System.out.println("===================================================");
            System.out.println("  SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER  ");
            System.out.println("===================================================");
            System.out.println("= 1. Input Nilai                                  =");
            System.out.println("= 2. Tampil Nilai                                 =");
            System.out.println("= 3. Mencari Nilai Mahasiswa                      =");
            System.out.println("= 4. Urut Data Nilai                              =");
            System.out.println("= 5. Keluar                                       =");
            System.out.println("===================================================");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            if (pilih == 1) {
                del.input();
            } else if (pilih == 2) {
                del.tampil();
            } else if (pilih == 3) {
                del.cariNilai();
            } else if (pilih == 4) {
                del.urutNilai();
            } else {
                System.out.println("Pilihan Anda Tidak Tersedia :( ");
            }
            System.out.println("");
        } while (pilih >= 1 && pilih <= 4);
    }
}