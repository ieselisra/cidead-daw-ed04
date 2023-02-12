package cidead.daw.ed04.cuentas;

/**
 * <p>Clase principal de la aplicacion</p>
 */
public class Main {
    /**
     * <p>Metodo lanzador de la aplicacion</p>
     * @param args args
     */
    public static void main(String[] args) {
        /*Inicializamos cuenta*/
        CCuenta cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        /*para ejemplo pasaremos "0" (ingresar/ retirar) */
        float cantidad = 0.0f;

        /*Invocamos operativa_cuenta*/
        operativa_cuenta(cuenta1, cantidad);
    }

    /**
     * <p>Metodo que el que operar sobre una cuenta</p>
     *
     * <p>Sustituiremos las cantidades "hardcoded" por la parametrizadas.</p>
     *
     * <p>Posible mejora: Se podria incluir un variable "operador" para saber si
     * se trata de un ingreso o una retirada</p>
     *
     * @param cuenta1  Cuenta con la operar
     * @param cantidad Cantidad a retirar e ingresar
     */
    public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {

        /*Mostrar estado de cuenta por consola*/
        double saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        /*Intentar retirar cantidad al saldo*/
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }

        /*Intentar sumar la cantidad al saldo*/
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}