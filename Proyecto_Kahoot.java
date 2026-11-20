import java.util.Scanner;
public class Proyecto_Kahoot {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digita tu nombre ");
        String nombre = sc.nextLine();
        System.out.println("Bienvenido, " + nombre + "! Preparate para estudiar. ");
        int opcion = 0;

        do {

            System.out.println("\n=== MENÚ DE COMPETENCIAS ===");
            System.out.println("1. Matemáticas");
            System.out.println("2. Lectura crítica");
            System.out.println("3. Ciencias naturales");
            System.out.println("4. Ciencias sociales");
            System.out.println("5. Inglés");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                //Competencia 1
                case 1: {
                    System.out.println("Iniciando Matematicas... ");
                    System.out.println("===MATEMATICAS=== " );
                     String[] preguntas = {
                       "Una tienda ofrece un descuento del 20 % sobre un producto" + 
                       "que cuesta $150.000.\n ¿Cuál es el precio final? ",
                       "Si 3x+5=20, entonces el valor de (x) es: ",
                       "Un rectángulo tiene un área de 48 cm² y un ancho de 6 cm.\n ¿Cuál es su largo? ",
                       "En una bolsa hay 4 bolas rojas, 3 azules y 3 verdes. " + 
                       "Si se extrae una bola al azar,\n¿cuál es la probabilidad de que sea azul?"
                     };
                     String[] respuestas = {
                        "A. $120.000\nB. $130.000\nC. $125.000\nD. $110.000 ",
                        "A. 3\nB. 5\nC. 6\nD. 7 ",
                        "A. 7cm\nB. 9cm\nC. 8cm\nD. 12cm ",
                        "A. 1/2\nB. 3/10\nC. 4/10\nD. 3/7 "
                     }; //Siguiente variable fuera del parentesis//
                     String[] correctas = {"A", "B", "C", "B" };
                     int total_preguntas = preguntas.length ;
                     int puntaje = 0;

                     for (int i = 0; i < preguntas.length; i++) {
                        System.out.println("\nPregunta " + (i + 1) + ": " + preguntas[i]);
                        System.out.println(respuestas[i]);

                        System.out.println("Digita tu respuesta ");
                        String respuesta = sc.next();
                        if (respuesta.equalsIgnoreCase(correctas[i])) {
                            System.out.println("CORRECTO!!! ");
                            puntaje ++;    
                        } else {
                            System.out.println("Respuesta incorrecta =( ");
                        }
                     }
                     System.out.println("Tu puntaje es " + puntaje + " de " + total_preguntas);
                    break;
                }
                //Competencia 2
                case 2: {
                    System.out.println("Iniciando Analisis Textual... ");
                    System.out.println("===ANALISIS TEXTUAL=== " );
                     String[] preguntas = {
                       " Un texto afirma: \"El crecimiento de las ciudades no necesariamente" + 
                       "implica una mejora en la calidad de vida. Si la expansión urbana" + 
                       "no está acompañada de planificación, puede aumentar la desigualdad," + 
                       "dificultar la movilidad y reducir el acceso a servicios básicos\n." +
                       "\n" + //
                       "¿Cuál es la idea central del texto?",
                       "Una autora sostiene que la tecnología facilita la comunicación," + 
                       "pero también puede reducir la profundidad de las conversaciones cuando" +
                       "las personas priorizan la rapidez sobre la escucha.\n" +
                       "\n" + //
                       "¿Qué se puede inferir? ",
                       "Lee el siguiente fragmento:\n" + 
                       "\"El científico no busca confirmar aquello que cree, sino someter" + 
                       "sus ideas a pruebas que puedan demostrar que está equivocado\".\n" +
                       "\n" + //
                       "¿Qué actitud se destaca como fundamental para la ciencia? ",
                       "Un artículo afirma que los parques urbanos contribuyen al bienestar" + 
                       "porque permiten la recreación, reducen algunos efectos del calor y favorecen" + 
                       "la interacción social.\n" + //
                       "\n" + //
                       "¿Cuál de las siguientes afirmaciones fortalece más la argumentación? ",
                     };
                     String[] respuestas = {
                        "A. Las ciudades deben dejar de crecer para evitar la desigualdad.\n" + 
                        "B. El crecimiento urbano requiere planificación para favorecer la calidad de vida.\n" + 
                        "C. La movilidad es el único problema de las grandes ciudades.\n" + 
                        "D. Los servicios básicos son innecesarios en las ciudades en expansión. ", 
                        //Respuestas Pregunta 1
                        "A. La tecnología impide que las personas se comuniquen.\n" + 
                        "B. La comunicación digital siempre es superficial.\n" + 
                        "C. La tecnología puede facilitar la comunicación sin garantizar su calidad.\n" + 
                        "D. Las conversaciones presenciales son siempre mejores. ", 
                        //Respuestas Pregunta2
                        "A. La aceptación de las opiniones mayoritarias.\n" + 
                        "B. La defensa permanente de las teorías personales.\n" + 
                        "C. La búsqueda de resultados que confirmen las creencias.\n" + 
                        "D. La disposición a cuestionar y revisar las propias ideas. ", 
                        //Respuestas Pregunta3
                        "A. Algunas personas prefieren permanecer en sus casas.\n" + 
                        "B. Los parques pueden diseñarse con diferentes estilos arquitectónicos.\n" + 
                        "C. Estudios urbanos relacionan el acceso a espacios verdes" + 
                        "con beneficios en la salud y el bienestar.\n" + 
                        "D. Las ciudades modernas tienen edificios de diferentes alturas. ", 
                        //Respuestas Pregunta 4
                     };
                     String[] correctas = {"B", "C", "D", "C" };
                     int total_preguntas = preguntas.length ;
                     int puntaje = 0;

                     for (int i = 0; i < preguntas.length; i++) {
                        System.out.println("\nPregunta " + (i + 1) + ": " + (preguntas[i]));
                        System.out.println(respuestas[i]);

                        System.out.println("Digita la respuesta ");
                        String respuesta = sc.next();

                        if (respuesta.equalsIgnoreCase(correctas[i])) {
                            System.out.println("CORRECTO!! ");
                        } else {
                            System.out.println("Respuesta Incorrecta =( ");
                        }
                     }
                     System.out.println("Tu puentaje es" + puntaje + " de " + total_preguntas );
                    break;
                    //Competencia 3
                }
                case 3: {
                    System.out.println("Iniciando Ciencias Naturales... ");
                     String[] preguntas = {
                        "En las células eucariotas, ¿cuál es la función principal de las mitocondrias? ",
                        "Un objeto se desplaza a una velocidad constante de 5 m/s durante 10 segundos.\n¿Qué distancia recorre? ",
                        "¿Cuál de los siguientes fenómenos corresponde a un cambio químico? ",
                        "En un ecosistema, las plantas producen materia orgánica a partir de energía solar.\n¿Qué papel cumplen principalmente? "
                    };
                    String[] respuestas = {
                        "A. Almacenar exclusivamente la información genética\nB. Sintetizar todas las proteínas de la célula\n " + 
                        "Producir energía utilizable mediante procesos de respiración celular\nD. Destruir permanentemente la membrana celular ",
                        "A. 15 m\nB. 50 m\nC. 25 m\nD. 100 m ",
                        "A. El hielo se derrite\nB. El agua se evapora\nC. El papel se corta en fragmentos\nD. El hierro se oxida ",
                        "A. Consumidores secundarios\nB. Productores\nC. Descomponedores\nD. Depredadores "
                    };
                     String[] correctas = {"C", "B", "D", "B"};
                     int total_preguntas = preguntas.length ;
                     int puntaje = 0;

                     for (int i = 0; i < preguntas.length; i++) {
                        System.out.println("\nPregunta " + (i + 1) + ": " + preguntas[i]);
                        System.out.println(respuestas[i]);

                        System.out.println("Digita tu respuesta ");
                        String respuesta = sc.next();
                        if (respuesta.equalsIgnoreCase(correctas[i])) {
                            System.out.println("CORRECTO!!! ");
                            puntaje ++;    
                        } else {
                            System.out.println("Respuesta incorrecta =( ");
                        }
                     }
                     System.out.println("Tu puntaje es " + puntaje + " de " + total_preguntas);
                    break;
                }
                case 4: {
                    System.out.println("Iniciando Ciencias Sociales... ");
                    String[] preguntas = {
                        "La Revolución Industrial transformó profundamente las sociedades europeas durante los siglos XVIII y XIX.\n¿Cuál fue uno de sus principales efectos?",
                        "Un país presenta una gran diversidad de climas debido a sus diferentes alturas sobre el nivel del mar.\n¿A qué fenómeno se relaciona principalmente esta diversidad?",
                        "Un filósofo afirma que una persona debe cuestionar las creencias que ha aceptado sin examinarlas para llegar a conocimientos más fundamentados.\n¿Qué postura se relaciona con esta afirmación?",
                        "En una democracia, la separación de poderes busca principalmente:"
                     };
                     String[] respuestas = {
                        "A. La desaparición completa de la agricultura\nB. La reducción generalizada de las ciudades\nC. El crecimiento de las ciudades y el desarrollo del trabajo fabril\nD. La eliminación de las diferencias sociales",
                        "A. La latitud de los océanos\nB. La altitud y las condiciones atmosféricas asociadas\nC. La cantidad de población\nD. La actividad comercial",
                        "A. El pensamiento crítico\nB. La obediencia absoluta\nC. El dogmatismo\nD. La aceptación de la tradición sin cuestionamientos",
                        "A. Concentrar las decisiones en un único gobernante\nB. Eliminar la participación ciudadana\nC. Evitar que una institución tenga un poder absoluto mediante controles entre instituciones\nD. Impedir que existan leyes"
                    };
                    String[] correctas = {"C", "B", "A", "C"};
                     int total_preguntas = preguntas.length ;
                     int puntaje = 0;

                     for (int i = 0; i < preguntas.length; i++) {
                        System.out.println("\nPregunta " + (i + 1) + ": " + preguntas[i]);
                        System.out.println(respuestas[i]);

                        System.out.println("Digita tu respuesta ");
                        String respuesta = sc.next();
                        if (respuesta.equalsIgnoreCase(correctas[i])) {
                            System.out.println("CORRECTO!!! ");
                            puntaje ++;    
                        } else {
                            System.out.println("Respuesta incorrecta =( ");
                        }
                     }
                     System.out.println("Tu puntaje es " + puntaje + " de " + total_preguntas);
                    break;
                }
                case 5: {
                    System.out.println("Proximamente Analisis de imagen... ");
                    //Proximamente...
                    break;
                }
                case 6: {
                    System.out.println("Saliendo... ");
                    break;
                }
            }
        } while (opcion !=0);
        sc.close();
        
    }
}
