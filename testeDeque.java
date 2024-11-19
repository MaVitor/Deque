public class TesteDeque {
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.inserirInicio(1);
        deque.inserirFim(2);
        deque.inserirFim(3);
        deque.inserirInicio(0);

        System.out.println(deque.primeiro());
        System.out.println(deque.ultimo());
        System.out.println(deque.tamanho());

        System.out.println(deque.removerInicio());
        System.out.println(deque.removerFim());

        System.out.println(deque.primeiro());
        System.out.println(deque.ultimo());
        System.out.println(deque.tamanho());

        deque.removerInicio();
        deque.removerInicio();
        try {
            deque.removerInicio();
        } catch (DequeVazioException e) {
            System.out.println(e.getMessage());
        }
    }
}
