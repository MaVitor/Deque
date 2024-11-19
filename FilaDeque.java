import java.util.ArrayList;

public class Deque {
    private ArrayList<Object> deque;

    public Deque() {
        this.deque = new ArrayList<>();
    }
    public void inserirInicio(Object o) {
        deque.add(0, o);
    }
    public Object removerInicio() {
        if (estaVazia()) {
            throw new DequeVazioException("Deque vazio");
        }
        return deque.remove(0);
    }
    public void inserirFim(Object o) {
        deque.add(o);
    }
    public Object removerFim() {
        if (estaVazia()) {
            throw new DequeVazioException("Deque vazio");
        }
        return deque.remove(deque.size() - 1);
    }
    public Object primeiro() {
        if (estaVazia()) {
            throw new DequeVazioException("Deque vazio");
        }
        return deque.get(0);
    }
    public Object ultimo() {
        if (estaVazia()) {
            throw new DequeVazioException("Deque vazio");
        }
        return deque.get(deque.size() - 1);
    }
    public int tamanho() {
        return deque.size();
    }

    public boolean estaVazia() {
        return deque.isEmpty();
    }
}
