package uaslp.objetos.list.linkedlist;

public class LinkedListIterator{

    private Node currentNode;

    LinkedListIterator(Node startNode){
        currentNode = startNode;//Sin this porque se llaman diferente, java no se confunde
    }
    public boolean hasNext(){
        return currentNode != null;//Expresión booleana
    }

    public String next(){
        String data = currentNode.data;//Saco primero la información

        currentNode = currentNode.next;//Aquí estamos avanzandolo

        return data;//Regresa lo que tiene ahí, en este caso el nombre del alumno que va recorriendo
    }
}
