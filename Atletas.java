package desafios.atletas;
import java.util.Scanner;
import java.util.Locale;

public class Atletas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
      Scanner scan = new Scanner(System.in);
      int quantidadeAtletas;
      String nome;
      String sexo;
      double altura;
      double peso;
      double somaPeso = 0;
      double pesoMedio;
      double maisAlto = 0;
      String nomeMaisAlto = "";
      int homens = 0;
      int mulheres = 0;
      double porcentHomens;
      double porcentMulheres;
      double somaAlturaF = 0;
      double mediaAlturaF = 0;
      int quantidadeMulheres = 0;

        System.out.print("Qual a quantidade de atletas? ");
        quantidadeAtletas = scan.nextInt();

        for (int i = 0; i < quantidadeAtletas; i++){
            scan.nextLine();
            System.out.println("Digite os dados do atleta numero " + (i+1) + ":") ;
            System.out.print("Nome: ");
            nome = scan.nextLine();
            System.out.print("Sexo: ");
            sexo = scan.nextLine();
            while (!sexo.equals("F") && !sexo.equals("M")){
                System.out.print("Favor digitar [F] ou [M]: ");
                sexo = scan.nextLine();
            }
            if (sexo.equals("M")){
                homens++;
            }else{
                mulheres++;
            }
            System.out.print("Altura: ");
            do{
                altura = scan.nextDouble();
                if (altura <= 0) {
                    System.out.print("Valor inválido! Favor, digitar um valor positivo: ");
                }else{
                    if (altura > maisAlto){
                        maisAlto = altura;
                        nomeMaisAlto = nome;
                    }
                    if (sexo.equals("F")){
                        somaAlturaF += altura;
                    }
                }
            } while (altura <= 0);

            System.out.print("Digite o peso: ");
            do {
                peso = scan.nextDouble();
                if (peso <= 0) {
                    System.out.println("Valor invalido! Favor digitar um valor positivo:");
                } else {
                    somaPeso += peso;
                }
            }while (peso <= 0);
        }
      scan.close();
        pesoMedio = somaPeso / quantidadeAtletas;
        porcentHomens = ((double)homens / quantidadeAtletas)*100;
        porcentMulheres = ((double)mulheres / quantidadeAtletas)*100;

        System.out.println("RELATÓRIO");
        System.out.printf("Peso médio dos atletas: %.2f%n", pesoMedio);
        System.out.println("Atleta mais alto: " + nomeMaisAlto);
        System.out.printf("Porcentagem de homens: %.1f %%%n", porcentHomens);

        if (mulheres == 0){
            System.out.print("Não há mulheres cadastradas");
        }else{
            mediaAlturaF = somaAlturaF / mulheres;
            System.out.print("Altura média das mulheres: " + mediaAlturaF);
        }
    }

}
