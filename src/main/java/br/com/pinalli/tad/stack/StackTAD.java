/*https://algs4.cs.princeton.edu/lectures/13StacksAndQueues.pdf
 */
package br.com.pinalli.tad.stack;
import java.util.EmptyStackException;

/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public interface StackTAD<T> {

    public int size();

    public boolean isEmpty();

    public T top() throws EmptyStackException;

    public void push(T element);

    public T pop() throws EmptyStackException;

}
