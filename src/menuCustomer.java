import java.util.ArrayList;
import java.util.Scanner;
public class menuCustomer {
    private String nama;
    private String alamat;
    private ArrayList<Menu> listOrder=new ArrayList<>();
    private ArrayList<Integer> jumlahOrder=new ArrayList<>();
    Menu menus;

    Scanner sc=new Scanner(System.in);

    menuCustomer() {
        this.nama=nama;
        this.alamat=alamat;
    }

    public Menu getMenu(int index){
        return listOrder.get(index);
    }
    public void setNamaCust(String nama){
        this.nama=nama;
    }
    public String getNamaCust(){
        return this.nama;
    }
    public void setAlamatCust(String nama) {
        this.alamat = alamat;
    }
    public String getAlamatCust() {
        return this.alamat;
    }

    public void buatPesanan(Customer customer){

        ArrayList<Resto>restos=new ArrayList<>();
        if (restos.isEmpty()) {
            System.out.println("================================================");
            System.out.println("||         T I D A K   A D A   R E S T O      ||");
            System.out.println("================================================");
            //buatPesanan(cus);
        } else {
            System.out.println("================================================");
            System.out.println("||             R.E.S.T.A.U.R.A.N.T            ||");
            System.out.println("================================================");
            for (int i = 0; i < restos.size(); i++) {
                System.out.printf("%d. NAMA RESTO: %s, LOKASI: %s\n", (i + 1), restos.get(i).getNamaResto(), restos.get(i).getLokasiResto());
            }
            System.out.println("0. Kembali");
            System.out.println("================================================");
            System.out.println("Pilih Resto: ");
            int pilih = sc.nextInt();

            if (pilih == 0) {
                //menuAdmin();
            } else if (pilih < 0 || pilih > restos.size()) {
                System.out.println("================================================");
                System.out.println("||        T I D A K   A D A   D A T A         ||");
                System.out.println("================================================");
                //lihatResto();
            } else {
                Resto resto = restos.get(pilih - 1);
                buatPesananLoop(customer, resto);
            }
        }
    }
    public void buatPesananLoop(Customer customer, Resto resto){

        listResturant lr=new listResturant();
        if(listOrder.isEmpty()){
            System.out.println("================================================");
            System.out.println("||               TIDAK ADA MENU               ||");
            System.out.println("================================================");
        }
        else{
            lr.lihatMenu();
            System.out.print("|| Pilih Opsi: ");
            int pilih=sc.nextInt();
            System.out.print("Jumlah: ");
            int jumlah=sc.nextInt();
            System.out.println("Berapa kilometer dari tujuan: ");
            int jarak=sc.nextInt();

            customer.setJarak(jarak);

            listOrder.add(getMenu(pilih-1));
            jumlahOrder.add(jumlah);

            System.out.println("================================================");
            System.out.println("|| 1. Tambah Pesanan                          ||");
            System.out.println("|| 2. Checkout                                ||");
            System.out.println("================================================");
            System.out.print("Pilih Opsi: ");
            int pilih2=sc.nextInt();
            if(pilih2==1){
                buatPesananLoop(customer, resto);
            }
            else if(pilih2==2){
                daftarPesan(customer, resto);
            }
            else{
                System.out.println("salah");
            }
        }
    }

    public void daftarPesan(Customer customer, Resto resto){
        System.out.println("================================================");
        System.out.println("|| ID ||           DAFTAR PESANAN             ||");
        System.out.println("================================================");
        System.out.println("|| Nama Resto   : "+resto.getNamaResto());
        System.out.println("|| Lokasi Resto : "+resto.getLokasiResto());
        System.out.println("================================================");
        for(int i=0; i<listOrder.size();i++)
        System.out.printf("|| %d. %s        (%d)  %d", (i+1), listOrder.get(i).getNamaMenu(), jumlahOrder.get(i).intValue(), (customer.getJarak()*1000)+(menus.getHarga()*jumlahOrder.get(i).intValue()));
        System.out.println("================================================");
        System.out.println();
    }


}
