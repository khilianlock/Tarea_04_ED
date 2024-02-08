package cuentas;

/** Clase cuenta, proporciona funcionalidades de cuentas bancarias
 * 
 * @author Jordi Picalló Villalobos
 */
public class CCuenta {

    /** Método que devuelve el nombre
     * @return Devuelve String del nombre
     */
    public String getNombre() {
        return nombre;
    }

    /** Método que establece un nuevo nombre
     * @param nombre String que establece un nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** Método que devuelve la cuenta
     * @return Devuelve String de la cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /** Método que establece un nuevo número de cuenta
     * @param cuenta String que establece la cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /** Método que devuelve el saldo
     * @return Devuelve double del saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /** Método que establece un nuevo saldo
     * @param saldo double que establece el nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /** Devuelve el tipo de interés
     * @return double con el tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /** Método que establece un nuevo tipo de interés
     * @param tipoInterés double que establece el nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /** Constructor de la clase CCuenta
     * 
     */
    public CCuenta()
    {
    }

    /** Constructor de la clase CCuenta con parámetros de entrada
     * 
     * @param nom String que establece el nombre.
     * @param cue String que establece el número de cuenta.
     * @param sal double que establece el saldo inicial.
     * @param tipo double que establece el tipo de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /** Método que devuelve el saldo actual
     * 
     * @return double con el saldo actual de la cuenta.
     */
    public double estado()
    {
        return getSaldo();
    }

    /** Método que permite hacer ingresos en la cuenta
     * 
     * @param cantidad double con la cantidad a ingresar.
     * @throws Exception lanza excepción si el saldo es negativo.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /** Método que permite retirar dinero de la cuenta
     * 
     * @param cantidad double con la cantidad a retirar.
     * @throws Exception lanza una excepción si la cantidad es negativa.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}