package uaslp.objetos.list.arraylist;
import uaslp.objetos.list.List;
import uaslp.objetos.list.Iterator;

public class ArrayList <T> implements List<T>{//Le decimos que implemmenta a mi contrato de interfaz lista
//Declaración de constantes en java
    private static final int DEFAULT_SIZE = 2;
    private T[] array;
    private int size;

    public static String getName(){
        return "ArrayList";
    }
/*Sobrecarga de métodos, se llaman igual pero llevan diferentes parámetros*/
    public ArrayList(){//Constructor sin parámetros
        array = (T[])new Object[DEFAULT_SIZE];
    }
    public ArrayList(int size){//Constructor con parametros
        array = (T[])new Object[size];
    }

    @Override //Como buena practica de programación/diseño
    public void addAtTail(T data){

        if(size == array.length){//Si si
            increaseArraySize();
        }
        array[size] = data;//A ESTA LE MOVISTE TENIAS  array = new String[size];
        size++;
    }

    @Override //Como buena practica de programación/diseño
    public void addAtFront(T data){//Recorre todos los elementos ya insertados hacia atrás

        if(size == array.length){//Está lleno el arreglo, error de lo que asignamos
            increaseArraySize();
        }
        if (size >= 0) {
            System.arraycopy(array, 0, array, 1, size);
        }
        array[0] = data;
        size++;
    }

    @Override //Como buena practica de programación/diseño
    public void remove(int index) {//throws IndexOutOfBoundsException

        if(index < 0 || index >= size){
            return;
        }
        //Aquí están recorriendo los valorres desde el que deseamos elimnar
        if (size - 1 - index >= 0){
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
        }
        array[size -1] = null;//El último en la lista lo ponemos en null, para que el garbage colector se lo lleve y libere el espacio
        size--;
    }

    @Override //Como buena practica de programación/diseño
    public void removeAll(){
        for(int i =  0; i < size; i++){//Vaciamos toda la lista
            array[i] = null;
        }
        size = 0;//El tamaño lo pones en 0 ya que liberamos el espacio
    }

    @Override //Como buena practica de programación/diseño
    public void setAt(int index, T data){//Le inserto un valor e información
        if(index >= 0 && index < size){
            array[index] = data;
        }
    }

    @Override //Como buena practica de programación/diseño
    public T getAt(int index){//Busca el nodo que yo le diga
        return index >= 0 && index < size ? array[index] : null;
    }

    @Override //Como buena practica de programación/diseño
    public Iterator <T> getIterator(){
        return new ArrayListIterator<>(this);//le pase el arreglo, sobre QUIÉN se va a estra moviendo
    }

    @Override //Como buena practica de programación/diseño
    public int getSize(){
        return size;
    }

    private void increaseArraySize(){
        T []newArray = (T[])new Object[array.length * 2];

        for(int i = 0; i < size; i++){//Recorremos los arreglos
            newArray[i] = array[i];//Copiamos al arreglo del tamaño doble la información del arreglo original
        }
        array =newArray;//Referenciamos para soltar el espacio
    }

}
//Para acceder más rápido a un dato es mejor la array list