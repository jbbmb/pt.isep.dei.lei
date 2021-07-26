package ServicoBarragens;

public class Eclusa {
    
    private int comprimento;
    private int largura;
    
    public Eclusa(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setComprimento(int comprimento) {
        try{
            validarComprimento(comprimento);
            this.comprimento = comprimento;
        } catch(IllegalArgumentException e) {
            System.out.println("Comprimento introduzido inválido!");
        }
    }
    
    private void validarComprimento(int comprimento){
        if(comprimento < 0){
            throw new IllegalArgumentException();
        }
    }
    
    public void setLargura(int largura) {
        this.largura = largura;
    }

    public boolean equals(Eclusa eclusa){
        return (this.getComprimento() == eclusa.getComprimento() && this.getLargura() == this.getLargura());
    }
    
}