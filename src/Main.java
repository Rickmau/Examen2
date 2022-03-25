public class Main {
    public static void main(String[] args) {
        Calculadora basica = new Calculadora();
        basica.setMarca("patito");
        basica.setEsCientifica(false);
        basica.setPrimerValor(294.9);
        basica.setSegundoValor(0.0);

        basica.showSuma(basica.suma());
        basica.showResta(basica.resta());
        basica.showMult(basica.multiplicacion());
        System.out.println(basica.division());
        System.out.println(basica.elevarAPotencia());
        System.out.println(basica.toString());

        Calculadora cientifica = new Calculadora();
        cientifica.setMarca("casio");
        cientifica.setEsCientifica(true);
        cientifica.setPrimerValor(45.83);
        cientifica.setSegundoValor(13.6);

        cientifica.showSuma(basica.suma());
        cientifica.showResta(basica.resta());
        cientifica.showMult(basica.multiplicacion());
        System.out.println(cientifica.division());
        System.out.println(cientifica.elevarAPotencia());
        System.out.println(cientifica.toString());


    }
}
