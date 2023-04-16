import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {

   private int menu;
   private int jumlahMenu;

   private int jarak;

   Customer(int menu, int jumlahMenu){
       this.menu=menu;
       this.jumlahMenu=jumlahMenu;

   }

   public int getMenu(){
       return menu;
   }

   public int getJumlahMenu(){
       return jumlahMenu;
   }

   public void setJarak(int jarak){
       this.jarak=jarak;
   }
   public int getJarak(){
       return this.jarak;
   }

}

