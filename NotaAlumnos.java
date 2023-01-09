import java.util.concurrent.ForkJoinTask;

import javax.sql.rowset.CachedRowSet;

public class NotaAlumnos {
    final static public int NUM_NOTAS=5;
    final static public int ESTUDIANTES=15;

    static public String [] estudiantes = new String [ESTUDIANTES];
    static public String [][] apellidos = new String [ESTUDIANTES][NUM_NOTAS];

    public static void generaEstudiantes(int numEstudiantes){
        String[] nombres = {"Alan", "Alicia", "Andrea", "Andrés", "Antonia",
        "Antonio", "Celeste", "Gerardo", "Gustavo", "Jesús",
        "Juan", "Julia", "Luisa", "Noelia", "Paula",
        "David", "Ferran", "Cesar", "Josep", "Jesus",
        "Brandon", "Fidel", "Diego", "Leonardo", "Raquel",
        "Salvador", "Ivan", "Sebastian", "Edgar", "Christian",
        "Carlos", "Rodrigo", "Patricia", "Rosario", "Zulema",
        "Maria", "Jose", "Ana", "Isabel", "Laura",
        "Manuel", "Javier", "Daniel", "Alfredo", "Raul",
        "Esther", "Victoria", "Belen", "Estefania", "Miguel",
        "Jorge", "Eduardo", "Vicente", "Sandra", "Aurora",
        "Lola", "Inma", "Luis", "Esteban", "Sandro",
        };
    
        String[] apellidos = {"Garcia", "Rodriguez", "Gonzalez", "Fernandez", "Lopez",
        "Martinez", "Sanchez", "Perez", "Gomez", "Martin",
        "Jimenez", "Hernandez", "Ruiz", "Diaz", "Moreno",
        "Muñoz", "Alvarez", "Moreno", "Gutierrez", "Alonso",
        "Navarro", "Torres", "Dominguez", "Vazquez", "Ramos",
        "Ramirez", "Gil", "Serrano", "Molina", "Blanco",
        "Morales", "Suarez", "Ortega", "Castro", "Delgado",
        "Ortiz", "Marin", "Rubio", "Nuñez", "Sanz",
        "Medina", "Iglesias", "Castillo", "Cortes", "Garrido",
        "Guerrero", "Lozano", "Cano", "Mendez", "Cruz",};

        for(int i=0;i<ESTUDIANTES; i++){
            int nombre, apellido1,apellido2;
            nombre=(int)(Math.random()*50);
            apellido1=(int)(Math.random()*50);
            apellido2=(int)(Math.random()*50);

            estudiantes[i] =nombres[nombre]+""+apellidos[apellido1]+""+apellidos[apellido2];
        }
    }

    public static int estudiante(){
        int est;
        Scanner s = new Scanner (System.in);    
    }

    public static void ejerciciosEntregados(int estudiante){
        int entregados=0;
        
        for (int nota: nota [estudiante-1]){
            if (nota > -1){

            }
        }
    }

    public static int hacerMenu(int menu){
       int menu1;

       System.out.println("Menu");
       System.out.println("-------");
       return System.out.println("");
    }

    public static void generaCalificaciones(){

    }

    public static void mostrarNotas(){
        System.out.println("".repeat(30));
        for (int nota=1;nota<=NUM_NOTAS;nota++){
            System.out.println("%2d" + nota);
        }
        System.out.println("\n" + "".repeat(30) + "-".repeat(NUM_NOTAS*3));

        for(int i=0; i <ESTUDIANTES; i++){
            System.out.printf("%2d, %-25s ", i+1, estudiantes[i]);
            for(int j=0; j< NUM_NOTAS;j++){
                String[][] notas;
                System.out.println("%2d " + notas[i][j]);
            };
        }


        }
    
        public static void main(String[] args) {
            int opcion=0;
            boolean continuar=true;
            switch (hacerMenu(opcion)) {
                case 1:
                generaCalificaciones();
                continuar=true;
                    break;
                case 2:
                 mostrarNotas();
                     break;
                case 3:
                        ejerciciosEntregados(estudiantes());
                        break;
                case 4:
                mediaEjercicios(estudiantes());
                    break;
                case 5:
                System.out.println(estudiantesEntregaTodoConNotaMayot(nota:5));
                            break;
            }
        }
}
