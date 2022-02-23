package uaslp.objetos.list.arraylist;

import uaslp.objetos.list.linkedlist.LinkedListIterator;

public class ArrayList {
//Declaración de constantes en java
    private static final int DEFAULT_SIZE = 50;
    private String[] array;
    private int size;
/*Sobrecarga de métodos, se llaman igual pero llevan diferentes parámetros*/
    public ArrayList(){//Constructor sin parámetros
        array = new String[DEFAULT_SIZE];
    }
    public ArrayList(int size){//Constructor con parametros
        array = new String[size];
    }

    public void addAtTail(String data){

        if(size == array.length){//Si si
            increaseArraySize();
        }
        array[size] = data;//A ESTA LE MOVISTE TENIAS  array = new String[size];
        size++;
    }

    public void addAtFront(String data){//Recorre todos los elementos ya insertados hacia atrás

        if(size == array.length){//Está lleno el arreglo, error de lo que asignamos
            increaseArraySize();
        }
        if (size >= 0) {
            System.arraycopy(array, 0, array, 1, size);
        }
        array[0] = data;
        size++;
    }

    public void remove(int index){

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

    public void removeAll(){
        for(int i =  0; i < size; i++){//Vaciamos toda la lista
            array[i] = null;
        }
        size = 0;//El tamaño lo pones en 0 ya que liberamos el espacio
    }

    public void setAt(int index, String data){//Le inserto un valor e información
        if(index >= 0 && index < size){
            array[index] = data;
        }
    }

    public String getAt(int index){//Busca el nodo que yo le diga
        return index >= 0 && index < size ? array[index] : null;
    }

    public ArrayListIterator getIterator(){
        return new ArrayListIterator(this);//le pase el arreglo, sobre QUIÉN se va a estra moviendo
    }

    public int getSize(){
        return size;
    }

    private void increaseArraySize(){
        String []newArray = new String[array.length * 2];

        for(int i = 0; i < size; i++){//Recorremos los arreglos
            newArray[i] = array[i];//Copiamos al arreglo del tamaño doble la información del arreglo original
        }
        array =newArray;//Referenciamos para soltar el espacio
    }

}
//Para acceder más rápido a un dato es mejor la array list