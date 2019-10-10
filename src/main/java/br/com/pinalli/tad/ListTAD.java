package br.com.pinalli.tad;
/*http://hg.openjdk.java.net/jdk8/jdk8/jdk/file/tip/src/share/classes/java/util/ArrayList.java
https://courses.cs.washington.edu/courses/cse143/17su/lectures/08-11/collections/LinkedList.java
/**
**
 * @author AlbertoRochaPinalli
 */
import java.util.*;
public interface ListTAD<E> {
    /**
     * ********
     * Adiciona um elemento na última posição da lista.
     *
     * @param element Elemento a ser adicionado.
     */
    public void add(E element);

    /**
     * ********
     * Adiciona o elemento fornecido em uma determinada posição da lista.
     *
     * @param index Posição da lista.
     * @param element Elemento a ser adicionado.
     */
    public void add(int index, E element);

    /**
     * ********
     * Remove o elemento armazenado na posição fornecida da lista.
     *
     * @param pos Posição da lista.
     * @return 
     */
    public E remove(int pos);

    /**
     * ********
     * Remove a primeira ocorrência de um dado elemento da lista.
     *
     * @param element Elemento a ser adicionado.
     * @return 
     */
    public E remove(E element);

    /**
     * ********
     * Recupera o elemento armazenado em uma dada posição da lista.
     *
     * @param pos Posição do elemento na lista.
     * @return Elemento armazenado na lista.
     */
    public E get(int pos);

    /**
     * ********
     * Atualiza a posição fornecida da lista, com o elemento fornecido.
     *
     * @param index Posição da lista.
     * @param element Elemento a ser armazenado na lista.
     */
    public void set(int index, E element);

    /**
     * ********
     * Procura um elemento na lista, e retorna sua ocorrência.
     *
     * @param element Elemento a ser procurado.
     * @return referência para o elemento armazenado na lista.
     */
    public E search(E element);

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
     *
     * @param element
     * @return A quantidade de ocorrências do elemento fornecido.
     */
    public int count(E element);

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
    public Iterator<E> iterator();

    /**
     * ********
     * Métodos adicionais, para fins didáticos. 
********
     */
    /**
     * ******
     * Adiciona um elemento na primeira posição da lista.
     *
     * @param element Elemento a ser adicionado.
     */
    public void addFirst(E element);

    /**
     * ********
     * Adiciona um elemento na última posição da lista.
     *
     * @param element Elemento a ser adicionado.
     */
    public void addLast(E element);

    /**
     * ******
     * Remove o elemento armazenado na primeira posição da lista.
     *
     * @return Elemento removido da lista.
     */
    public E removeFirst();

    /**
     * ******
     * Remove o elemento armazenado na última posição da lista.
     *
     * @return Elemento removido da lista.
     */
    public E removeLast();

    /**
     * ******
     * Recupera o elemento armazenado na primeira posição da lista.
     *
     * @return Elemento armazenado na lista.
     */
    public E getFirst();

    /**
     * ******
     * Recupera o elemento armazenado na última posição da lista.
     *
     * @return Elemento armazenado na lista.
     */
    public E getLast();

}
