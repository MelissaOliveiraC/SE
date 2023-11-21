public class ImpressaoObserver implements Observer {
    @Override
    public void update(int novoPeso) {
        System.out.println("Novo peso: " + novoPeso + "kg");
    }
}
