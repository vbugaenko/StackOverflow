package ru.vbugaenko.stackoverflow.q985988;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Link<T> implements List {
    List<T> l = new LinkedList<>();

    public void addByIndex(int n, T elem){
        l.add(n, elem);
    }

    @Override public boolean      add(Object o)           { return l.add((T) o);          }
    @Override public int          size()                  { return l.size();              }
    @Override public boolean      isEmpty()               { return l.isEmpty();           }
    @Override public Iterator     iterator()              { return l.iterator();          }
    @Override public ListIterator listIterator()          { return l.listIterator();      }
    @Override public ListIterator listIterator(int index) { return l.listIterator(index); }
    @Override public T            get(int index)          { return l.get(index); }

    @Override public boolean      contains(Object o) { return false; }
    @Override public void         forEach(Consumer action) { }
    @Override public Object[]     toArray() { return new Object[0]; }
    @Override public boolean      remove(Object o) { return false; }
    @Override public boolean      addAll(Collection c) { return false; }
    @Override public boolean      removeIf(Predicate filter) { return false; }
    @Override public boolean      addAll(int index, Collection c) { return false; }
    @Override public void         replaceAll(UnaryOperator operator) { }
    @Override public void         sort(Comparator c) { }
    @Override public void         clear() { }
    @Override public Object       set(int index, Object element) { return null; }
    @Override public void         add(int index, Object element) { }
    @Override public Object       remove(int index) { return null; }
    @Override public int          indexOf(Object o) { return 0; }
    @Override public int          lastIndexOf(Object o) { return 0; }
    @Override public List         subList(int fromIndex, int toIndex) { return null; }
    @Override public Spliterator  spliterator() { return null; }
    @Override public Stream       stream() { return null; }
    @Override public Stream       parallelStream() { return null; }
    @Override public boolean      retainAll(Collection c) { return false; }
    @Override public boolean      removeAll(Collection c) { return false; }
    @Override public boolean      containsAll(Collection c) { return false; }

    @Override public Object[]     toArray(Object[] a) { return l.toArray(); }

    @Override
    public int hashCode() {
        return Objects.hash(l.toArray());
    }

    @Override
    public boolean equals(Object o) {
        return l.equals(o);
    }

}
