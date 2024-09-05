public class DemoMobil {
    public static void main(String[] args) {
    
        Mobil mobil1 = new Mobil("Toyota", "Corolla", 2020);
        
        System.out.println("Informasi Mobil 1:");
        mobil1.displayInfo();
        
        mobil1.setMerk("Honda");
        mobil1.setModel("Civic");
        mobil1.setTahun(2022);

        System.out.println("\nInformasi Mobil 1 Setelah Update:");
        mobil1.displayInfo();
        
        System.out.println("\nDeskripsi Mobil 1:");
        mobil1.displayDescription();

        Mobil mobil2 = new Mobil("BMW", "X5", 2018);
        
        System.out.println("\nInformasi Mobil 2:");
        mobil2.displayInfo();
        
        mobil2.setMerk("Audi");
        mobil2.setModel("Q7");
        mobil2.setTahun(2021);
        
        System.out.println("\nInformasi Mobil 2 Setelah Update:");
        mobil2.displayInfo();
        
        System.out.println("\nDeskripsi Mobil 2:");
        mobil2.displayDescription();
    }
}
