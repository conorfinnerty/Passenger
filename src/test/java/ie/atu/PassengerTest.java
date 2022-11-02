package ie.atu;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PassengerTest {
    Passenger myPassenger;

    @BeforeEach
    void setUp() {
        myPassenger = new Passenger(null, null, null, null, 0);
    }

    @Test
    void testMrTitle(){
        myPassenger.setTitle("Mr");
        assertEquals("Mr", myPassenger.getTitle());
    }

    @Test
    void testMsTitle(){
        myPassenger.setTitle("Ms");
        assertEquals("Ms", myPassenger.getTitle());
    }

    @Test
    void testMrsTitle(){
        myPassenger.setTitle("Mrs");
        assertEquals("Mrs", myPassenger.getTitle());
    }

    @Test
    void testTitleFail() {
        assertThrows(IllegalArgumentException.class, () -> {myPassenger.setTitle("Men");});
    }

    @Test
    void testPhoneSuccess(){
        myPassenger.setPhone("0873684495");
        assertEquals("0873684495", myPassenger.getPhone());
    }

    @Test
    void testPhoneFail() {
            assertThrows(IllegalArgumentException.class, () -> {myPassenger.setPhone("123");});
    }

    @Test
    void testNameSuccess(){
        myPassenger.setName("Bobby");
        assertEquals("Bobby", myPassenger.getName());
    }

    @Test
    void testNameFail() {
        assertThrows(IllegalArgumentException.class, () -> {myPassenger.setName("cu");});
    }

    @Test
    void testIdSuccess(){
        myPassenger.setPhone("G0000383112");
        assertEquals("G0000383112", myPassenger.getPhone());
    }

    @Test
    void testIdFail() {
        assertThrows(IllegalArgumentException.class, () -> {myPassenger.setPhone("G0383112");});
    }

    @Test
    void testAgeSuccess(){
        myPassenger.setPhone("22");
        assertEquals("22", myPassenger.getPhone());
    }

    @Test
    void testAgeFail() {
        assertThrows(IllegalArgumentException.class, () -> {myPassenger.setPhone("12");});
    }

    @AfterEach
    void tearDown() {
    }
}