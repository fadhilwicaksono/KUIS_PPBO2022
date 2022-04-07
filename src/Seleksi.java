import beasiswa.BeasiswaMahasiswa;
import beasiswa.BeasiswaPelajar;

public class Seleksi implements BeasiswaMahasiswa, BeasiswaPelajar {
    double skj,rd,kps,ske,tv,kdt, totalMahasiswa= 0, totalPelajar;
    String nama;

    public double getTotalPelajar() {
        return totalPelajar;
    }

    public void setTotalPelajar(double totalPelajar) {
        this.totalPelajar = totalPelajar;
    }

    public double getTotalMahasiswa() {
        return totalMahasiswa;
    }

    public void setTotalMahasiswa(double totalMahasiswa) {
        this.totalMahasiswa = totalMahasiswa;
    }

    public double getSkj() {
        return skj;
    }

    public void setSkj(double skj) {
        this.skj = skj;
    }

    public double getRd() {
        return rd;
    }

    public void setRd(double rd) {
        this.rd = rd;
    }

    public double getKps() {
        return kps;
    }

    public void setKps(double kps) {
        this.kps = kps;
    }

    public double getSke() {
        return ske;
    }

    public void setSke(double ske) {
        this.ske = ske;
    }

    public double getTv() {
        return tv;
    }

    public void setTv(double tv) {
        this.tv = tv;
    }

    public double getKdt() {
        return kdt;
    }

    public void setKdt(double kdt) {
        this.kdt = kdt;
    }

    //Mahasiswa//
    @Override
    public void skj() {
        skj = (skj/100) * 60;
    }

    @Override
    public void rd() {
        rd = (rd/100) * 25;
    }

    @Override
    public void kps() {
        kps = (kps/100) * 15;
    }
/////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////

    //Pelajar//
    @Override
    public void ske() {
        ske = (ske/100) * 50;
    }

    @Override
    public void tv() {
        tv = (tv/100) * 20;
    }

    @Override
    public void kdt() {
        kdt = (kdt/100) * 30;

    }

    void HasilMahasiswa(int umur, String nama){
        setTotalMahasiswa(getSkj() + getRd() + getKps());
        if (getTotalMahasiswa() >= 87.5 && (umur <= 24) && (umur >=16) ) {
            System.out.println("Selamat " + nama + " Diterima karena telah mencukupi persyaratan umur dan nilai");
        }
        else{
            System.out.println("Maaf " + nama + " Tidak Diterima karena tidak cukup umur atau nilai anda kurang");

        }
    }
    void HasilPelajar(int umur, String nama){
        setTotalPelajar(getSke() + getTv() + getKdt());
        if (getTotalPelajar() >= 87.5 && (umur <= 24) && (umur >=16)){
            System.out.println("Selamat " + nama + " Diterima karena telah mencukupi persyaratan umur dan nilai");
        }
        else{
            System.out.println("Maaf " + nama + " Tidak Diterima karena tidak cukup umur atau nilai anda kurang");

        }
    }
}
