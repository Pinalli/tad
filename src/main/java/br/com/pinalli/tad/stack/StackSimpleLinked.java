package br.com.pinalli.tad.stack;

import br.com.pinalli.tad.simpleLinked.ListSimpleLinked;
import br.com.pinalli.tad.simpleLinked.ListTAD;

/**
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class StackSimpleLinked<T> implements StackTAD<T> {

    private ListTAD<T> lst = new ListSimpleLinked<>();

    @Override
    public void push(T element) {
        lst.addFirst(element);
        
    }

    @Override
    public T pop() {

        if (!lst.isEmpty()) {
            return lst.removeFirst();
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public int size() {
        return lst.size();
    }

    @Override
    public boolean isEmpty() {
        return lst.isEmpty();

    }

    @Override
    public T top() throws EmptyStackException {

        if (!lst.isEmpty()) {
            return lst.get(0);
        } else {
            throw new EmptyStackException();
        }
    }

    @Override
    public String toString() {
        return lst.toString()+ " ";
    }

  
}
