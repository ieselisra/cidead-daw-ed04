package cidead.daw.ed04.cuentas;

/**
 * <p>Cuenta. Incluye Nombre, Numero Cuenta, Saldo y Tipo interes</p>
 * */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * <p>Constructor por defecto</p>
     */
    public CCuenta() {
    }

    /**
     * <p>Constructor con el que crear y configurar una Cuenta</p>
     *
     * @param nom  Nombre del titular
     * @param cue  Numero de cuenta
     * @param sal  Saldo inicial
     * @param tipo Tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInteres = tipo;
    }

    /**
     * <p>Devuelve el saldo actual</p>
     */
    public double estado() {
        return saldo;
    }

    /**
     * <p>Suma una cantidad al saldo</p>
     *
     * @throws Exception cuando cantidad es negativo
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * <p>Resta una cantidad al saldo de la cuenta</p>
     *
     * @throws Exception cuando <b>cantidad</b> es 0 o menos,
     *                   o mayor al <b>saldo de la cuenta</b>
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * <p>Obtener nombre del titular</p>
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * <p>Establecer el nombre del Titular</p>
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * <p>Obtener el numero de cuenta</p>
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * <p>Establecer el numero de cuenta</p>
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * <p>Obtener saldo actual de la cuenta</p>
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * <p>Establecer el saldo de la cuenta</p>
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * <p>Obtener tipo de interes</p>
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * <p>Establecer el tipo de interes</p>
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
