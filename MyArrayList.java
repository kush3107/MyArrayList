import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Kushagra on 24-06-2015.
 */
public class MyArrayList<E> implements List<E> {
    MyArrayList test[] = new MyArrayList[1000];

    @Override
    public int size() {
        int counter = 0;
        for (MyArrayList ob : test) {
            counter++;
        }
        return counter;
    }

    @Override
    public boolean isEmpty() {
        if (this.size() != 0)
            return true;
        else return false;
    }

    @Override
    public boolean contains(Object o) {
        boolean check=true;
        for (MyArrayList ob : test){
            if (this == ob)
                check = true;
            else
                check = false;
        }
        return check;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, E element) {
       MyArrayList test[index] = element;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int a=0,b=-1;
        for(MyArrayList ob : test){
            a++;
            if (test == o){
                b=a;
                break;
            }
        }
        return b;
    }

    @Override
    public int lastIndexOf(Object o) {
        int a=0,b=-1;
        for(MyArrayList ob : test){
            a++;
            if (test == o){
                b=a;

            }
        }
        return b;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
