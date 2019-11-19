package br.com.pinalli.queue;

import br.com.pinalli.tad.simpleLinked.ListSimpleLinked;
import br.com.pinalli.tad.simpleLinked.ListTAD;
/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class QueueSimpleLinked<T> implements QueueTAD<T> {

    private ListTAD<T> f = new ListSimpleLinked<>();
 
    @Override
    public void enqueue(T element) {
        if(element != null)
        f.add(element);
        else 
            throw new IllegalArgumentException();
    }
   @Override
    public T dequeue() {
        return f.remove(0);

    }
    @Override
    public int size() {
        return f.size();
    }

    @Override
    public boolean isEmpty(){
        return f.isEmpty();
    }

    @Override
    public T getHead(){
        return f.getFirst();
       
    }

   @Override
    public String toString() {
        return f.toString()+ " ";
    }


}
