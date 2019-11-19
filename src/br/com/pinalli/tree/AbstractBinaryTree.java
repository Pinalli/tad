/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pinalli.tree;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AlbertoRochaPinalli
 */
public class AbstractBinaryTree <E> extends AbstractTree<E> implements BinaryTree<E> {
     @Override
    public Position<E> sibling(Position<E> p) throws IllegalArgumentException {
        Position<E> parent = parent(p);

        if (parent == null) return null;

        if (p == left(parent))
            return right(parent);
        else
            return left(parent);
    }

    @Override
    public int numChildren(Position<E> p) throws IllegalArgumentException {
        int count = 0;

        if (left(p) != null)
            count++;

        if (right(p) != null)
            count++;

        return count;
    }

    @Override
    public Iterable<Position<E>> children(Position<E> p) throws IllegalArgumentException {
        List<Position<E>> snapshot = new ArrayList<>(2);

        if (left(p) != null)
            snapshot.add(left(p));

        if (right(p) != null)
            snapshot.add(right(p));

        return snapshot;
    }

    @Override
    public Position<E> left(Position<E> p) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position<E> right(Position<E> p) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
