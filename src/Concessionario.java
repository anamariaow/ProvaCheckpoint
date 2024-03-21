public class Concessionario{
    private Auto[] automobili;

    public Concessionario(Auto[] automobili) {
        this.automobili = automobili;
    }

    public void rangePrezzo(Auto[] automobili) {
        double prezzoMin = automobili[0].getPrezzo();
        double prezzoMax = automobili[0].getPrezzo();
        for (int i = 0; i < automobili.length; i++) {
            if (automobili[i].getPrezzo() <= prezzoMin) {
                prezzoMin = automobili[i].getPrezzo();
            }
            if (automobili[i].getPrezzo() > prezzoMax) {
                prezzoMax = automobili[i].getPrezzo();
            }
        }
        System.out.println("Prezzo minimo: " + prezzoMin);
        System.out.println("Prezzo massimo: " + prezzoMax);
    }
    public Auto[] getAutomobili() {
        return automobili;
    }

    public void setAutomobili(Auto[] automobili) {
        this.automobili = automobili;
    }

}
