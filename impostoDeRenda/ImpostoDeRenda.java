package desafios.impostoDeRenda;
import java.util.Scanner;
import java.util.Locale;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       double salarioAnual;
       double mediaMensal;
       double ganhoDeCaptal;
       double impostoSalario;
       double impostoCapital;
       double gastosMedicos;
       double gastosEducacionais;
       double gastosTotais;
       double impostosTotais;
       double desconto;
       double prestacaoDeServicos;
       double impostoServicos;
       double valorDevido;

       System.out.println("Renda anual com salário:");
       salarioAnual = sc.nextDouble();
       System.out.println("Renda anual com prestação de serviços");
       prestacaoDeServicos = sc.nextDouble();
       System.out.println("Renda anual com ganho de capital: ");
       ganhoDeCaptal = sc.nextDouble();
       System.out.println("Gastos médicos");
       gastosMedicos = sc.nextDouble();
       System.out.println("Gastos educacionais");
       gastosEducacionais = sc.nextDouble();
       System.out.println();

        mediaMensal = salarioAnual /12;

        if (mediaMensal < 3000.00){
            impostoSalario = 0;
        } else if (mediaMensal >= 3000.00 && mediaMensal < 5000.00){
            impostoSalario = 0.10 * salarioAnual;
        }else {
            impostoSalario = 0.20 * salarioAnual;
        }

        if (ganhoDeCaptal <= 0){
            impostoCapital = 0;
        }else{
            impostoCapital = 0.20 * ganhoDeCaptal;
        }

        System.out.println();
        impostosTotais = impostoSalario + impostoCapital;
        gastosTotais = gastosEducacionais + gastosMedicos;
        if (gastosTotais <= 0.3 * impostosTotais){
            desconto = gastosTotais;
            valorDevido = impostosTotais - desconto;

        }else{
            desconto = 0.3 * impostosTotais;
            valorDevido = impostosTotais - desconto;
        }
        if (prestacaoDeServicos > 0){
            impostoServicos = prestacaoDeServicos * 0.15;
        }else{
            impostoServicos = 0;
        }

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA:");

        System.out.println("Imposto sobre salário: " + impostoSalario);
        System.out.println("Imposto sobre serviços: " + impostoServicos);
        System.out.println("Imposto sobre ganho de capital: " + impostoCapital);
        System.out.println();

        System.out.println("DEDUÇÕES");
        System.out.println("Máximo dedutível: " + 0.3 * impostosTotais);
        System.out.println("Gastos dedutíveis: " + gastosTotais);
        System.out.println();

        System.out.println("RESUMO:");
        System.out.println("Imposto bruto total: " + impostosTotais);
        System.out.println("Abatimento: " + desconto);
        System.out.println("Imposto devido: " + valorDevido);

    }
}