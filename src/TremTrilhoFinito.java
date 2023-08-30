import java.util.Scanner;

class TremTrilhoFinito extends Trem {
    private int limiteMinimo;
    private int limiteMaximo;

    public TremTrilhoFinito(int limiteMinimo, int limiteMaximo, int posicaoInicial) {
        super(posicaoInicial);
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
    }

    @Override
    public void mover(String direcao) {
        int novaPosicao = posicao;

        if (direcao.equals("ESQUERDA")) {
            novaPosicao--;
        } else if (direcao.equals("DIREITA")) {
            novaPosicao++;
        }

        if (novaPosicao >= limiteMinimo && novaPosicao <= limiteMaximo) {
            posicao = novaPosicao;
        }
    }
}