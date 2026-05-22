import java.util.Scanner;
    public class SIFRAH {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double categorias = 0;
            double registro = 0;
            System.out.println("----BIENVENIDO A TIENDA DE SIFRAH----");
            System.out.println();
            registro(registro);
            categorias(categorias);
        }

        public static void registro(double registro) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("-----REGISTRESE-----");
            System.out.println("Ingrese su correo electronico");
            String registrar = scanner.nextLine();
            System.out.println("Ingrese su contraseña");
            String contraseña = scanner.nextLine();
            System.out.println("Bienvenido a SIFRAH");
            System.out.println();
        }

        public static void categorias(double categorias) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTRE LAS SIGUIENTES TENEMOS ESTOS PRODUCTOS");
            System.out.println("Seleccione la categoria que desee");
            System.out.println("Marque 1 Bisuteria");
            System.out.println("Marque 2 Bolsos y carteras");
            System.out.println("Marque 3 Accesorios de cabello");
            System.out.println("Marque 4 Complementos");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("--- CATEGORIA: BISUTERIA ---");
                    bisuteria();
                    break;
                case 2:
                    System.out.println("--- CATEGORIA: BOLSOS Y CARTERAS ---");
                    bolsosYCarteras();
                    break;
                case 3:
                    System.out.println("--- CATEGORIA: ACCESORIOS DE CABELLO ---");
                    accesoriosCabello();
                    break;
                case 4:
                    System.out.println("Complementos");
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
        }

        public static void bisuteria() {
            Scanner escaner = new Scanner(System.in);
            double total_pagar = 0;
            System.out.println("CATALOGO BISUTERIA SIFRAH");
            System.out.println("1.- Anillo dorado con luna y estrella en zircón a 15.90");
            System.out.println("2.- Pulsera dorada con lazo y zircón a 31.90");
            System.out.println("3.- Pulsera dorada con corazón y zircón a 31.90");
            System.out.println("4.- Pulsera Premium Zircón Bañado en Oro Con Charms a 29.90");
            System.out.println("5.- Set Aretes Premium Zircón Bañado en Oro Delicate Dorado a 22.90");
            System.out.println("6.- Anillo Bañado en Oro Premium Zircón Regulable Mariposa Dorado a 22.90");
            System.out.println("7.- Set Aretes Premium Zircón Bañado en Oro Cherry Dorado a 22.90");
            System.out.println("8.- Set Collar + Arete Premium Zircón Bañado en Oro Puppy Dorado a 39.90");
            System.out.println("9.- Aretes Premium Zircón Bañado en Oro Bloom Dorado a 22.90");
            System.out.println("10.- Anillo Bañado en Oro Premium Zircón Flor Dorado a 22.90");

            System.out.println("Seleccione una opcion:");
            int opcionSeleccionada = escaner.nextInt();

            System.out.println("Ingrese la cantidad a comprar:");
            int cantidad = escaner.nextInt();

            total_pagar = calcularCompra(opcionSeleccionada, cantidad);

            if (total_pagar > 0) {

                double montoPagado = validarPago(total_pagar, escaner);

                generarBoleta(total_pagar, montoPagado);
            }
        }

        public static double calcularCompra(int opcion, int cantidad) {
            double total_pagar = 0;
            switch (opcion) {
                case 1:
                    total_pagar = 15.90 * cantidad;
                    break;
                case 2:
                    total_pagar = 31.90 * cantidad;
                    break;
                case 3:
                    total_pagar = 31.90 * cantidad;
                    break;
                case 4:
                    total_pagar = 29.90 * cantidad;
                    break;
                case 5:
                    total_pagar = 22.90 * cantidad;
                    break;
                case 6:
                    total_pagar = 22.90 * cantidad;
                    break;
                case 7:
                    total_pagar = 22.90 * cantidad;
                    break;
                case 8:
                    total_pagar = 39.90 * cantidad;
                    break;
                case 9:
                    total_pagar = 22.90 * cantidad;
                    break;
                case 10:
                    total_pagar = 22.90 * cantidad;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

            return total_pagar;
        }

        public static double bolsosYCarteras() {
            Scanner scanner = new Scanner(System.in);
            double total = 0;
            System.out.println("----- BOLSOS Y CARTERAS -----");
            System.out.println("1.- Mochila viajera lila = S/129.90");
            System.out.println("2.- Mochila duna rosa = S/89.90");
            System.out.println("3.- Maleta para viaje negro = S/99.90");
            System.out.println("4.- Canguro moda beige = S/39.90");
            System.out.println("5.- Mochila mini negro = S/59.90");
            System.out.println("6.- Mochila mini floral = S/59.90");
            System.out.println("7.- Crossbody negro = S/59.90");
            System.out.println("8.- Mochila duna negro = S/89.90");
            System.out.println("9.- Maleta para viaje beige = S/99.90");
            System.out.println("10.- Mochila urbana azul = S/83.90");
            System.out.println("Seleccione un producto:");
            int opcion = scanner.nextInt();
            System.out.println("Cantidad:");
            int cantidad = scanner.nextInt();
            switch (opcion) {
                case 1:
                    total = 129.90 * cantidad;
                    break;
                case 2:
                    total = 89.90 * cantidad;
                    break;
                case 3:
                    total = 99.90 * cantidad;
                    break;
                case 4:
                    total = 39.90 * cantidad;
                    break;
                case 5:
                    total = 59.90 * cantidad;
                    break;
                case 6:
                    total = 59.90 * cantidad;
                    break;
                case 7:
                    total = 59.90 * cantidad;
                    break;
                case 8:
                    total = 89.90 * cantidad;
                    break;
                case 9:
                    total = 99.90 * cantidad;
                    break;
                case 10:
                    total = 83.90 * cantidad;
                    break;
                default:
                    System.out.println("OPCION NO VALIDA");
            }
            if (total > 0) {
                double montoPagado = validarPago(total, scanner);
                generarBoleta(total, montoPagado);
            }
            return total;
        }

        public static void accesoriosCabello() {
            Scanner escaner = new Scanner(System.in);
            double total_pagar = 0;
            System.out.println("------ SIFRAH VINCHAS ------");
            menuVinchas();
            System.out.println("Seleccione una opcion:");
            int opcionSeleccionada = escaner.nextInt();
            System.out.println("Ingrese la cantidad a comprar:");
            int cantidad = escaner.nextInt();
            total_pagar = calcularCompraVinchas(opcionSeleccionada, cantidad);
            if (total_pagar > 0) {
                double montoPagado = validarPago(total_pagar, escaner);
                generarBoleta(total_pagar, montoPagado);
            }
        }

        public static void menuVinchas() {
            System.out.println("----- CATALOGO VINCHAS -----");
            System.out.println("1.- Vincha plateada con mariposas y perlas a 16.9");
            System.out.println("2.- Vincha negra con flor y cadena decorativa a 17.9");
            System.out.println("3.- Vincha blanca corazones a 12.9");
            System.out.println("4.- Vincha duo dorado a 14.9");
            System.out.println("5.- Vincha basica plana azul a 16.9");
            System.out.println("6.- Vincha con mariposas multicolor a 10.9");
            System.out.println("7.- Vincha essential nudo a 22.9");
            System.out.println("8.- Vincha slim rosa a 19.9");
            System.out.println("9.- Vincha fantasy dorado a 22.9");
            System.out.println("10.- Vincha bloom lila a 19.9");
        }

        public static double calcularCompraVinchas(int opcion, int cantidad) {
            double total_pagar = 0;
            switch (opcion) {
                case 1:
                    total_pagar = 16.9 * cantidad;break;
                case 2:
                    total_pagar = 17.9 * cantidad;break;
                case 3:
                    total_pagar = 12.9 * cantidad;break;
                case 4:
                    total_pagar = 14.9 * cantidad;break;
                case 5:
                    total_pagar = 16.9 * cantidad;break;
                case 6:
                    total_pagar = 10.9 * cantidad;break;
                case 7:
                    total_pagar = 22.9 * cantidad;break;
                case 8:
                    total_pagar = 19.9 * cantidad;break;
                case 9:
                    total_pagar = 22.9 * cantidad;break;
                case 10:
                    total_pagar = 19.9 * cantidad;break;

                default:
                    System.out.println("Opcion no valida");
            }
            return total_pagar;
        }

        // BAUCHER MISS

        public static double validarPago(double total_pagar, Scanner escaner) {
            double montoPagado;
            do {
                System.out.println("El total a pagar es: S/" + total_pagar);
                System.out.println("Ingrese el monto pagado:");
                montoPagado = escaner.nextDouble();
                if (montoPagado < total_pagar) {
                    System.out.println("Monto insuficiente. Falta: S/" + (total_pagar - montoPagado));
                }
            } while (montoPagado < total_pagar);
            return montoPagado;
        }

        //BOLETA MISS
        public static void generarBoleta(double total_pagar, double montoPagado) {
            double igv = total_pagar * 0.18;
            double subtotal = total_pagar - igv;
            double vuelto = montoPagado - total_pagar;
            System.out.println("------ BOLETA SIFRAH ------");
            System.out.println("Subtotal: S/" + subtotal);
            System.out.println("IGV: S/" + igv);
            System.out.println("Total a pagar: S/" + total_pagar);
            System.out.println("Monto pagado: S/" + montoPagado);
            System.out.println("Vuelto: S/" + vuelto);
        }
    }