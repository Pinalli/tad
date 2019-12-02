package br.com.pinalli.tad.stack;

import br.com.pinalli.tad.simpleLinked.ListSimpleLinked;
import br.com.pinalli.tad.simpleLinked.ListTAD;

/**
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class StackSimpleLinked<T> implements StackTAD<T> {

    private ListTAD<T> pilha = new ListSimpleLinked<>();

    @Override
    public void push(T element) {
        pilha.addFirst(element);
        
    }

    @Override
    public T pop() {

        if (!pilha.isEmpty()) {
            return pilha.removeFirst();
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public int size() {
        return pilha.size();
    }

    @Override
    public boolean isEmpty() {
        return pilha.isEmpty();

    }

    @Override
    public T top() throws EmptyStackException {

        if (!pilha.isEmpty()) {
            return pilha.get(0);
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public String toString() {
        return pilha.toString()+ " ";
    }

  
}
