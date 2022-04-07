import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuUtama();
        Scanner number = new Scanner(System.in);
        Scanner letter = new Scanner(System.in);

        int inputMenuUtama = number.nextInt();

        System.out.print("Nama : ");
        String nama = letter.nextLine();
        System.out.print("Umur : ");
        int umur = number.nextInt();

        /*menuKedua(inputMenuUtama);
        menuKetiga();
        if (menuKetiga() == 1){
            if (inputMenuUtama == 1){
                Seleksi Pelajar = new Seleksi();
                Pelajar.HasilPelajar(umur, nama);
            }
            else{
                Seleksi Mahasiswa = new Seleksi();
                Mahasiswa.HasilMahasiswa(umur, nama);
            }
        }
        else{
            menuKedua(inputMenuUtama);
        }*/

        Seleksi Pelajar = new Seleksi();
        Seleksi Mahasiswa = new Seleksi();
        int hasil;


        if (inputMenuUtama == 1)
        {
            Scanner nilai = new Scanner(System.in);
            System.out.print("Nilai Struktur dan Konten Esay : ");
            double score1 = nilai.nextDouble();
            Pelajar.setSke(score1);
            System.out.print("Nilai Teknik dan Visualisasi : ");
            double score2 = nilai.nextDouble();
            Pelajar.setTv(score2);
            System.out.print("Nilai Kemampuan Design Thinking : ");
            double score3 = nilai.nextDouble();
            Pelajar.setKdt(score3);

            if (menuKetiga() == 1){
                Pelajar.getTotalPelajar();
                Pelajar.HasilPelajar(umur, nama);
                /*if (inputMenuUtama == 1){
                    Pelajar.getTotalPelajar();
                    Pelajar.HasilPelajar(umur, nama);
                }
                else{
                    Mahasiswa.getTotalMahasiswa();
                    Mahasiswa.HasilMahasiswa(umur, nama);
                }*/
            }
            else {
                //menuKedua(inputMenuUtama);


            }
        }
        else
        {
            Scanner nilai = new Scanner(System.in);
            System.out.print("Nilai Struktur dan Konten Jurnal : ");
            double score4 = nilai.nextDouble();
            Mahasiswa.setSkj(score4);
            System.out.print("Nilai Relevansi Data : ");
            double score5 = nilai.nextDouble();
            Mahasiswa.setRd(score5);
            System.out.print("Nilai Kemampuan Problem Solving : ");
            double score6 = nilai.nextDouble();
            Mahasiswa.setKps(score6);
            if (menuKetiga() == 1){
                Mahasiswa.getTotalMahasiswa();
                Mahasiswa.HasilMahasiswa(umur, nama);
                /*if (inputMenuUtama == 1){
                    Pelajar.getTotalPelajar();
                    Pelajar.HasilPelajar(umur, nama);
                }
                else{
                    Mahasiswa.getTotalMahasiswa();
                    Mahasiswa.HasilMahasiswa(umur, nama);
                }*/
            }
            else {
                //menuKedua(inputMenuUtama);


            }



        }
    }

    static void menuUtama(){
        System.out.println("1. Pendaftaran Beasiswa Pelajar \n2. Pendaftaran Beasiswa Mahasiswa");
        System.out.print("==> ");
    }

    /*static void menuKedua(int i){
        Seleksi Pelajar = new Seleksi();
        Seleksi Mahasiswa = new Seleksi();


        if (i == 1)
        {
            Scanner nilai = new Scanner(System.in);
            System.out.print("Nilai Struktur dan Konten Esay : ");
            double score1 = nilai.nextDouble();
            Pelajar.setSke(score1);
            System.out.print("Nilai Teknik dan Visualisasi : ");
            double score2 = nilai.nextDouble();
            Pelajar.setTv(score2);
            System.out.print("Nilai Kemampuan Design Thinking : ");
            double score3 = nilai.nextDouble();
            Pelajar.setKdt(score3);

        }
        else
        {
            Scanner nilai = new Scanner(System.in);
            System.out.print("Nilai Struktur dan Konten Jurnal : ");
            double score4 = nilai.nextDouble();
            Mahasiswa.setSkj(score4);
            System.out.print("Nilai Relevansi Data : ");
            double score5 = nilai.nextDouble();
            Mahasiswa.setRd(score5);
            System.out.print("Nilai Kemampuan Problem Solving : ");
            double score6 = nilai.nextDouble();
            Mahasiswa.setKps(score6);


        }
    }*/
    static int menuKetiga(){
        System.out.println("1. Lihat Hasil \n2. Edit Data");

        Scanner edit = new Scanner(System.in);
        int menuKetiga = edit.nextInt();
        return menuKetiga;
    }

}
