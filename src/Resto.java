public class Resto {
        private String nama;
        private String lokasi;

        public Resto(String nama, String lokasi){
            this.nama=nama;
            this.lokasi=lokasi;
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

