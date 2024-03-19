
package calculadora;

public class Calculo {
    double numero1;
    double numero2;
    String operador;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    
    public double resultado (){
        double resultado;
        resultado=0;
        
        switch (this.operador){
            case "+":
            resultado = this.numero1+this.numero2;
            case "-":
            resultado = this.numero1-this.numero2;
            case "*":
            resultado = this.numero1*this.numero2;
            case "/":
            resultado = this.numero1/this.numero2;
        }
        return resultado;
        
    }
    
    
}
