/*https://www.java2novice.com/data-structures-in-java/linked-list/singly-linked-list/
  http://www.javafree.org/topic-865354-Matriz-esparsas-Vs-Matriz.html
 https://codereview.stackexchange.com/questions/82698/singly-linked-list-in-java
http://hg.openjdk.java.net/jdk7/jdk7/jdk/file/9b8c96f96a0f/src/share/classes/java/util/LinkedList.java
http://faculty.washington.edu/moishe/javademos/ch08 Code/jss2/LinkedList.java
http://www.cs.ucc.ie/~dgb/courses/ood/ood3/SinglyLinkedList.java*/


package br.com.pinalli.tad.simpleLinked;

import java.util.Iterator;
/**
 *
 * @author AlbertoRochaPinalli
 * @param <T>
 */
public interface ListTAD<T> {

    /**
     * ********
     * Adiciona um elemento na última posição da lista.
     *
     * @param element Elemento a ser adicionado.
     */
    public void add(T element); 

    /**
     * ********
     * Adiciona o elemento fornecido em uma determinada posição da lista.
     *
     * @param index Posição da lista.
     * @param element Elemento a ser adicionado.
     */
    public void add(int index, T element);

    /**
     * ********
     * Remove o elemento armazenado na posição fornecida da lista.
     *
     * @param pos Posição da lista.
     * @return
     */
    public T remove(int pos);

    /**
     * ********
     * Remove a primeira ocorrência de um dado elemento da lista.
     *
     * @param element Elemento a ser adicionado.
     * @return
     */
    public T remove(T element);

    /**
     * ********
     * Recupera o elemento armazenado em uma dada posição da lista.
     *
     * @param pos Posição do elemento na lista.
     * @return Elemento armazenado na lista.
     */
    public T get(int pos);

    /**
     * ********
     * Atualiza a posição fornecida da lista, com o elemento fornecido.
     *
     * @param index Posição da lista.
     * @param element Elemento a ser armazenado na lista.
     */
    public void set(int index, T element);

    /**
     * ********
     * Procura um elemento na lista, e retorna sua ocorrência.
     *
     * @param element Elemento a ser procurado.
     * @return referência para o elemento armazenado na lista.
     */
    public T search(T element);

    /**
     * ********
     * Verifica se a lista está vazia.
     *
     * @return true se a lista está vazia, false caso contrário.
     */
    public boolean isEmpty();

    /**
     * ********
     * Recupera a quantidade de elementos armazenados na lista.
     *
     * @return Quantidade de elementos.
     */
    public int size();

    /**
     * ******
     * Conta quantas ocorrências de um dado elemento estão armazenadas na lista.
     * @param element
     * @return A quantidade de ocorrências do elemento fornecido.
     */
    public int count(T element);

    /**
     * ********
     * Remove todos os elementos da lista.
     */
    public void clean();

    /**
     * ********
     * Retorna um iterador para a lista.
     *
     * @return O iterador para a lista.
     */
    public Iterator<T> iterator();

    /**
     * ********
     * Métodos adicionais, para fins didáticos. *******
     */
    /**
     * ******
     * Adiciona um elemento na primeira posição da lista.
     *
     * @param element Elemento a ser adicionado.
     */
    public void addFirst(T element);

    /**
     * ********
     * Adiciona um elemento na última posição da lista.
     *
     * @param element Elemento a ser adicionado.
     */
    public void addLast(T element);

    /**
     * Remove o elemento armazenado na primeira posição da lista.
     *
     * @return Elemento removido da lista.
     */
    public T removeFirst();

    /**
     * Remove o elemento armazenado na última posição da lista.
     *
     * @return Elemento removido da lista.
     */
    public T removeLast();

    /**
     * Recupera o elemento armazenado na primeira posição da lista.
     *
     * @return Elemento armazenado na lista.
     */
    public T getFirst();

    /**
     * ******
     * Recupera o elemento armazenado na última posição da lista.
     *
     * @return Elemento armazenado na lista.
     */
    public T getLast();

}
