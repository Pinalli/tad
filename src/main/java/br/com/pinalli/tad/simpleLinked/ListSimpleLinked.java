package br.com.pinalli.tad.simpleLinked;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*https://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
  http://www.javafree.org/topic-865354-Matriz-esparsas-Vs-Matriz.html
 https://codereview.stackexchange.com/questions/82698/singly-linked-list-in-java

 */
/**
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class ListSimpleLinked<T> implements ListTAD<T> {

    private Nodo first, last;// Referência para o primeiro e último elemento da lista encadeada.
    private int count;

    public ListSimpleLinked() {
        first = null;
        last = null;
        count = 0;
    }

    private class Nodo { //class interna

        private T element;
        private Nodo next;

        public Nodo(T e) {
            element = e;
            next = null;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T e) {
            element = e;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo n) {
            next = n;
        }

    }

    @Override
    public void add(T element) {
        Nodo novo = new Nodo(element);
        if (last != null) {
            last.setNext(novo);
        } else {
            first = novo;
        }
        last = novo;
        count++;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(T element) {
        return null;
    }

    @Override
    public T remove(int pos) {
        return null;
    }

    @Override
    public T get(int pos) {
        return null;
    }

    @Override
    public void set(int index, T element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Nodo aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }
        T tmp = (T) aux.element;
        aux.element = element;

    }

    @Override
    public T search(T element) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public int count(T element) {
        return count;
    }

    @Override
    public void clean() {
        first = null;
        last = null;
        count = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;

    }

    @Override
    public void addFirst(T element) {

    }

    @Override
    public void addLast(T element) {

    }

    @Override
    public T removeFirst() {
        return null;
    }

    @Override
    public T removeLast() {
        return null;
    }

    @Override
    public T getFirst() {
        Nodo f = first;
        if (count == 0) {
            throw new NoSuchElementException();
        }
        return f.next.element;
    }

    @Override
    public T getLast() {
        Nodo l = last;

        if (l == null)

            throw new NoSuchElementException();

        return l.element;

    }

    
}
