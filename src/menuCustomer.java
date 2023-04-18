import java.util.ArrayList;
import java.util.Scanner;
public class menuCustomer {

    private static ArrayList<Integer> jumlahOrder=new ArrayList<>();

    static Scanner sc=new Scanner(System.in);
    public static Menu getMenu(int index){
        return Data.menus.get(index);
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
        System.out.print("Choose an Option: ");
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
            System.out.println();
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
            System.out.print("Pilih Resto: ");
            int pilih = sc.nextInt();

            if (pilih == 0) {
                loginCust();
            } else if (pilih < 0 || pilih > Data.restos.size()) {
                System.out.println("================================================");
                System.out.println("||        T I D A K   A D A   D A T A         ||");
                System.out.println("================================================");
                loginCust();
            } else {
                Data.resto= Data.restos.get(pilih - 1);
                buatPesananLoop(Data.resto);
            }
        }
    }
    public static void buatPesananLoop(Resto resto) {

        listResturant lr = new listResturant();

        if (Data.menus.isEmpty()) {
            System.out.println("================================================");
            System.out.println("||               TIDAK ADA MENU               ||");
            System.out.println("================================================");
            System.out.println();
        } else {
            lr.lihatMenu();
            System.out.print("|| Choose Menu: ");
            int pilihMenu = sc.nextInt();
            System.out.print("|| Jumlah: ");
            int jumlah = sc.nextInt();
            System.out.print("|| Jarak Dari Lokasi Tujuan (Km): ");
            int jarak = sc.nextInt();

            Data.customer.setJarak(jarak);
            Data.menus.add(getMenu(pilihMenu - 1));
            jumlahOrder.add(jumlah);
            Data.customers.add(Data.customer);

                System.out.println("================================================");
                System.out.println("|| 1. Tambah Pesanan                          ||");
                System.out.println("|| 2. Pembayaran                              ||");
                System.out.println("================================================");
                System.out.print("Choose an Option: ");
                int pilih2 = sc.nextInt();
                if (pilih2 == 1) {
                    buatPesananLoop(Data.resto);
                } else if (pilih2 == 2) {
                    daftarPesan();
                } else {
                    System.out.println("WRONG INPUT, PLEASE INPUT CORRECTLY!");
                }
        }
    }

    public static void daftarPesan(){

        System.out.println("================================================");
        System.out.println("||                DAFTAR PESANAN              ||");
        System.out.println("================================================");
        System.out.println("RESTO: " +Data.resto.getNamaResto());
        System.out.println("================================================");
        for(int i=0; i<Data.menus.size() && i<jumlahOrder.size();i++) {
            System.out.println("ID      : "+(i+1));
            System.out.printf("PESANAN  : %-20s (%d) \n", Data.menus.get(i).getNamaMenu(), jumlahOrder.get(i));
            System.out.println("JARAK   : "+Data.customer.getJarak());
            System.out.println("TOTAL   : " +((Data.customer.getJarak()*500)+(Data.menu.getHarga() * jumlahOrder.get(i))));
        }
        System.out.println("================================================");
        System.out.println();
    }
}
