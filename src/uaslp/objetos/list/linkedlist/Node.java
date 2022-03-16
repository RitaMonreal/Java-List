package uaslp.objetos.list.linkedlist;

//Tiene el modificador de acceso 3 "package private" paquetes = directorios, solo es visible en el paquete donde están
//Solo se puede ver en linkedList
class Node<T>{//Las clases son publicas o package private, aquí vamos a acceder desde la linked list, por eso no lleva los getters y setters
    T data;//Ya estan inicializados con NULL, si los pongo es redundante
    Node<T> next;
    Node<T> previous;

    //Constructor
    Node(T data){
        this.data = data;
    }
}