package uaslp.objetos.list;
//A la intefaz solo le interesa como vas a utilizar los métodos, para tener código que dependa de los nombre sin tener la implentación completa
//Código basado en interfaces se dice que permite crear código de bajo acoplamiento, lo que dice es que una clase puede ser modificada sin afectar a las demás
public interface List <T> {
    void addAtTail(T data);//Poner el modificador de acceso "public" es redundante ya que es un contrato que debe ser publico (chiste de abogados)
    void addAtFront(T data);//También son abstractos, pero no se les coloca ya que es redundante
    void remove(int index);
    void removeAll();
    void setAt(int index, T data);
    T getAt(int index);
    Iterator<T> getIterator();
    int getSize();
}

//Funciona solo para objetos, no para primitivos