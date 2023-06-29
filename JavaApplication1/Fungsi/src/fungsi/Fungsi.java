
static int[] B = new int[10];
    static String[] A = new String[10];
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<A.length; i++) {
            System.out.print("Masukkan nilai ujian Mahasiswa ke-" + (i + 1) + ": ");
            A[i] = sc.nextLine();
        }
        for(int i=0; i< B.length; i++) {
            System.out.print("Masukkan nilai ujian Mahasiswa ke-" +(i+1)+ ": ");
            B[i] = input.nextInt();
        }
        data(A,B);
        System.out.println("Nilai rata-rata ujian mahasiswa adalah " + HitungRerata());
    }

    static void data(String[] A, int []B) {
        for(int i=0; i<A.length; i++) {
            System.out.println(A[i] +"  "+ B[i]);
        }
    }

    static double HitungRerata() {
        double rerata;
        int total = 0;
        for (int j : B) {
            total += j;
        }
        rerata = (double) total/ B.length;
        return rerata;
    }
}



   