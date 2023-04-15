import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    listResturant lr = new listResturant();
    private ArrayList<Resto> restos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void tambahResto() {

        System.out.println("================================================");
        System.out.println("||               TAMBAH  RESTO                ||");
        System.out.println("================================================");
        sc.nextLine();
        System.out.print("NAMA RESTAURANT   : ");
        String nama = sc.nextLine();
        System.out.print("LOKASI RESTAURANT : ");
        String lokasi = sc.nextLine();

        Resto resto = new Resto(nama, lokasi);

        restos.add(resto);

        menuAdmin();
    }

    public void lihatResto() {

        if (restos.isEmpty()) {
            System.out.println("================================================");
            System.out.println("||         T I D A K   A D A   R E S T O      ||");
            System.out.println("================================================");
            menuAdmin();
        } else {
            System.out.println("================================================");
            System.out.println("||             R.E.S.T.A.U.R.A.N.T            ||");
            System.out.println("================================================");
            for (int i = 0; i < restos.size(); i++) {
                System.out.printf("%d. NAMA RESTO: %s, LOKASI: %s\n", (i + 1), restos.get(i).getNamaResto(), restos.get(i).getLokasiResto());
            }
            System.out.println(" 0. Kembali ke Menu Admin");
            System.out.println("================================================");
            System.out.print("Masukan Opsi: ");
            int pilih = sc.nextInt();

            if (pilih == 0) {
                menuAdmin();
            } else if (pilih < 0 || pilih > restos.size()) {
                System.out.println("================================================");
                System.out.println("||        T I D A K   A D A   D A T A         ||");
                System.out.println("================================================");
                lihatResto();
            } else {
                Resto resto=restos.get(pilih - 1);
                System.out.println("|| 1. TAMBAH MENU                             ||");
                System.out.println("|| 2. KEMBALI                              ||");
                System.out.println("================================================");
                System.out.print("Pilih Opsi: ");
                int select = sc.nextInt();
                if (select == 1) {
                    lr.tambahMenu();
                    lihatResto();
                } else if (select == 2) {
                    menuAdmin();
                } else {
                    System.out.println("SALAH");
                    lihatResto();
                }
            }
        }
    }

    public void hapusResto(){
        if(restos.isEmpty()){
            System.out.println("================================================");
            System.out.println("||          TIDAK ADA DATA RESTAURANT         ||");
            System.out.println("================================================");
        }
        else{
            System.out.println("================================================");
            System.out.println("||                 RESTAURANT                 ||");
            System.out.println("================================================");
            for(int i=0; i<restos.size();i++){
                System.out.printf("%d. NAMA RESTO: %s, LOKASI: %s\n", (i + 1), restos.get(i).getNamaResto(), restos.get(i).getLokasiResto());
            }
            System.out.println("0. Kembali ke Menu Admin");
            System.out.println("================================================");
            System.out.print("Masukan Opsi: ");
            int hapusResto=sc.nextInt();

            if(hapusResto==0){
                menuAdmin();
            }
            else if(hapusResto < 0 || hapusResto > restos.size()){
                System.out.println("================================================");
                System.out.println("||          TIDAK ADA DATA RESTAURANT         ||");
                System.out.println("================================================");
                hapusResto();
            }
            else{
                restos.remove(hapusResto-1);
            }
            menuAdmin();
        }
    }

    public void menuAdmin() {
        System.out.println("================================================");
        System.out.println("||                LIST  ADMIN                 ||");
        System.out.println("================================================");
        System.out.println("||  1. Lihat Restaurant                       ||");
        System.out.println("||  2. Tambah Restaurant                      ||");
        System.out.println("||  3. Hapus Restaurant                       ||");
        System.out.println("||  4. Kembali ke Login                       ||");
        System.out.println("||  0. Exit                                   ||");
        System.out.println("================================================");
        System.out.print("Pilih Opsi: ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1 -> lihatResto();
            case 2 -> tambahResto();
            case 3 -> hapusResto();
            case 4 -> loginAdmin();
            case 0 -> System.exit(0);
            default -> {
                System.out.println("SALAH");
                menuAdmin();
            }
        }
    }

    public void loginAdmin() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            menuAdmin();
        }
    }
}



