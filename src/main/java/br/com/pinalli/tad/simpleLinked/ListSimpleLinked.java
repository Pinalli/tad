package br.com.pinalli.tad.simpleLinked;

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

    @Override
    public void add(T element) { //Adiciona elementos
        Node aux = new Node(element);
        aux.setElement(element);

        if (first == null) {//verifi se a lista está vazia
            //já que existe apenas um elemento, cabeça 
            //pontos de cauda para o mesmo objeto.
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

    @Override
    public void addFirst(T element) {//OK
        Node n = new Node(element, null);
        if (isEmpty()) {
            last = n;
        } else {
            n.next = first;
        }
        first = n;
        count++;
    }

    @Override
    public void addLast(T element) {//OK
        Node n = new Node(element, null);
        if (isEmpty()) {
            first = n;
        } else {
            last.next = n;
        }
        last = n;
        count++;
    }

    @Override
    public void add(int index, T element) { //OK
        if (index == 0) {
            addFirst(element);
        } else if (index >= count) {
            addLast(element);
        } else {
            Node current = last;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(element);
            (current.next).next = temp;
            count++;
        }
    }

    private Node getNode(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    @Override
    public T remove(T element) { //OK

        boolean found = false;

        Node anteriror = null;
        Node atual = first;

        while (atual != null && !found) {
            if (element.equals(atual.getElement())) {
                found = true;
            } else {
                anteriror = atual;
                atual = atual.getNext();
            }
        }

        if (size() == 1) {
            first = last = null;
        } else if (atual.equals(first)) {
            first = atual.getNext();
        } else if (atual.equals(last)) {
            last = anteriror;
            last.setNext(null);
        } else {
            anteriror.setNext(atual.getNext());
        }

        count--;

        return atual.getElement();

    }

    @Override
    public T remove(int pos) {

        return null;
    }

    @Override
    public T get(int pos) {//retorna o elemento armazenado na posiçao pos da lista
        Node aux = first;
        int i = 0;
        while (aux != null) {
            if (aux.getElement().equals(pos)) {
                aux = aux.getNext();
            }
            i++;
        }
        return (T) aux;

    }

    @Override
    public void set(int index, T element) {   //OK
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException();
        }
        Node aux = first;
        for (int i = 0; i < index; i++) {
            aux = aux.next;
        }
        T tmp = (T) aux.element;
        aux.element = element;

    }

    @Override
    public T search(T element) {
        return element;
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
            res = res + aux.getElement().toString() + " ";
            aux = aux.getNext();
        }

        return res;
    }
}
