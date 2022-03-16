package uaslp.objetos.list.linkedlist;
import uaslp.objetos.list.List;

//Refactorizar es un conjunto de técnicas que ayudan a  mejorar nuestro código, en la página de source.making hay patrones de diseño
public class LinkedList <T> implements List <T>{ //Le decimos que implemmenta a mi contrato de interfaz lista
    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void addAtTail(T data){
        Node<T> node = new Node<>(data);

        if(size==0){
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.previous = tail;
        }
        tail = node;
        size ++;
    }

    public void addAtFront(T data){
        Node<T> node = new Node<>(data);

        if(size == 0){//La lista está vacía
            tail = node;
        }else{
            head.previous = node;//El anterior del que era el primero apunta al nuevo;
        }
        node.next = head;//El nuevo apunta a donde apuntaba la cabeza
        head = node;

        size++;
    }

    public void remove(int index){
        Node <T> node = findNode(index);

        if(node == null){//No habia nada, por lo que no se puede eliminar nada
            return;
        }
        if(size == 1){
            head = null;
            tail = null;
        }else if(node == head){
            head = node.next;//La cabeza va a apuntar al que sigue del que vamos a eliminar
            if(head != null){//Si el que esta después de eliminar tiene algo colgado antes o sea el que vamos a eliminar que está en el principio
                head.previous = null;//Lo soltamos completamente
            }
        }else if(node == tail){//Si el nodo está al final
            tail = node.previous;//La cola suelta el último y apunta al que está de penúltimo
            if(tail != null){
                tail.next = null;//Aquí le reafirma el valor de null al que ya está al final de la cola
            }
        }else{//Si el nodo está al medio
            node.previous.next = node.next;//El que está en el anterior del que voy a borrar en su apuntador de después lo enlazo con el que el que voy a eliminar lo tiene como siguiente
            node.next.previous = node.previous;//El que esta después de eliminar su apuntador de anterior lo pongo en el que está antes de elimar
        }
        size --;
    }

    public void removeAll(){
        head = null;
        tail = null;
        size = 0;
    }

    public void setAt(int index, T data){//Le inserto un valor e información
        Node<T> node = findNode(index);

        if(node != null){
            node.data = data;
        }
    }

    public T getAt(int index){//Busca el nodo que yo le diga
        Node<T> node = findNode(index);

        return node == null ? null : node.data;//Si es cierto lo de antes del signo me manda lo que está después del signo, sino lo que está después de ñps dos puntos
    }

    public LinkedListIterator<T> getIterator(){
        return new LinkedListIterator<>(head);
    }

    private Node<T> findNode(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node<T> node = head;//Auxiliar que me ponga al principio de la lista
        int currentIndex = 0;//Posición actual = al principio

        while(currentIndex != index){
            currentIndex++;//Aumento la posición de dónde estoy
            node = node.next;//El auxiliar lo avanzo al siguiente nodo
        }
        return node;
    }

    public int getSize(){
        return size;
    }
}

