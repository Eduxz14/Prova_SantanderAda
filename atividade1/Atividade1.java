import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {

        int meses, i;
        double valorEmprestimo, saldoDevedor, taxa_juros_emprestimo, jurosMes, amortizacao, jurosMensal,
                saldo_devedor_atual, parcelaMensal;

        double totalPago, totalJuros, totalAmortizacao;
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do emprestimo? ");
        valorEmprestimo = sc.nextDouble();

        System.out.print("taxa de juros em porcentagem por favor: ");
        taxa_juros_emprestimo = sc.nextDouble();

        System.out.print("Em quantos meses ficou o pagamento? ");
        meses = sc.nextInt();

        taxa_juros_emprestimo = taxa_juros_emprestimo / 100;

        saldoDevedor = valorEmprestimo;
        amortizacao = saldoDevedor / meses;

        saldo_devedor_atual = saldoDevedor - amortizacao;

        for (i = 1; i < meses; i++) {
            totalAmortizacao = amortizacao;

            jurosMensal = saldoDevedor * taxa_juros_emprestimo;
            parcelaMensal = taxa_juros_emprestimo * amortizacao;

            System.out.println(meses + jurosMensal + parcelaMensal);
        }

        System.out.println("\nAqui estão os totais\n" + "Valor total pago: " + "Total de juros: "
                + "total de amortizacao:" );
        sc.close();

    }
}
