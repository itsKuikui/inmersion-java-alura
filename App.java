import java.util.Scanner;
/*pt1 del proyecto "screenmatch" actividad del minicurso de alura latam inmersion java. se trata de una app de streaming que da informacion basica sobre las peliculas y series */
public class App {
    public static void main(String[] args) throws Exception {

        int fechaDeLanzamiento  = 2011;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Rango";
        String sinopsis = """
            Rango es un camaleón que lleva toda su vida viviendo como mascota en un terrario. Sin embargo, un buen día, mientras transportan su terrario, el recipiente se cae del auto en medio del desierto y acaba en un pueblo salvaje donde lo nombran alguacil
                """;
        System.out.println(nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(sinopsis);
        System.out.println(incluidoEnElPlanBasico);
        double mediaEvaluacionUsuario = 0;
        /*el for es para tomar en cuenta varias valoraciones y devolver un  promedio de calificación */
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la nota que le das a la película");
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaPelicula;
        }

        System.out.println("la media de la película Rango es: " + mediaEvaluacionUsuario / 3);
        
        
        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular en el momento");
        } else{
            System.out.println("Película retro que vale la pena ver");
        }
        
    }
}
