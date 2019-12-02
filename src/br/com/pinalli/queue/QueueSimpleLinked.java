package br.com.pinalli.queue;

import br.com.pinalli.tad.simpleLinked.ListSimpleLinked;
import br.com.pinalli.tad.simpleLinked.ListTAD;
/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class QueueSimpleLinked<T> implements QueueTAD<T> {

    private ListTAD<T> fila = new ListSimpleLinked<>();
 
    @Override
    public void enqueue(T element) {
        if(element != null)
        fila.add(element);
        else 
            throw new IllegalArgumentException();
    }
   @Override
    public T dequeue() {
        return fila.remove(0);

    }
    @Override
    public int size() {
        return fila.size();
    }

    @Override
    public boolean isEmpty(){
        return fila.isEmpty();
    }

    @Override
    public T getHead(){
        return fila.getFirst();
       
    }

   @Override
    public String toString() {
        return fila.toString()+ " ";
    }


}
