package Aula1;

public class BalancoTrimestral {
    public static void main(String[] args) {

        //variáveis de gasto sendo declaradas
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        //soma do trimestre
        int gastosTrimestre = (gastosJaneiro + gastosFevereiro + gastosMarco);

        //impressão de gastos do trimestre
        System.out.println("Gasto total no trimestre: " + gastosTrimestre);

        // variável de média mensal sendo declarada
        double mediaMensal = gastosTrimestre / 3.0;

        //imprmir média mensal
        System.out.println("Valor da média mensal = " + mediaMensal);

    }
}
