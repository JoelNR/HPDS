import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SuperPrimeTest {
    SuperPrime superPrime = new SuperPrime();


    @Test
    public void test_5_esPrimo(){
        boolean value = superPrime.esPrimo(5);
        assertEquals(value, true);
    }

    @Test
    public void test_86_no_esPrimo(){
        boolean value = superPrime.esPrimo(86);
        assertEquals(value, false);
    }

    @Test
    public void test_999961_esPrimo(){
        boolean value = superPrime.esPrimo(999961);
        assertEquals(value, true);
    }

    @Test
    public void test_1_no_esPrimo(){
        boolean value = superPrime.esPrimo(1);
        assertEquals(value, false);
    }

    @Test
    public void test_invierteNumero_17(){
        int value = superPrime.invierteNumero(17);
        assertEquals(value,71);
    }

    @Test
    public void test_invierteNumero_100(){
        int value = superPrime.invierteNumero(100);
        assertEquals(value,1);
    }

    @Test
    public void test_invierteNumero_0(){
        int value = superPrime.invierteNumero(0);
        assertEquals(value,0);
    }

    @Test
    public void test_for_lower_1_upper_10(){
        int[] value = superPrime.analizeSuperPrime(1,10);

        assertEquals(value[0], 0);
        assertEquals(value[1], 0);

    }

    @Test
    public void test_for_lower_10_upper_20(){
        int[] value = superPrime.analizeSuperPrime(10,20);

        assertEquals(value[0], 2);
        assertEquals(value[1], 30);
    }

    @Test
    public void test_for_lower_13_upper_31(){
        int[] value = superPrime.analizeSuperPrime(13,31);

        assertEquals(value[0], 3);
        assertEquals(value[1], 61);
    }

    @Test
    public void test_for_lower_1_upper_31(){
        int[] value = superPrime.analizeSuperPrime(1,31);

        assertEquals(value[0], 3);
        assertEquals(value[1], 61);
    }

    @Test
    public void test_for_lower_2_upper_100(){
        int[] value = superPrime.analizeSuperPrime(2,100);

        assertEquals(value[0], 8);
        assertEquals(value[1], 418);
    }
    @Test
    public void test_for_lower_9900_upper_10000(){
        int[] value = superPrime.analizeSuperPrime(9900,10000);

        assertEquals(value[0], 4);
        assertEquals(value[1], 39762);
    }
    @Test
    public void test_for_lower_501_upper_599(){
        int[] value = superPrime.analizeSuperPrime(501,599);

        assertEquals(value[0], 0);
        assertEquals(value[1], 0);
    }
}
