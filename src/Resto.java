public class Resto {
        private String nama;
        private String lokasi;
        private int id;

        public Resto(String nama, String lokasi){
            this.nama=nama;
            this.lokasi=lokasi;
            id++;
        }

        public void setNamaResto(String nama){
            this.nama=nama;
        }
        public void setLokasiResto(String lokasi){
            this.lokasi=lokasi;
        }

        public String getNamaResto(){
            return this.nama;
        }
        public String getLokasiResto(){
            return this.lokasi;
        }
    }

