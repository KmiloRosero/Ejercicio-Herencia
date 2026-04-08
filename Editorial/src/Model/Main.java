package Model;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de publicacion:");
        System.out.println("1) Libro");
        System.out.println("2) Disco");
        System.out.println("3) Video");

        int opcion = readInt(scanner, "Opcion (1-3): ");
        while (opcion < 1 || opcion > 3) {
            System.out.println("Opcion invalida.");
            opcion = readInt(scanner, "Opcion (1-3): ");
        }

        Publicacion publicacion;
        if (opcion == 1) {
            publicacion = crearLibro(scanner);
        } else if (opcion == 2) {
            publicacion = crearDisco(scanner);
        } else {
            publicacion = crearVideo(scanner);
        }

        System.out.println("Datos ingresados:");
        System.out.println(publicacion);
    }

    private static Libro crearLibro(Scanner scanner) {
        String titulo = readNonEmptyString(scanner, "Titulo: ");
        String autor = readNonEmptyString(scanner, "Autor: ");
        int anio = readInt(scanner, "Anio de publicacion: ");
        String isbn = readNonEmptyString(scanner, "ISBN: ");
        int paginas = readInt(scanner, "Numero de paginas: ");
        return new Libro(titulo, autor, anio, isbn, paginas);
    }

    private static Disco crearDisco(Scanner scanner) {
        String titulo = readNonEmptyString(scanner, "Titulo: ");
        String autor = readNonEmptyString(scanner, "Autor: ");
        int anio = readInt(scanner, "Anio de publicacion: ");
        String genero = readNonEmptyString(scanner, "Genero: ");
        int canciones = readInt(scanner, "Numero de canciones: ");
        int duracionMinutos = readInt(scanner, "Duracion (minutos): ");
        return new Disco(titulo, autor, anio, genero, canciones, duracionMinutos);
    }

    private static Video crearVideo(Scanner scanner) {
        String titulo = readNonEmptyString(scanner, "Titulo: ");
        String autor = readNonEmptyString(scanner, "Autor: ");
        int anio = readInt(scanner, "Anio de publicacion: ");
        Idioma idioma = readIdioma(scanner);
        float duracionHoras = readFloat(scanner, "Duracion (horas, coma flotante): ");
        return new Video(titulo, autor, anio, idioma, duracionHoras);
    }

    private static Idioma readIdioma(Scanner scanner) {
        System.out.println("Idioma:");
        System.out.println("1) ESPANOL");
        System.out.println("2) INGLES");
        System.out.println("3) PORTUGUES");

        int opcion = readInt(scanner, "Opcion (1-3): ");
        while (opcion < 1 || opcion > 3) {
            System.out.println("Opcion invalida.");
            opcion = readInt(scanner, "Opcion (1-3): ");
        }

        if (opcion == 1) {
            return Idioma.ESPANOL;
        }
        if (opcion == 2) {
            return Idioma.INGLES;
        }
        return Idioma.PORTUGUES;
    }

    private static String readNonEmptyString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine();
            if (value != null && !value.trim().isEmpty()) {
                return value.trim();
            }
            System.out.println("Valor invalido.");
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine();
            try {
                return Integer.parseInt(Objects.requireNonNull(value).trim());
            } catch (RuntimeException e) {
                System.out.println("Numero invalido.");
            }
        }
    }

    private static float readFloat(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine();
            try {
                String normalized = Objects.requireNonNull(value).trim().replace(',', '.');
                return Float.parseFloat(normalized);
            } catch (RuntimeException e) {
                System.out.println("Numero invalido.");
            }
        }
    }
}
