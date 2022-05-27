import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Cachorro caramelo = new Cachorro(
                "Caramelo I",
                "vira-lata",
                2010,
                 4.9,
            false,
        false);

        System.out.println(
        "Esses são os dados do cachorro " + caramelo.getNome() +
        ":\n• Raça: " + caramelo.getRaca() + "\n• Idade aproximada: " + caramelo.idade() +
        " anos \n• Peso: " + caramelo.getPeso() + " kilos");

        if (caramelo.isFerido() == true) {
            System.out.println("• ESTÁ machucado ☹︎");
        } else {
            System.out.println("• BOAS condições físicas ☻");
        }

        if (caramelo.isChip() == true) {
            System.out.println("• POSSUI chip de identificação");
        } else {
            System.out.println("• NÃO possui chip de identificação");
        }

        if (caramelo.aptoAdocao() == true) {
            System.out.println("• ADOÇÃO liberada");
        } else {
            System.out.println("• NÃO pode ser adotado no momento (precisa tratar os ferimentos e / ou ganhar peso antes)");
        }

    }
}

