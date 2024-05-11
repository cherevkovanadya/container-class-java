import org.example.MyList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    @Test
    public void testAddAndGet() {
        MyList container = new MyList();
        container.add(10);
        container.add(20);
        container.add(30);

        assertEquals(10, container.get(0));
        assertEquals(20, container.get(1));
        assertEquals(30, container.get(2));
    }

    @Test
    public void testRemove() {
        MyList container = new MyList();
        container.add(10);
        container.add(20);
        container.add(30);

        assertEquals(20, container.remove(1));
        assertEquals(10, container.get(0));
        assertEquals(30, container.get(1));
        assertEquals(2, container.size());
    }

    @Test
    public void testSize() {
        MyList container = new MyList();
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
        MyList container = new MyList();
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(0));
    }
}
