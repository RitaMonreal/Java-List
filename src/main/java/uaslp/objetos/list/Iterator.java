package uaslp.objetos.list;

import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;

public interface Iterator<T> {
    boolean hasNext();
    T next() throws NotSuchElementException, NotValidIndexException;
}
