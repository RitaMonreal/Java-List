package uaslp.objetos.list.linkedlist;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class LinkedListTest {
//Inicialización/Preparación
//Ejecución
//Validación
    @Test
    public void givenANewList_whenGetSize_thenResultIsZero(){
        //Given:
        LinkedList<String>list = new LinkedList<>();

        //When:
        int sizeOfList = list.getSize();

        //Then:
        Assertions.assertEquals(0, sizeOfList, "Size of list after creation must be zero");
    }

    @Test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        //When
        list.addAtFront("Hola");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsOne() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        //When
        list.addAtTail("Hola");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(1, size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenANewList_whenAddAtFrontAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        //When
        list.addAtFront("Hola");

        list.addAtFront("Mundo");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);

        Assertions.assertEquals("Hola", list.getAt(1));//Validación
        Assertions.assertEquals("Mundo", list.getAt(0));
    }

    @Test
    public void givenANewList_whenAddAtTailAnElement_thenSizeIsTwo() throws NotNullValuesAllowedException, NotValidIndexException {
        //Given
        LinkedList<String> list = new LinkedList<>();

        //When
        list.addAtTail("Hola");

        list.addAtTail("Mundo");

        //Then
        int size = list.getSize();

        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Mundo", list.getAt(1));
        Assertions.assertEquals("Hola", list.getAt(0));//Validación
    }

    @Test
    public void givenAListWithOneElement_whenRemove_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");

        //When:
        list.remove(0);
        int size = list.getSize();
        //Then:
        Assertions.assertEquals(0,size);
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex0_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("mundo");

        //When:
        list.remove(0);
        int size = list.getSize();
        //Then:
        Assertions.assertEquals(1,size);
        Assertions.assertEquals("mundo", list.getAt(0));
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex1_thenSizeIsOne() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("mundo");

        //When:
        list.remove(1);
        int size = list.getSize();
        //Then:
        Assertions.assertEquals(1,size);
        Assertions.assertEquals("Hola", list.getAt(0));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveIndex1_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");


        //When:
        list.remove(1);
        int size = list.getSize();
        //Then:
        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Cruel", list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveElementAtTail_thenSizeIsTwo() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");


        //When:
        list.remove(2);
        int size = list.getSize();
        //Then:
        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Adios", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));
    }

    @Test
    public void givenAListWithThreeElements_whenRemoveAll_thenSizeIsZero() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");
        //When:
        list.removeAll();
        int size = list.getSize();
        //Then:
        Assertions.assertEquals(0,size);
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtZero_thenElementIsModified() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtFront("Adios");
        //When:
        list.setAt(0,"Hola");

        //Then:
        int size = list.getSize();
        Assertions.assertEquals(2,size);
        Assertions.assertEquals("Hola", list.getAt(0));
        Assertions.assertEquals("Mundo", list.getAt(1));

    }

    @Test
    public void givenAListWithThreeElements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotValidIndexException, NotNullValuesAllowedException, NotSuchElementException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtTail("Mundo");
        list.addAtTail("Cruel");
        list.addAtFront("Adios");

        //When:
        Iterator<String> iterator = list.getIterator();
        int size = list.getSize();

        //Then:
        Assertions.assertEquals(3,size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Adios", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Mundo", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Cruel", iterator.next());
    }

    @Test
    public void givenANewList_whenGetSize_thenExceptionIsThrown() {
        //Given:
        LinkedList<String> list = new LinkedList<>();

        //When:
        try{
            list.getAt(0);
            Assertions.fail("An exception should be thrown getting element zero");
        }catch (NotValidIndexException ex){
            //Excepcion thrown
        }
    }

    @Test
    public void givenAListWithTwoElements_whenRemoveIndex3_thenNotValidExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("mundo");

        //When y Then:
        Assertions.assertThrows(NotValidIndexException.class, ()->list.remove(3));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtIndex3_thenNotValidExceptionIsThrown() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("mundo");

        //When y Then:
        Assertions.assertThrows(NotValidIndexException.class, ()->list.setAt(3, "Valor"));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtFrontNullValue_thenNotNullValuesAllowedExceptionIsThrows() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("mundo");

        //When y Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtFront(null));
    }

    @Test
    public void givenAListWithTwoElements_whenAddAtTailNullValue_thenNotNullValuesAllowedExceptionIsThrows() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("mundo");

        //When y Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.addAtTail(null));
    }

    @Test
    public void givenAListWithTwoElements_whenSetAtNullValue_thenNotNullValuesAllowedExceptionIsThrows() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        LinkedList<String>list = new LinkedList<>();

        list.addAtFront("Hola");
        list.addAtTail("mundo");

        //When y Then:
        Assertions.assertThrows(NotNullValuesAllowedException.class, ()->list.setAt(0,null));
    }

}
