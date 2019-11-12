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
        private Node prev;

        public Node(T e, Node n) {
            this.element = e;
            this.next = n;

        }

        private Node(T element) {
            this.element = element;
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

    /*  @Override           //OK
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
    }*/
    @Override
    public void add(T e) {//OK
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

        Node newNode = new Node(e);

        newNode.next = first;
        first = newNode;
        count++;

        if (last == null) {
            last = first;
        }

    }

    @Override
    public void addLast(T e) {//OK

        if (last == null) {
            first = last = new Node(e);
        } else {
            last.next = new Node(e);
            last = last.next;
        }

        count++;
        /*
          
        */
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
    public void add(int index, T e) { //OK
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            first = new Node(e, first);
        } else {
            Node node = getNode(index - 1);
            node.next = new Node(e, node.next);
        }
        count++;

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
        this.first = null;
        count = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return null;

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

        return (T) atual.getElement();

    }

    @Override
    public T removeFirst() {
        
    Node  temp = first;
    first = first.next;
    count--;
    if (first == null) last = null;
    T element = temp.element;
    
    return element;
        
        
        
        
     /*   if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T temp = getFirst();
        if (first == null) {
            return null;
        }
        first = first.next;
        count--;
        return temp;
*/
    }

    @Override
    public T removeLast() {//OK
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

       T removedElement;

        if (first.next == null) {

            removedElement = first.element;

            first = null;

        } else {

            Node temp = first;

            while (temp.next.next != null) {
                temp = temp.next;
            }

            removedElement = temp.next.element;

            temp.next = null;

        }

        count--;

        return removedElement;

    }

    @Override
    public T getFirst() {  //OK
        if (first == null) {
            return null;
        }
        return first.element;
    }

    @Override
    public T getLast() { //OK

        Node l = last;
        if (l == null) {
            if (first == null) {
                return null;
            } else {
                return first.element;
            }
        }
        return l.element;

    }

    @Override
    public String toString() {
        Node current = first;
        String result = "";

        while (current != null) {
            result = result + (current.getElement()).toString() + " ";
            current = current.getNext();
        }

        return result;

    }
}
