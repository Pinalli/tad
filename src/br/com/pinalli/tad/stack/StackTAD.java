/*https://algs4.cs.princeton.edu/lectures/13StacksAndQueues.pdf
 */
package br.com.pinalli.tad.stack;



/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public interface StackTAD<T> {

    public class EmptyStackException extends RuntimeException {

        public EmptyStackException(String s) {
            	 super(s);
        }

        EmptyStackException() {
            
        }
    }

    public int size();

    public boolean isEmpty();

    public T top() throws EmptyStackException;

    public void push(T element);

    public T pop() throws EmptyStackException;

}
