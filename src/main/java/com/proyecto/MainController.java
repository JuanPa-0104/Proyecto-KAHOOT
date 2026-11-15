package com.proyecto;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * Controlador de la vista main.fxml.
 */
public class MainController {

    public static final int TOTAL_PREGUNTAS = 5;

    // ---- Datos: 5 preguntas, cada una con 4 opciones ----
    private final Pregunta[] preguntas = new Pregunta[TOTAL_PREGUNTAS];

    /** Índice de la pregunta que se está editando (0 a 4). */
    private int preguntaActual = 0;

    // ---- Elementos de la vista (fx:id en main.fxml) ----
    @FXML
    private Label tituloLabel;

    @FXML
    private TextField nombreFieldQ;

    @FXML
    private TextField nombreFieldA1;

    @FXML
    private TextField nombreFieldA2;

    @FXML
    private TextField nombreFieldA3;

    @FXML
    private TextField nombreFieldA4;

    @FXML
    private Label mensajeLabel;

    @FXML 
    private ToggleGroup grupoCorrecta;

    @FXML 
    private RadioButton correcta1, correcta2, correcta3, correcta4;

    private RadioButton[] radiosCorrecta;

    /** Los 4 campos de opción, para recorrerlos con un bucle. */
    private TextField[] camposOpciones;

    /** JavaFX lo llama automáticamente después de cargar el FXML. */
    @FXML
    private void initialize() {
        camposOpciones = new TextField[] { nombreFieldA1, nombreFieldA2, nombreFieldA3, nombreFieldA4 };
        radiosCorrecta = new RadioButton[] { correcta1, correcta2, correcta3, correcta4 };

        for (int i = 0; i < TOTAL_PREGUNTAS; i++) {
            preguntas[i] = new Pregunta();
        }

        mostrarPregunta(preguntaActual);
    }

    /** Botón "Guardar": copia lo escrito en los campos a la pregunta actual. */
    @FXML
    private void onGuardar() {
        Pregunta pregunta = preguntas[preguntaActual];
        pregunta.setTexto(nombreFieldQ.getText());
        for (int i = 0; i < Pregunta.NUM_OPCIONES; i++) {
            pregunta.setOpcion(i, camposOpciones[i].getText());
        }

        mensajeLabel.setText("Pregunta " + (preguntaActual + 1) + " guardada");
        // TODO: validar con pregunta.estaCompleta() si quieres obligar a rellenar todo
        int correcta = -1;
        for (int i = 0; i < radiosCorrecta.length; i++) {
            if (radiosCorrecta[i].isSelected()) {
                correcta = i;
            }
        }
        pregunta.setRespuestaCorrecta(correcta);

    }

    /** Botón "Pregunta anterior": pasa a la pregunta anterior. */
    @FXML
    private void onAnterior() {
        if (preguntaActual != 0) {
            preguntaActual--;
            mostrarPregunta(preguntaActual);
        } else {
            mensajeLabel.setText("Ya estás en la primera pregunta");
            // TODO: qué hacer al terminar las 5 preguntas
        }
    }

    
    /** Botón "Siguiente Pregunta": pasa a la siguiente pregunta. */
    @FXML
    private void onSiguiente() {
        if (preguntaActual < TOTAL_PREGUNTAS - 1) {
            preguntaActual++;
            mostrarPregunta(preguntaActual);
        } else {
            mensajeLabel.setText("Ya estás en la última pregunta");
            // TODO: qué hacer al terminar las 5 preguntas
        }
    }

    /** Muestra en los campos los datos guardados de la pregunta indicada. */
    private void mostrarPregunta(int indice) {
        Pregunta pregunta = preguntas[indice];

        tituloLabel.setText("Introduce la pregunta " + (indice + 1) + " de " + TOTAL_PREGUNTAS);
        nombreFieldQ.setPromptText("Pregunta " + (indice + 1));
        nombreFieldQ.setText(pregunta.getTexto());
        for (int i = 0; i < Pregunta.NUM_OPCIONES; i++) {
            camposOpciones[i].setText(pregunta.getOpcion(i));
        }
        mensajeLabel.setText("");

        int correcta = pregunta.getRespuestaCorrecta();
        grupoCorrecta.selectToggle(correcta >= 0 ? radiosCorrecta[correcta] : null);

    }
}
