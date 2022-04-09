package uaslp.objetos.list.arraylist;
import uaslp.objetos.list.Iterator;//Interface de iteradores "contrato"

public class ArrayListIterator <T> implements Iterator<T> {
    //Atributos
    private final ArrayList<T> arrayList;
    private int currentItem;

    //Constructor
    public ArrayListIterator(ArrayList<T> arrayList){
        this.arrayList = arrayList;
    }

    //Métodos
    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }

    public T next(){
        T data = arrayList.getAt(currentItem);
        currentItem++;
        return data;
    }
}
