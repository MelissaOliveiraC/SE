public class LimiteObserver implements Observer {
    private static final int LIMITE_PESO = 5;

    @Override
    public void update(int novoPeso) {
        if (novoPeso <= LIMITE_PESO) {
            System.out.println("Dentro do limite de peso.");
        } else {
            System.out.println("Fora do limite de peso.");
        }
    }
}
