public class Menu {
    private String nama;
    private int harga;

    public Menu(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNamaMenu() {
        return this.nama;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }


}