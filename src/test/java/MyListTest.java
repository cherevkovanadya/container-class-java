import org.example.MyList;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    @Test
    public void testAddAndGet_Integer() {
        MyList<Integer> container = new MyList<>();
        container.add(10);
        container.add(20);
        container.add(30);

        assertEquals(10, container.get(0));
        assertEquals(20, container.get(1));
        assertEquals(30, container.get(2));
    }

    @Test
    public void testAddAndGet_String() {
        MyList<String> container = new MyList<>();
        container.add("hello");
        container.add("world");

        assertEquals("hello", container.get(0));
        assertEquals("world", container.get(1));
    }

    @Test
    public void testAddAndGet_Boolean() {
        MyList<Boolean> container = new MyList<>();
        container.add(true);
        container.add(false);

        assertTrue(container.get(0));
        assertFalse(container.get(1));
    }

    @Test
    public void testRemove_Integer() {
        MyList<Integer> container = new MyList<>();
        container.add(10);
        container.add(20);
        container.add(30);

        assertEquals(20, container.remove(1));
        assertEquals(10, container.get(0));
        assertEquals(30, container.get(1));
        assertEquals(2, container.size());
    }

    @Test
    public void testRemove_String() {
        MyList<String> container = new MyList<>();
        container.add("hello");
        container.add("world");

        assertEquals("hello", container.remove(0));
        assertEquals("world", container.get(0));
        assertEquals(1, container.size());
    }

    @Test
    public void testRemove_Boolean() {
        MyList<Boolean> container = new MyList<>();
        container.add(true);
        container.add(false);

        assertEquals(false, container.remove(1));
        assertEquals(true, container.get(0));
        assertEquals(1, container.size());
    }

    @Test
    public void testIterator() {
        MyList<Integer> container = new MyList<>();
        container.add(10);
        container.add(20);
        container.add(30);

        Iterator<Integer> iterator = container.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(10, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(20, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(30, iterator.next());
        assertFalse(iterator.hasNext());
    }

    @Test
    public void testSize() {
        MyList<Integer> container = new MyList<>();
        assertEquals(0, container.size());
        container.add(10);
        assertEquals(1, container.size());
        container.add(20);
        assertEquals(2, container.size());
        container.remove(0);
        assertEquals(1, container.size());
    }

    @Test
    public void testEmptyContainer() {
        MyList<Integer> container = new MyList<>();
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(0));
    }
}
