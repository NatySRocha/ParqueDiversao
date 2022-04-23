public class ParqueDiversao {
    private static boolean regraMontanha;
    private static boolean regraCarrossel;
    private static boolean regraRoda;

    public static void main(String args[]) {
        Brinquedos brinquedos = new Brinquedos();
        MontanhaRussa.regraMontanha(8, 1.70);
        Carrossel.regraCarrossel(14, 1.10);
        RodaGigante.regraRoda(50, 1.70);

    }

}
