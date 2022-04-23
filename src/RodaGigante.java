public class RodaGigante  extends Brinquedos{
    public static boolean regraRoda (int idade, double altura) {
        if (idade > 0 && altura > 0) {
            System.out.println("Pode participar da roda gigante");
            return true;
        }
        else {
            System.out.println("Não pode andar na roda gigante");
            return false;
        }
    }

}
