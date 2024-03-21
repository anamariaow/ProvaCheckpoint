public class Auto {
    private String marca;
    private String modello;
    private int cilindrata;
    private int numeroPorte;
    private int numeroPosti;
    private double prezzo;

    public Auto(String marca, String modello, int cilindrata, int numeroPorte, int numeroPosti, double prezzo) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.numeroPorte = numeroPorte;
        this.numeroPosti = numeroPosti;
        this.prezzo = prezzo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

    public void setNumeroPosti(int numeroPosti) {
        this.numeroPosti = numeroPosti;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                ", numeroPorte=" + numeroPorte +
                ", numeroPosti=" + numeroPosti +
                ", prezzo=" + prezzo +
                '}';
    }
}
