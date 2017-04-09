class Laptop extends Laptop2{

    String bentuk;
    String dilipat;
    String warna;
    String merk;
    
    public void set(String bentuk, String dilipat, String warna, String merk) {
        this.bentuk = bentuk;
        this.dilipat = dilipat;
        this.warna = warna;
        this.merk = merk;
        }

    public void menyala (){
        System.out.println("Laptop menyala dengan sebuah batre yang dapat di isi ulang");
        super.menyala();

        }

    public void lihat() {
        System.out.println("Ciri laptop");
        System.out.println("bentuk   : " + bentuk);
        System.out.println("Dilipat : " + dilipat);
        System.out.println("Warna   : " + warna);
        System.out.println("Merk   : " + merk);
    }

}