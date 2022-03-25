public class Calculadora {
    String marca;
    boolean esCientifica;
    double primerValor;
    double segundoValor;

    public Calculadora() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEsCientifica() {
        return esCientifica;
    }

    public void setEsCientifica(boolean esCientifica) {
        this.esCientifica = esCientifica;
    }

    public double getPrimerValor() {
        return primerValor;
    }

    public void setPrimerValor(double primerValor) {
        this.primerValor = primerValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public void setSegundoValor(double segundoValor) {
        this.segundoValor = segundoValor;
    }

    public Calculadora(String marca, boolean esCientifica) {
        this.marca = marca;
        this.esCientifica = esCientifica;
    }

    public double suma(){
        double suma = primerValor + segundoValor;
        return suma;
    }
    public void showSuma(double suma){
        System.out.println("Suma de " + primerValor + " + " + segundoValor + " = " + suma);
    }

    public double resta(){
        double resta = primerValor - segundoValor;
        return resta;
    }
    public void showResta(double resta){
        System.out.println("Resta de " + primerValor + " - " + segundoValor + " = " + resta);
    }

    public double multiplicacion(){
        double multiplicacion = primerValor * segundoValor;
        return multiplicacion;
    }
    public void showMult(double multiplicacion){
        System.out.println("Multiplicacion de " + primerValor + " * " + segundoValor + " = " + multiplicacion);
    }

    public double division() {
        if (segundoValor == 0) {
            return 0.0;
        } else {
            return primerValor / segundoValor;
        }
    }

    public String elevarAPotencia() {
        if (esCientifica == false) {
            return "Su calculadora no es cientifica, no puede realizar esta operacion";
        } else {
            return  "" + Math.pow(primerValor, segundoValor);
        }
    }

    public String toString(){
        if(esCientifica == false){
            return "La calculadora es de marca " + marca + " y no es cientifica";
        } else {
            return "La calculadora es de marca " + marca + " y si es cientifica";
        }
    }
}
