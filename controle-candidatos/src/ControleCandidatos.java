import java.util.concurrent.ThreadLocalRandom;

public class ControleCandidatos {
    
static double salarioBase = 2000.0;

    public static void main(String[] args) throws Exception {
        
        try {
            analisarCandidato(2000, salarioBase);
            selecionarCandidato();
            imprimirSelecionados();

            String [] candidatos = { "Carlos", "Paulo", "Pedro", "Ana", "Maria"};
            for( String candidato : candidatos) {
                entrandoEmContato(candidato);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        
        do {
            System.out.println("Tentativa " + tentativasRealizadas + " de contato com o candidato " + candidato);
            atendeu = ThreadLocalRandom.current().nextInt(3) == 1;

            if (atendeu) {
                System.out.println("Contato realizado com sucesso com o candidato " + candidato + " na tentativa " + tentativasRealizadas);
                continuarTentando = false;
            } else {
                System.out.println("O candidato " + candidato + " não atendeu a ligação");
                tentativasRealizadas++;
            }
        } while (continuarTentando && tentativasRealizadas <= 3);
    }

    static void imprimirSelecionados() {
        String [] candidatosSelecionados = { "Carlos", "Paulo", "Pedro", "Ana", "Maria"};

        System.out.println("Imprimindo os candidatos selecionados");

        for (String candidato : candidatosSelecionados) {
            System.out.println("Candidato selecionado: " + candidato);
        }
    }

    static void selecionarCandidato() {
        String [] candidatos = { "Carlos", "Paulo", "Pedro", "Ana", "Maria", "João", "Júlia", "Fabio", "Daniele" };
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            double pretensao = valorPretendido();            

            System.out.println("O candidato " + candidatos[candidatoAtual] + " solicitou este valor de salário: " + pretensao);

            if (salarioBase >= pretensao) {
                System.out.println("O Candidato " + candidatos[candidatoAtual] + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            } else {
                System.out.println("O Candidato " + candidatos[candidatoAtual] + " NÃO foi selecionado para a vaga.");
            }
            candidatoAtual++;
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido, double salarioMinimo) {
        if (salarioPretendido < salarioMinimo) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioPretendido > salarioMinimo) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}