package br.com.pinalli.tad;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author AlbertoRochaPinalli
 * @param <E>
 */
public class ListArray<E> implements ListTAD<E> {

    private E[] vet;
    private E[] newVet;
    private static final int INITIAL_SIZE = 10;
    private int qntElementos = 0;

    public ListArray(int tamanho) {
        vet = (E[]) new Object[INITIAL_SIZE];
    }

    @Override //ok
    public void add(E element) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == null) {
                vet[i] = element;
                qntElementos++;
                break;
            }
        }
    }

    @Override //ok
    public void add(int index, E element) {
        rangeCheckForAdd(index);

        ensureCapacityInternal(qntElementos + 1);  // Increments modCount!!
        System.arraycopy(vet, index, vet, index + 1,
                qntElementos - index);
        vet[index] = element;
        qntElementos++;

    }

    @Override //ok
    public E remove(int pos) {
        vet[pos] = null;
        return vet[pos];

    }

    @Override
    public E remove(E element) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == element) {
                vet[i] = null;
            }
        }
        return null;
    }

    @Override
    public E removeFirst() {

        return remove(0);
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public String toString() {
        return "vet =" + Arrays.toString(vet) + '}' + "\n"
                + "{ qntElementos = " + qntElementos + '}';
    }

    @Override
    public E get(int pos) {
        return vet[pos];
    }

    @Override
    public void set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E search(E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        for (E vet1 : vet) {
            if (vet1 == null) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return qntElementos;
    }

    @Override
    public int count(E element) {
        return 0;

    }

    @Override
    public void clean() {
        vet = (E[]) new Object[INITIAL_SIZE];
        qntElementos = 0;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addFirst(E element) {

    }

    /**
     * Adiciona um elemento ao final da lista
     * @param element elemento a ser adicionado ao final da lista
     */
    @Override
    public void addLast(E element) { //ok
        if (qntElementos == vet.length) {
            setCapacity(vet.length * 2);
        }
        vet[qntElementos] = element;
        qntElementos++;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    private void setCapacity(Integer newCapacity) { 
        if (newCapacity != vet.length) {
            int min;
            Integer[] newData = new Integer[newCapacity];
            if (vet.length < newCapacity) {
                min = vet.length;
            } else {
                min = newCapacity;
            }
            for (int i = 0; i < min; i++) {
                newData[i] = (Integer) vet[i];
            }
            vet = (E[]) newData;
        }
    }

    private void rangeCheckForAdd(int index) {
        if (index > qntElementos || index < 0) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

    private void ensureCapacityInternal(int i) {
    }

    private String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Size: " + qntElementos;
    }
}
