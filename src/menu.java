public class menu {
        private String namaMenu;
        private int hargaMenu;

        public menu(String namaMenu, int hargaMenu){
            this.namaMenu=namaMenu;
            this.hargaMenu=hargaMenu;
        }

        public void setNamaMenu(String namaMenu){
            this.namaMenu=namaMenu;
        }
        public void setHargaMenu(int hargaMenu){
            this.hargaMenu=hargaMenu;
        }

        public String getNamaMenu(){
            return this.namaMenu;
        }
        public int getHargaMenu(){
            return this.hargaMenu;
        }

    }

