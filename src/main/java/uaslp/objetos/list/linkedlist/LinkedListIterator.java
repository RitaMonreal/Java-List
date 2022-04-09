package uaslp.objetos.list.linkedlist;
import uaslp.objetos.list.Iterator;//Interface de iteradores "contrato"


public class LinkedListIterator<T> implements Iterator<T> {
    //Atributos
    private Node<T> currentNode;

    //Constuctor
    LinkedListIterator(Node<T> startNode){
        currentNode = startNode;//Sin this porque se llaman diferente, java no se confunde
    }

    //Métodos
    public boolean hasNext(){
        return currentNode != null;//Expresión booleana
    }

    public T next(){
        T data = currentNode.data;//Saco primero la información
        currentNode = currentNode.next;//Aquí estamos avanzandolo
        return data;//Regresa lo que tiene ahí, en este caso el nombre del alumno que va recorriendo
    }
}
