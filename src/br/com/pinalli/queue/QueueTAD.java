
package br.com.pinalli.queue;

/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public interface QueueTAD <T>{
    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException(String s) { 
            super(s); }

        EmptyQueueException() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    public int size();
    public boolean isEmpty();
    public T getHead() throws EmptyQueueException;
    public void enqueue(T element);
    public T dequeue() throws EmptyQueueException;
}
