public class Mobil {
    private String merk;
    private String model;
    private int tahun;

    public Mobil(String merk, String model, int tahun) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
    }

    public void displayInfo() {
        System.out.println("Merk  : " + merk);
        System.out.println("Model : " + model);
        System.out.println("Tahun : " + tahun);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void displayDescription() {
        System.out.println("Mobil " + merk + " " + model + " tahun " + tahun);
    }
}
