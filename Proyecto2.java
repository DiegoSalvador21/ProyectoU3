public class Lexer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new probar().setVisible(true);
    }
    
}

public enum Tipo {
    NUMERO("^\\d+$"),
    OPERADOR_BINARIO("[*|/|+|-|=]$"),
    PALABRAS_RESERVADAS("(INICIO|FIN|ESCRIBIR|LEER|MIENTRAS|FINMQ|PARA|FINPARA|SI|SINO|CASE|BREAK|DEFAULT|"
            + "ENTERO|CADENA|FLOAT)$"),
    IDENTIFICADORES("^&[A-Za-z]+$"),
    SIMBOLO("[;]$");

    public final String patron;

    Tipo(String s) {
        this.patron = s;

    }
}

public class Token {

    private Tipo tipo;
    private String valor;

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

}

