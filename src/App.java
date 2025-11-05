public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduzca la altura de la X: ");
        int altura = Integer.parseInt(System.console().readLine());

        if (altura < 3 || altura % 2 == 0) {
            System.out.println("Datos incorrectos. Debe introducir una altura impar mayor o igual a 3");
        }else{
            for(int fila = 0; altura >= fila; fila++){
                for(int columna=0; columna < altura;columna++){
                    if (columna == fila || columna == altura-fila-1) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
