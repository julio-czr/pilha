import java.util.EmptyStackException;

public class stack<T> {
    private Node<T> pilha;
    private int tamanho;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public stack() {
        pilha = null;
        tamanho = 0;
    }

    public void push(T valor) {
        Node<T> newNode = new Node<>(valor);
        newNode.next = pilha;
        tamanho++;
    }

 
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
    }
        T data = pilha.data;
        pilha = pilha.next;
        tamanho--;
        return data;
    }

    public void clear() {
        pilha = null;  
        tamanho = 0; 
    }


    public boolean isEmpty() {
        return pilha == null;
    }
    
}
