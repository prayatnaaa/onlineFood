import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    Scanner sc=new Scanner(System.in);

    static Admin admin = new Admin();

    static void login(){
        Scanner sc = new Scanner(System.in);

        menuCustomer mc = new menuCustomer();
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            admin.menuAdmin();
        }
        else{
            ArrayList<Resto>restos=new ArrayList<>();
            mc.loginCust();
        }
    }
    public static void main(String[] args) {
        login();
    }

    public static Admin getAdminObject(){
        return admin;
    }
}

