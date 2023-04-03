import java.util.Scanner;

public class Admin {
    private String nama;
    private String password;

    void display(){
        nama="admin";
        password="tude";
    }

    void register(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan username: ");
        String name=scanner.nextLine();
        System.out.println("Masukan password: ");
        String p=scanner.nextLine();

        if(name.equals(nama) && password.equals(p)){
            System.out.println("benar");
        }else{
            System.out.println("salah");
        }
    }
}
