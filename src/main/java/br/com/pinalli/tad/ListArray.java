package br.com.pinalli.tad;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author AlbertoRochaPinalli
 * @param <E>
 */
public class ListArray<E> implements ListTAD<E> {

    private E[] vet;
    private transient E last;
    private static final Integer INITIAL_SIZE = 15;
    private int qntElementos = 0;

    public ListArray(Integer tamanho) {
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
        if (index < 0 || index > qntElementos) {
            throw new IndexOutOfBoundsException();
        }
        add(element);
        for (int i = qntElementos - 1; i > index; i--) {
            vet[i] = vet[i - 1];
        }
        // put the new one in the right place
        vet[index] = element;
    }

    @Override
    public void addLast(E element) { //ok
      for (int i = 0; i < vet.length-1; i++) {
            vet[i] = vet[i + 1];
            vet[i + 1] = element;
        }

    }

    @Override
    public E getFirst() {
        return vet[0];
    }

    @Override //ok
    public E remove(int pos) {
        vet[pos] = null;
        return vet[pos];

    }

    @Override
    public E remove(E element) {//ok
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
        for (int i = 0; i < vet.length-1; i++) {
            vet[i] = vet[i + 1];
            vet[i + 1] = null;
               
        }
        return null;
       
    }

    @Override
    public String toString() {
        return "Vetor = " + Arrays.toString(vet) + '}' 
                + "\n Quantidade de elementos = " + qntElementos + '}';
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= qntElementos) {
            throw new IndexOutOfBoundsException("Não existe essa posição");

        }
        return vet[index];
    }

    @Override
    public void set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E search(E element) {
        for (E vet1 : vet) {
            if (vet1 == element) {
                return element;
            }
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return qntElementos == 0;
    }

    @Override
    public int size() {
        return qntElementos;
    }

    @Override
    public int count(E element) {
        int cont = 0;
        for (E vet1 : vet) {
            if (vet1 == element) {
                cont++;
            }
        }
        return cont;

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
        for (E vet1 : vet) {
            vet[0] = element;
        }
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

}
