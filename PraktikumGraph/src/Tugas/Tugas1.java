package Tugas;
	
import praktikumgraph.Graph;
import praktikumgraph.LinkedList;
import java.util.Scanner;
public class Tugas1 {
    //menambahkan atribut
    int vertex;
    LinkedList list[];

    //menambahkan konstruktor default untuk inisialisasi variabel vertex
    public Tugas1(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        //menambahkan perulangan untuk jumlah vertex
        for (int i = 0;	i < vertex; i++) {
            list[i] = new LinkedList();
        }
    }

    //method addEdge()
    public void addEdge(int source, int destination) {
        //add edge
        list[source].addFirst(destination);
        //add back adge (for undirected)
        list[destination].addFirst(source);
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
                if (list[i].get(j) == source)
                    ++totalIn;
            }
            //outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dai vertex " + source + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
        System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));
    }

    //method removeEdge() untuk menghapus lintasan suatu graph
    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
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
    public static void main (String[] args) throws Exception {
        //mendeklarasikan variabel
        int count = 1, to, from;
        //membuat objek dari class graph serta menginstansiasi
        Graph graph = new Graph(6);
        Scanner input = new Scanner(System.in);
        //menginputkan jumlah lintasan yang diinginkan
        System.out.print("Masukkan jumlah inputan lintasan : ");
        int jumlah = input.nextInt();
        System.out.println("");
        //memasukkan edges yang dibutuhkan
        System.out.println("Masukkan edges: ");
        while (count <= jumlah) {
            to = input.nextInt();
            from = input.nextInt();
            graph.addEdge(to, from);
            count++;
        }
        System.out.println("");
        graph.printGraph(); //memanggil method printGraph
        graph.degree(2); //memanggil method degree
        //memanggil method removeEdge
        graph.removeEdge(1, 2);
        graph.printGraph(); //memanggil method printGraph
    }
}

