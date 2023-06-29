package Collection.Tugas1;
public class Buku {
    String isbn,judul,terbit,penerbit;
    
    public Buku(String isbn, String judul,String terbit, String penerbit){
        this.isbn=isbn;
        this.judul=judul;
        this.terbit=terbit;
        this.penerbit=penerbit;
    }
    @Override
    public String toString(){
        return "Buku{" + "Isbn : " + isbn + ", Judul : " + judul 
                + ", Terbit : " + terbit + ", Penerbit : " + penerbit + '}';
    }
}

