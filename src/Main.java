import uaslp.objetos.list.linkedlist.LinkedList;
import uaslp.objetos.list.linkedlist.LinkedListIterator;
//Para organizar código creamos paquetes
public class Main{
    public static void main(String[] args) {//psv
        LinkedList team1 = new LinkedList();
        LinkedList team2 = new LinkedList();
        LinkedList team3 = new LinkedList();

        team1.addAtTail("Jesús");
        team1.addAtTail("Salomón");
        team1.addAtTail("Yael");

        team2.addAtFront("Cristian");
        team2.addAtFront("Daniel");
        team2.addAtFront("Diego");

        team3.addAtFront("Imelda");

        System.out.println(">>Team 1 original\n");

        LinkedListIterator iterator;

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
