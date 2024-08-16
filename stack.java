public class stack<T> {
    private Node<T> pilha;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    public stack() {
        pilha = null;
    }

    public void push(T valor) {
        Node<T> newNode = new Node<>(valor);
        newNode.next = pilha;
    }

 
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = pilha.data;
        pilha = pilha.next;
        return data;
    }

    public void clear() {
        pilha = null;  
    }


    public boolean isEmpty() {
        return pilha == null;
    }
    
}
