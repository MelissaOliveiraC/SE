public class Main {
    public static void main(String[] args) {
        PesoObservable pesoObservable = new PesoObservable();

        ImpressaoObserver impressaoObserver = new ImpressaoObserver();
        LimiteObserver limiteObserver = new LimiteObserver();

        pesoObservable.adicionarObserver(impressaoObserver);
        pesoObservable.adicionarObserver(limiteObserver);

        pesoObservable.setPeso(3);
        pesoObservable.setPeso(6);
    }
}
