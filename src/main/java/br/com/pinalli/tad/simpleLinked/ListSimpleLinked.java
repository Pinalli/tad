package br.com.pinalli.tad.simpleLinked;

import java.util.Collections;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public class ListSimpleLinked<T> implements ListTAD<T> {

    private Node first, last;// Referência para o primeiro e último elemento da lista encadeada.
    private int count;

    public ListSimpleLinked() {
        first = last = null;
        count = 0;
    }

    private class Node { //class interna

        private T element;
        private Node next;

        public Node(T e, Node n) {
            element = e;
            next = null;
        }

        private Node(T element) {

        }

        public T getElement() {
            return element;
        }

        public void setElement(T e) {
            element = e;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node n) {
            next = n;
        }

    }

    @Override           //OK
    public void add(T e) { //Adiciona elementos no final da lista
        Node aux = new Node(e);
        aux.setElement(e);

        if (first == null) {//verifica se a lista está vazia
            first = aux;
            last = aux;
        } else {
            //definir o próximo link da cauda atual para o novo nó
            last.setNext(aux);
            //definir cauda como nó recém-criado
            last = aux;
        }
        count++;
    }

    public void add2(T e) {
        Node novo = new Node(e);
        if (last != null) {
            last.setNext(novo);
        } else {
            first = novo;
        }
        last = novo;
        count++;
    }

    @Override
    public void addFirst(T e) {//OK
        Node n = new Node(e, null);
        if (isEmpty()) {
            last = n;
        } else {
            n.next = first;
        }
        first = n;
        count++;
    }

    @Override
    public void addLast(T e) {//OK
        Node n = new Node(e, null);
        if (isEmpty()) {
            first = n;
        } else {
            last.next = n;
        }
        last = n;
        count++;
    }

    @Override
    public void add(int index, T e) { //OK
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }

        aux.element = e;

    }

    @Override
    public T remove(int pos) {//OK
        if (pos < 0 || pos >= count) {
            throw new IndexOutOfBoundsException();
        }

        Node aux = first;
        if (pos == 0) {
            if (last == first) // se tiver apenas um elemento
            {
                last = null;
            }
            first = first.next;
            count--;
            return aux.element;
        }
        int c = 0;
        while (c < pos - 1) {
            aux = aux.next;
            c++;
        }
        T element = aux.next.element;
        if (last == aux.next) {
            last = aux;
        }
        aux.next = aux.next.next;
        count--;
        return element;

    }

    @Override
    public T remove(T e) { //OK

        boolean found = false;

        Node anterior = null;
        Node atual = first;

        while (atual != null && !found) {
            if (e.equals(atual.getElement())) {
                found = true;
            } else {
                anterior = atual;
                atual = atual.getNext();
            }
        }

        if (size() == 1) {
            first = last = null;
        } else if (atual.equals(first)) {
            first = atual.getNext();
        } else if (atual.equals(last)) {
            last = anterior;
            last.setNext(null);
        } else {
            anterior.setNext(atual.getNext());
        }

        count--;

        return atual.getElement();

    }

    @Override
    public T get(int pos) {//OK
        if ((pos < 0) || (pos >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node aux = first;
        int c = 0;
        while (c < pos) {
            aux = aux.next;
            c++;
        }
        return (aux.element);

    }

    @Override
    public void set(int index, T e) {   //OK
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }
        T tmp = (T) aux.element;
        aux.element = e;

    }

    public boolean contains(T e) { //OK
        Node aux;
        aux = first;
        while (aux != null) {
            if (aux.getElement().equals(e)) {
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    @Override
    public T search(T e) {
        return e;
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
    public int count(T e) {//OK
        int soma = 0;
        Node aux;
        aux = first;
        while (aux != null) {
            if (aux.getElement().equals(e)) {
                soma++;
            }
            aux = aux.getNext();
        }
        return soma;
    }

    @Override
    public void clean() { //OK
        first = null;
        last = null;
        count = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;

    }

    @Override
    public T removeFirst() { //OK
        T tmp = getFirst();
        first = first.next;
        return tmp;
    }

    @Override
    public T removeLast() {//OK
        Node previous = null;
        Node atual = first;

        while (atual.getNext() != null) {
            previous = atual;
            atual = atual.getNext();
        }

        Node result = last;
        last = previous;
        if (last == null) {
            first = null;
        } else {
            last.setNext(null);
        }
        count--;

        return last.getElement();

    }

    @Override
    public T getFirst() {  //OK
        Node f = first;
        if (count == 0) {
            throw new NoSuchElementException();
        }
        return f.element;
    }

    @Override
    public T getLast() { //OK
        Node l = last;

        if (l == null) {
            throw new NoSuchElementException();
        }

        return l.element;

    }

    @Override
    public String toString() {
        Node aux = first;
        String res = "";

        while (aux != null) {
            res = res + aux.getElement().toString() + " - ";
            aux = aux.getNext();
        }

        return res;
    }
}
