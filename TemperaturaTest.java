/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.temperatura.Temperatura;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author rafap
 */
public class TemperaturaTest {

    static Temperatura t;

    public TemperaturaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
        t = new Temperatura();
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testTemperatura() {

        assertEquals(23, t.converterCelsiusFarenheit(-5));
        assertEquals(41, t.converterCelsiusFarenheit(5));
        assertEquals(32, t.converterCelsiusFarenheit(0));
    }
}
