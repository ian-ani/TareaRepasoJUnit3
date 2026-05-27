package es.iesmz.tests;

import es.iesmz.utils.Vocales2;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Vocales2Test {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @ParameterizedTest
    @CsvSource({"Hola Mundo, Hl Mnd", "Esto Es una cadenA, st s n cdn", "Java mola MogollOn, Jv ml Mglln",
            "4h0r4 s0n num3r0s, 4h0r4 s0n nm3r0s", "Cadena Sin Vocales, Cdn Sn Vcls"})
    void sinVocalesTest(String cadena, String cadenaEsperada) {
        assertEquals(cadenaEsperada, Vocales2.sinVocales(cadena));
    }
}