package com.proyecto;

/**
 * Una pregunta con su texto y sus 4 opciones de respuesta.
 */
public class Pregunta {

    public static final int NUM_OPCIONES = 4;

    private String texto = "";
    private final String[] opciones = new String[NUM_OPCIONES];
    private int respuestaCorrecta = -1;   // 0 a 3

    public Pregunta() {
        for (int i = 0; i < NUM_OPCIONES; i++) {
            opciones[i] = "";
        }
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto == null ? "" : texto.strip();
    }

    /** @param indice de 0 a 3 */
    public String getOpcion(int indice) {
        return opciones[indice];
    }

    /** @param indice de 0 a 3 */
    public void setOpcion(int indice, String opcion) {
        opciones[indice] = opcion == null ? "" : opcion.strip();
    }

    /** true si la pregunta y sus 4 opciones tienen texto. */
    public boolean estaCompleta() {
        if (texto.isEmpty()) {
            return false;
        }
        for (String opcion : opciones) {
            if (opcion.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public int getRespuestaCorrecta() { 
        return respuestaCorrecta; 
    }
    
    public void setRespuestaCorrecta(int indice) { 
        this.respuestaCorrecta = indice; 
    }
}
