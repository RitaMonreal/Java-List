package uaslp.objetos.list.arraylist;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import uaslp.objetos.list.Iterator;

public class ArrayListTest {
    @Test
    public void givenANewArrayList_whitOutsize_thenResultIsDefaultIsZero(){
        //Given:
        ArrayList<String> list = new ArrayList<>();

        int DefaultSize = list.getSize();

        //Then:
        Assertions.assertEquals(0, DefaultSize, "Size of list after creation must be zero");
    }

    @Test
    public void provingInitializationOfGetName_ArrayList(){
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.getName();

        //Then:
        Assertions.assertEquals("ArrayList", list.getName());
    }

    @Test
    public void givenANewArrayList_whenGetSize_thenResultIsDefaultIsZero(){
        //Given:
        ArrayList<String> list = new ArrayList<>(5);

        //Then:
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void addAtTail_whenItIsEmpty_thenSizeIsOne(){
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Dalmata");
        //Then:
        Assertions.assertEquals(1,list.getSize());
    }

    @Test
    public void givenAArrayListWithOneElement_whenRemove_thenSizeIsZero(){
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Dalmata");
        list.remove(0);
        //Then:
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAArrayListWithTwoElement_whenRemoveAll_thenSizeIsZero(){
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Dalmata");
        list.addAtTail("Pastor Aleman");
        list.removeAll();
        //Then:
        Assertions.assertEquals(0,list.getSize());
    }

    @Test
    public void givenAListWithThreeElements_whenGetIterator_thenIteratorWorksOverAllThreeElements()  {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Chihuahua");
        list.addAtTail("Coquer");
        list.addAtFront("Boxer");

        //When:
        Iterator<String> iterator = list.getIterator();
        int size = list.getSize();

        //Then:
        Assertions.assertEquals(3,size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Boxer", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Chihuahua", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Coquer", iterator.next());
    }

    @Test
    public void givenAArrayListWithTwoElements_whenSetAtZero_thenElementIsModified() {
        //Given:
        ArrayList<String> list = new ArrayList<>();

        list.addAtTail("Dalmata");
        list.addAtFront("Pomeranian");
        //When:
        list.setAt(0, "Huski");

        //Then:
        int size = list.getSize();
        Assertions.assertEquals(2, size);
        Assertions.assertEquals("Huski", list.getAt(0));
        Assertions.assertEquals("Dalmata", list.getAt(1));
    }

    @Test
    public void givenAArrayListWithMoreElementThanTheOriginalSizeWithTail_whenSizeIs2_thenIncreasedSize() {
        //Given:
        ArrayList<String> list = new ArrayList<>(2);

        list.addAtTail("Dalmata");
        list.addAtTail("Pomeranian");
        list.addAtTail("Coquer");
        list.addAtTail("Golden");
        //When:

        //Then:
        Assertions.assertEquals(4, list.getSize());
    }

    @Test
    public void givenAArrayListWithMoreElementThanTheOriginalSizeWithFront_whenSizeIs2_thenIncreasedSize() {
        //Given:
        ArrayList<String> list = new ArrayList<>(2);

        list.addAtFront("Dalmata");
        list.addAtFront("Pomeranian");
        list.addAtFront("Coquer");
        list.addAtFront("Golden");
        //Then:
        Assertions.assertEquals(4, list.getSize());
    }
}
