import java.util.ArrayList;
import java.util.List;

public class PesoObservable {
    private int peso;
    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPeso(int novoPeso) {
        this.peso = novoPeso;
        notificarObservers();
    }

    public int getPeso() {
        return peso;
    }

    private void notificarObservers() {
        for (Observer observer : observers) {
            observer.update(peso);
        }
    }
}