public class Main {

    public static void main(String[] args) {
        UsuarioJogo usuario1 = new UsuarioJogo("Daniel", "dsf");
        UsuarioJogo usuario2 = new UsuarioJogo("Issao", "iss");
        System.out.println("O nome do usuário 1 é: " + usuario1.getNome() + " e o nickname usado é: " + usuario1.getNick());
        System.out.println("O nome do usuário 2 é: " + usuario2.getNome() + " e o nickname usado é: " + usuario2.getNick());
        usuario1.aumentarPontuacao(1);
        System.out.println("Usuário " + usuario1.getNick() + " tem " + usuario1.getPontuacao() + " ponto(s)");
        usuario1.aumentarPontuacao(2);
        System.out.println("Usuário " + usuario1.getNick() + " tem " + usuario1.getPontuacao() + " ponto(s) e atualmente está no nível " + usuario1.getNivel());
        usuario1.bonus(2);
        System.out.println("Usuário " + usuario1.getNick() + " dobrou seus pontos após o bônus e tem agora " + usuario1.getPontuacao() + " ponto(s)");
        usuario2.subirNivel();
        System.out.println("Usuário " + usuario2.getNick() + " tem " + usuario2.getPontuacao() + " ponto(s) e atualmente está no nível " + usuario2.getNivel());
        usuario2.subirNivel();
        usuario2.aumentarPontuacao(5);
        System.out.println("Usuário " + usuario2.getNick() + " tem " + usuario2.getPontuacao() + " ponto(s) e atualmente está no nível " + usuario2.getNivel());
        usuario1.subirNivel();
        System.out.println("Usuário " + usuario1.getNick() + " tem " + usuario1.getPontuacao() + " ponto(s) e atualmente está no nível " + usuario1.getNivel());
    }
}
