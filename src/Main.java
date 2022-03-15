import uaslp.objetos.list.List;//Este es mi interface de list general
import uaslp.objetos.list.Iterator;//Este es mi interface de el iterator
import uaslp.objetos.list.arraylist.ArrayList;
import uaslp.objetos.list.linkedlist.LinkedList;
//Para organizar código creamos paquetes

public class Main {
    public static void main(String[] args) {//psv
        firma(new LinkedList(), new LinkedList(), new LinkedList());
        firma(new ArrayList(), new ArrayList(), new ArrayList());
    }

    public static void firma(List team1, List team2, List team3) {//psv
        team1.addAtTail("Jesús");
        team1.addAtTail("Salomón");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        System.out.println(">>Team 1 original\n");

        Iterator iterator;

        iterator = team1.getIterator();

        while(iterator.hasNext()){//Mientras sea diferente de nulo, o sea que haya elementos en la lista
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("\n>>Team 2 original\n");

        iterator = team2.getIterator();

        while(iterator.hasNext()){//Mientras sea diferente de nulo, o sea que haya elementos en la lista
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("\n>>Team 1 modificado\n");

        team1.remove(0);
        team1.addAtFront("Rebeca");
        System.out.println("*Team 1 tiene: " + team1.getSize() + " integrantes*");

        iterator = team1.getIterator();

        while(iterator.hasNext()){//Mientras sea diferente de nulo, o sea que haya elementos en la lista
            String name = iterator.next();
            System.out.println(name);
        }

        team2.remove(2);
        team2.addAtTail("Rita <3");
        System.out.println("\n>>Team 2 modificado\n");
        System.out.println("*Team 2 tiene: " + team2.getSize() + " integrantes*");

        iterator = team2.getIterator();

        while(iterator.hasNext()){//Mientras sea diferente de nulo, o sea que haya elementos en la lista
            String name = iterator.next();
            System.out.println(name);
        }

        team3.remove(0);
        team3.remove(0);//Ya no existe, pero debería seguir jalando
        System.out.println("\n>>Team 3 original\n");
        team3.addAtTail("Tadeo");
        team3.addAtTail("Isai");

        System.out.println("*Team 3 tiene: " + team3.getSize() + " integrantes*");

        iterator = team3.getIterator();
        while(iterator.hasNext()){//Mientras sea diferente de nulo, o sea que haya elementos en la lista
            String name = iterator.next();
            System.out.println(name);
        }

        if(team1.getAt(1).equals("Salomón")){
            team1.setAt(1,"Luis");
        }
        System.out.println("\n>>Team 1 modificación 2\n");
        System.out.println("*Team 1 tiene: " + team1.getSize() + " integrantes*");

        iterator = team1.getIterator();
        while(iterator.hasNext()){//Mientras sea diferente de nulo, o sea que haya elementos en la lista
            String name = iterator.next();
            System.out.println(name);
        }

    }
}

/*import uaslp.objetos.list.arraylist.ArrayListIterator;
import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;*/