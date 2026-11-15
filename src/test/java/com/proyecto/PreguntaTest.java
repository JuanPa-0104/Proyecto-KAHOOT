package com.proyecto;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PreguntaTest {

    @Test
    void preguntaNuevaEstaIncompleta() {
        assertFalse(new Pregunta().estaCompleta());
    }

    @Test
    void preguntaConTodoRellenoEstaCompleta() {
        Pregunta pregunta = new Pregunta();
        pregunta.setTexto("¿Capital de Francia?");
        pregunta.setOpcion(0, "París");
        pregunta.setOpcion(1, "Roma");
        pregunta.setOpcion(2, "Madrid");
        pregunta.setOpcion(3, "Berlín");

        assertTrue(pregunta.estaCompleta());
    }

    @Test
    void eliminaEspaciosSobrantes() {
        Pregunta pregunta = new Pregunta();
        pregunta.setOpcion(0, "  París  ");
        assertEquals("París", pregunta.getOpcion(0));
    }
}
