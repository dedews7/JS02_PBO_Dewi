public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(10, 5);

        pp.displayInfo();

        int luas = pp.getLuas();
        System.out.println("Luas   : " + luas);

        int keliling = pp.getKeliling();
        System.out.println("Keliling: " + keliling);
    }
    
}
