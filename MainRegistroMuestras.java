package Clase6_Reto;

import java.util.*;

public class RegistrosMuestras {
    public static void main(String[] args) {

        // ArrayList para registrar el orden de llegada
        ArrayList <String> muestras = new ArrayList<>();

        // Agregar nombres de especies 
        muestras.add("Homo sapiens");
        muestras.add("Mus musculus");
        muestras.add("Arabidopsis thaliana");
        muestras.add("Homo sapiens");

        System.out.println("Muestras recibidas: ");
        for (int i = 0; i < muestras.size(); i++) {
            //Size por el tamaño/cantidad de las muestras
            System.out.println((i + 1) + ". " + muestras.get(i));
        }

        // PHashSet para especies procesadas
        HashSet<String> especiesunicas = new HashSet<>(muestras);

        System.out.println("Especies únicas procesadas:");
        for (String especie : especiesunicas) {
            System.out.println("- " + especie);
        }

        // HashMap para asociarlo con el nombre del investigador
        HashMap<String, String> muestrasInvestigador = new HashMap<>();

        // Investigadores
        muestrasInvestigador.put("A-001", "José López");
        muestrasInvestigador.put("A-002", "Jaime Arce");
        muestrasInvestigador.put("A-003", "Pamela Rojas");

        System.out.println("Asignar muestras a investigadores");
        for (Map.Entry<String, String> entry : muestrasInvestigador.entrySet()) 
        {
            //Poner getkey
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Búsqueda de investigador por ID de muestra
        String idBuscar = "A-002"; 
        System.out.println("Investigador responsable de la muestra " + idBuscar + ": " + muestrasInvestigador.get(idBuscar));
    }
}