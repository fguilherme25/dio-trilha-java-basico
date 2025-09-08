public class UsarAparelho {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Usando funcionalidades de música
        iphone.tocar();
        iphone.selecionarMusica("Imagine - John Lennon");
        iphone.pausar();

        // Usando funcionalidades de navegador
        iphone.exibirPagina("www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        // Usando funcionalidades de telefone
        iphone.ligar("123-456-7890");
        iphone.atender();
        iphone.iniciarCorreioVoz();
    }
}
