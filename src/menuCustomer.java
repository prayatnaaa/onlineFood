import java.util.ArrayList;
import java.util.Scanner;
public class menuCustomer {
    private static ArrayList<Menu> listOrder=new ArrayList<>();
    private static ArrayList<Integer> jumlahOrder=new ArrayList<>();

    static Customer customer;
    static Menu menus;

    static Scanner sc=new Scanner(System.in);

    public static Menu getMenu(int index){
        return listOrder.get(index);
    }
    public static void loginCust(){

        System.out.println("================================================");
        System.out.println("||                LIST CUSTOMER               ||");
        System.out.println("================================================");
        System.out.println("|| 1. Buat Pesanan                            ||");
        System.out.println("|| 2. Lihat Pesanan                           ||");
        System.out.println("|| 3. Menu Login                              ||");
        System.out.println("|| 0. Exit                                    ||");
        System.out.println("================================================");
        System.out.print("Pilih Ospi: ");
        int pilih=sc.nextInt();

        switch (pilih) {
            case 1 -> {
                buatPesanan();
                loginCust();
            }
            case 2 -> {
                daftarPesan();
                loginCust();
            }
            case 3 -> Main.login();
            case 0 -> System.exit(0);
            default -> {
                System.out.println("WRONG INPUT, INPUT CORRECTLY!");
                loginCust();
            }
        }
    }

    public static void buatPesanan(){

        if (Data.restos.isEmpty()) {
            System.out.println("================================================");
            System.out.println("||         T I D A K   A D A   R E S T O      ||");
            System.out.println("================================================");
            loginCust();
        } else {
            System.out.println("================================================");
            System.out.println("||             R.E.S.T.A.U.R.A.N.T            ||");
            System.out.println("================================================");
            for (int i = 0; i < Data.restos.size(); i++) {
                System.out.printf("%d. NAMA RESTO: %s, LOKASI: %s\n", (i + 1), Data.restos.get(i).getNamaResto(), Data.restos.get(i).getLokasiResto());
            }
            System.out.println("0. Kembali");
            System.out.println("================================================");
            System.out.println("Pilih Resto: ");
            int pilih = sc.nextInt();

            if (pilih == 0) {
                loginCust();
            } else if (pilih < 0 || pilih > Data.restos.size()) {
                System.out.println("================================================");
                System.out.println("||        T I D A K   A D A   D A T A         ||");
                System.out.println("================================================");
                loginCust();
            } else {
                Resto resto = Data.restos.get(pilih - 1);
                buatPesananLoop();
            }
        }
    }
    public static void buatPesananLoop(){

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
                buatPesananLoop();
            }
            else if(pilih2==2){
                daftarPesan();
            }
            else{
                System.out.println("salah");
            }
        }
    }

    public static void daftarPesan(){
        Customer customer1=new Customer();

        System.out.println("================================================");
        System.out.println("|| ID ||           DAFTAR PESANAN             ||");
        System.out.println("================================================");
        for(int i=0; i<listOrder.size();i++) {
            System.out.printf("|| %d. %s        (%d)  %d", (i + 1), listOrder.get(i).getNamaMenu(), jumlahOrder.get(i).intValue(), (customer1.getJarak() * 1000) + (menus.getHarga() * jumlahOrder.get(i).intValue()));
        }
        System.out.println("================================================");
        System.out.println();
    }
}
