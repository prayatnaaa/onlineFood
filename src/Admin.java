import java.util.Scanner;

public class Admin {
    listResturant lr = new listResturant();
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

        resto.setNamaResto(nama);
        resto.setLokasiResto(lokasi);

        Data.restos.add(resto);
        System.out.println("SUCCEED!");
        System.out.println();
        menuAdmin();
    }

    public void lihatResto() {

        if (Data.restos.isEmpty()) {
            System.out.println("================================================");
            System.out.println("||         T I D A K   A D A   R E S T O      ||");
            System.out.println("================================================");
            menuAdmin();
        } else {
            System.out.println("================================================");
            System.out.println("||             R.E.S.T.A.U.R.A.N.T            ||");
            System.out.println("================================================");
            System.out.println("|| ID ||  NAMA RESTO    ||        LOKASI      ||");
            for (int i = 0; i < Data.restos.size(); i++) {
                System.out.printf("%d.  %-10s %-10s\n", (i + 1), Data.restos.get(i).getNamaResto(), Data.restos.get(i).getLokasiResto());
            }
            System.out.println("================================================");
            System.out.println("*Press 0 to Return to \"Menu Admin\"");
            System.out.print("Choose an Option: ");
            int pilih = sc.nextInt();

            if (pilih == 0) {
                menuAdmin();
            } else if (pilih < 0 || pilih > Data.restos.size()) {
                System.out.println("================================================");
                System.out.println("||        T I D A K   A D A   D A T A         ||");
                System.out.println("================================================");
                lihatResto();
            } else {
                Resto resto=Data.restos.get(pilih - 1);
                System.out.println("|| 1. TAMBAH MENU                             ||");
                System.out.println("|| 2. KEMBALI                                 ||");
                System.out.println("================================================");
                System.out.print("Choose an Option: ");
                int select = sc.nextInt();
                if (select == 1) {
                    lr.tambahMenu();
                    lihatResto();
                } else if (select == 2) {
                    menuAdmin();
                } else {
                    System.out.println("SALAH");
                    System.out.println();
                    lihatResto();
                }
            }
        }
    }

    public void hapusResto(){
        if(Data.restos.isEmpty()){
            System.out.println("================================================");
            System.out.println("||          TIDAK ADA DATA RESTAURANT         ||");
            System.out.println("================================================");
        }
        else{
            System.out.println("================================================");
            System.out.println("||             R.E.S.T.A.U.R.A.N.T            ||");
            System.out.println("================================================");
            System.out.println("|| ID ||  NAMA RESTO    ||        LOKASI      ||");
            for (int i = 0; i < Data.restos.size(); i++) {
                System.out.printf("%d.  %-10s %-10s\n", (i + 1), Data.restos.get(i).getNamaResto(), Data.restos.get(i).getLokasiResto());
            }
            System.out.println("================================================");
            System.out.println("Press 0 to Return to \"Menu Admin\"");
            System.out.print("Choose an Option: ");
            int hapusResto=sc.nextInt();

            if(hapusResto==0){
                menuAdmin();
            }
            else if(hapusResto < 0 || hapusResto > Data.restos.size()){
                System.out.println("================================================");
                System.out.println("||          TIDAK ADA DATA RESTAURANT         ||");
                System.out.println("================================================");
                hapusResto();
            }
            else{
                Data.restos.remove(hapusResto-1);
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
        System.out.print("Choose an Option: ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1 -> lihatResto();
            case 2 -> tambahResto();
            case 3 -> hapusResto();
            case 4 -> Main.login();
            case 0 -> System.exit(0);
            default -> {
                System.out.println("SALAH");
                menuAdmin();
            }
        }
    }
}



