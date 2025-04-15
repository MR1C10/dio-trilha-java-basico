package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

//        analisarCandidato(1900.00);
//        analisarCandidato(2200.00);
//        analisarCandidato(2000.00);
        selecaoDeCandidato();
    }

    // Metodo de analise do salario pretendido dos candidatos
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATO");
        }
    }

    // Metodo para fazer a seleção dos candidatos
    static void selecaoDeCandidato() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("\nO candidato: " + candidato + " Solicitou este valor de salário: %.2f", salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("\nO candidato: " + candidato + " foi selecionado para a vaga!");
                candidatoSelecionado++;
            }

            candidatoAtual++;
        }
//        System.out.println(candidatoSelecionado);
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void mdksa(){
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
    }

}

