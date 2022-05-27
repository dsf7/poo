import java.time.LocalDate;
import java.util.Date;

public class Cachorro {
    private String nome;
    private String raca;
    private Integer anoNascimento;
    private Double peso;
    private boolean ferido;
    private boolean chip;

    public Cachorro(
            String nome,
            String raca,
            int anoNascimento,
            double peso,
            boolean ferido,
            boolean chip) {
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
        this.peso = peso;
        this.ferido = ferido;
        this.chip = chip;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isFerido() {
        return ferido;
    }

    public boolean isChip() {
        return chip;
    }

    public int idade() {
        return (LocalDate.now().getYear() - anoNascimento);
    }

    public boolean aptoAdocao() {
        return (!isFerido() && peso > 5);
    }

}