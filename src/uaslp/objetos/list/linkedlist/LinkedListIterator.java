package uaslp.objetos.list.linkedlist;
import uaslp.objetos.list.Iterator;//Interface de iteradores "contrato"


public class LinkedListIterator implements Iterator {
    //Atributos
    private Node currentNode;

    //Constuctor
    LinkedListIterator(Node startNode){
        currentNode = startNode;//Sin this porque se llaman diferente, java no se confunde
    }

    //Métodos
    public boolean hasNext(){
        return currentNode != null;//Expresión booleana
    }

    public String next(){
        String data = currentNode.data;//Saco primero la información
        currentNode = currentNode.next;//Aquí estamos avanzandolo
        return data;//Regresa lo que tiene ahí, en este caso el nombre del alumno que va recorriendo
    }
}
