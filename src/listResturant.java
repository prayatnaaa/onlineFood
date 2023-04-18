import java.util.ArrayList;
import java.util.Scanner;


public class listResturant {

    private String nama;
    private int harga;

    Scanner sc = new Scanner(System.in);

    public void tambahMenu() {
        System.out.println("================================================");
        System.out.println("||                TAMBAH  MENU                ||");
        System.out.println("================================================");
        System.out.print("|| NAMA MENU   : ");
        this.nama = sc.nextLine();
        System.out.print("|| HARGA MENU  : ");
        this.harga = sc.nextInt();



        Data.menu.setNama(this.nama);
        Data.menu.setHarga(this.harga);

        Data.menus.add(Data.menu);

    }

    public void lihatMenu() {

        if (Data.menus.isEmpty()) {
            System.out.println("================================================");
            System.out.println("||      T I D A K   A D A    M E N U          ||");
            System.out.println("================================================");
        } else {
            System.out.println("================================================");
            System.out.println("||                  M.E.N.U                   ||");
            System.out.println("================================================");
            for (int i = 0; i < Data.menus.size(); i++) {
                System.out.printf("|| %d. NAMA MENU: %s         HARGA: Rp.%-46s \n", (i + 1), Data.menus.get(i).getNamaMenu(), Data.menus.get(i).getHarga());
            }
            System.out.println("================================================");
        }
    }
}

