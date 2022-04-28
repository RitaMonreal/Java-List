package uaslp.objetos.list.hashset;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.exception.NotNullValuesAllowedException;
import uaslp.objetos.list.exception.NotSuchElementException;
import uaslp.objetos.list.exception.NotValidIndexException;

public class HashSetTest {

    @Test
    public void givenANewHashSet_whitOutsize_thenResultIsDefaultIsZero(){
        //Given:
        HashSet<String> hashSet = new HashSet<>();

        //Then:
        Assertions.assertEquals(0, hashSet.size(),"Size of list after creation must be zero");
    }

    @Test
    public void agregarUnElementoAlHashSetCuandoEstaVacio_entoncesCreaUnNuevoArrayListQueTendraUnSoloElemento() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        HashSet<String> hashSet = new HashSet<>();

        //When
        hashSet.add("Vaca");

        //Then:
        Assertions.assertEquals(1, hashSet.size(),"Size of list after creation must be zero");
    }

    @Test
    public void addAnElementToTheHashsetWhenItIsNotEmpty_thenItLoopsAndReturnsItsLocation() throws NotValidIndexException, NotNullValuesAllowedException {
        //Given:
        HashSet<String> hashSet = new HashSet<>();

        //When
        hashSet.add("Vaca");
        Assertions.assertTrue(hashSet.contains("Vaca"));
        hashSet.add("Perro");
        Assertions.assertTrue(hashSet.contains("Perro"));
        hashSet.add("Vaca");
        /*PREGUNTARR se supone que no debería de agregarse debe dar falso
        Assertions.assertTrue(hashSet.contains("Vaca"));*/
    }

    @Test
    public void givenAHashSetWithThreeElements_whenGetIterator_thenIteratorWorksOverAllThreeElements() throws NotValidIndexException, NotSuchElementException, NotNullValuesAllowedException {
        //Given:
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Chihuahua");
        hashSet.add("Coquer");
        hashSet.add("Boxer");

        //When:
        Iterator<String> iterator = hashSet.iterator();
        int size = hashSet.size();

        //Then:
        Assertions.assertEquals(3,size);
        Assertions.assertNotNull(iterator);
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Chihuahua", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Boxer", iterator.next());
        Assertions.assertTrue(iterator.hasNext());
        Assertions.assertEquals("Coquer", iterator.next());
    }

    @Test
    public void deleteElementFromHashSet_whenItHas3Elements_thenElementsAre2() throws NotValidIndexException, NotSuchElementException, NotNullValuesAllowedException {
        //Given:
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Chihuahua");
        hashSet.add("Coquer");
        hashSet.add("Boxer");

        //When:
        int size = hashSet.size();

        //Then:
        hashSet.remove("Chihuahua");
        Assertions.assertEquals(2,hashSet.size());
    }
}
