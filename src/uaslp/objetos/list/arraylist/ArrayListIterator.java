package uaslp.objetos.list.arraylist;
import uaslp.objetos.list.Iterator;//Interface de iteradores "contrato"

public class ArrayListIterator implements Iterator {
    //Atributos
    private ArrayList arrayList;
    private int currentItem;

    //Constructor
    public ArrayListIterator(ArrayList arrayList){
        this.arrayList = arrayList;
    }

    //Métodos
    public boolean hasNext(){
        return currentItem < arrayList.getSize();
    }

    public String next(){
        String data = arrayList.getAt(currentItem);
        currentItem++;
        return data;
    }
}
