package Tugas;
import java.util.Scanner;

public class Tugas4<T> {
    //menambahkan atribut
    int vertex;
    LinkedList<T> list[];

    //menambahkan konstruktor default untuk inisialisasi variabel vertex
    public Tugas4(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        //menambahkan perulangan untuk jumlah vertex
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    //method addEdge()
    public void addEdge(int index, int index2, String source, String destination) {
        //add edge
        list[index].addFirst(destination);
        //add back adge (for undirected)
        list[index2].addFirst(source);
    }

    //method degree() untuk menampilkan jumlah derajat lintasan pada suatu vertex
    public void degree(int source) throws Exception {
        //degree undirected graph
        System.out.println("degree vertex " + source + " : " + list[source].size());
        //degree directed graph
        //inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j).equals(source)) {
                    ++totalIn;
                }
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dai vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn +
        totalOut));
    }

    //method removeEdge() untuk menghapus lintasan suatu graph
    public void removeEdge(int source, int destination) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == destination){
                list[source].remove(destination);
            }
        }
    }

    //method removeAllEdges() untuk menghapus semua vertex yang ada di dalam graph
    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    //method printGraph() untuk mencatak graph ter-update
    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    //method main()
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //membuat objek dari class graph serta menginstansiasi
        Tugas4 tugas4 = new Tugas4(6);
        //	0 Malang	3 Bandung
        //	1 Surabaya	4 Sidoarjo
        //	2 Gresik
        tugas4.addEdge(0, 1, "Malang", "Surabaya");
        tugas4.addEdge(0, 4, "Malang", "Sidoarjo");
        tugas4.addEdge(1, 2, "Surabaya", "Gresik");
        tugas4.addEdge(1, 3, "Surabaya", "Bandung");
        tugas4.addEdge(1, 4, "Surabaya", "Sidoarjo");
        tugas4.addEdge(2, 3, "Gresik", "Bandung");
        tugas4.addEdge(3, 4, "Bandung", "Sidoarjo");
        tugas4.addEdge(3, 0, "Bandung", "Malang");
        System.out.println("");
        tugas4.printGraph(); //memanggil method printGraph
        tugas4.degree(2); //memanggil method degree
        //memanggil method removeEdge
        tugas4.removeEdge(1, 2);
        tugas4.printGraph(); //memanggil method printGraph
    }
}

