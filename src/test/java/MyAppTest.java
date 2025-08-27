import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class MyAppTest {
    MyApp m = new MyApp();
    @Test
    public void addme() {
        assertEquals(5, m.addme(2,3) );
    }

    @Test
    public void subme() {
        assertEquals(2, m.subme(5,3));
    }

    @Test
    public void mulme() {
        assertEquals(15, m.mulme(5,3));
    }

    @Test
    public void divme() {
        assertEquals(2, m.divme(6,3));
    }
}