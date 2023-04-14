import java.util.ArrayList;
import java.util.Scanner;

public class listMenu {

    String nama;
    int harga;
    Scanner sc = new Scanner(System.in);
    ArrayList<menu> menu1 = new ArrayList<>();
    public void tambahMenu() {

        menu menu1 = new menu(this.nama, this.harga);

        System.out.println("================================================");
        System.out.println("||               TAMBAH  MENU                 ||");
        System.out.println("================================================");
        System.out.print("  Nama Menu: ");
        this.nama = sc.nextLine();
        System.out.print("  Harga Menu: ");
        this.harga = sc.nextInt();

            menu1.setHargaMenu(this.harga);
            menu1.setNamaMenu(this.nama);
    }


    public void lihatMenu() {

        for (int i=0; i< menu1.size();) {
            System.out.println(menu1.get(i).getNamaMenu());
            System.out.println(menu1.get(i).getHargaMenu());
            i++;
        }
    }
}
