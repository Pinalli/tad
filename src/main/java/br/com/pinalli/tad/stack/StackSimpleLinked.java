package br.com.pinalli.tad.stack;
import br.com.pinalli.tad.simpleLinked.ListSimpleLinked;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;
/**
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class StackSimpleLinked<T> implements StackTAD<T> {

    private Node first; //topo da pilha
    private int count;

    
    private class Node {

        private T element;
        private Node next;

        public T getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

    }
    public StackSimpleLinked() {
        first = null;
        count = 0;

    }

  @Override
    public boolean isEmpty() {
        return first == null;

    }
    
   @Override
    public int size() {
        return count;
    }

    /**
     * Adds the item to this stack.
     *
     * @param element
     */
    @Override
    public void push(T element) {
      
        Node oldFirst = first;
        first = new Node();
        first.element = element;
        first.next = oldFirst;
        count++;
     //  System.out.println(element);
    }
    
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack underflow");
        }
        T element = first.element;// save item to return
        first = first.next; // delete first node
        count--;
        return element; // return the saved item

    }

  
    @Override
    public T top() throws EmptyStackException {
       if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return first.element;
      
    }

    @Override
 public String toString() {
        Node current = first;
        String result = "";

        while (current != null) {
            result = result + (current.getElement()).toString()+ " - ";
            current = current.getNext();
        }

        return result;

}
}