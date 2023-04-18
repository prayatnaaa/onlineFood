import java.util.Scanner;
public class Main {
    static Admin admin = new Admin();
    static menuCustomer mc = new menuCustomer();

    static void login(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (username.equals("admin") && password.equals("admin")) {
            admin.menuAdmin();
        }
        else{
            mc.loginCust();
        }
    }
    public static void main(String[] args) {
        login();
    }
}

