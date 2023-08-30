class TremTrilhoInfinito extends Trem {
    public TremTrilhoInfinito(int posicaoInicial) {
        super(posicaoInicial);
    }

    @Override
    public void mover(String direcao) {
        if (direcao.equals("ESQUERDA")) {
            posicao--;
        } else if (direcao.equals("DIREITA")) {
            posicao++;
        }
    }
}