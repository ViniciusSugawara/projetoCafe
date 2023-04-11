package br.com.ProjetoCafe;
public class Cafe {
    private int qtdPo;
    private int qtdAcucar;
    private double qtdLeite;
    private String[] qtLeite = {"Sem leite", "Pouco leite", "Metade da xicara", "3/4 da xicara"};
    private String nivelDoPo;
    private boolean leite;
    private boolean acucar;
    private TiposXicara tipo;
    private QuantiaLeite quantLeite;
    private ForcaCafe forca;
    
    public int getQtdPo() { return qtdPo;}
    public void setQtdPo(int qtdPo) { this.qtdPo = qtdPo; }

    public int getQtdAcucar() { return qtdAcucar; }
    public void setQtdAcucar(int qtdAcucar) { this.qtdAcucar = qtdAcucar; }

    public double getQtdLeite() { return qtdLeite; }
    public void setQtdLeite(double qtdLeite) { this.qtdLeite = qtdLeite; }

    public String getNivelPo() { return nivelPo; }
    public void setNivelPo(String nivelPo) { this.nivelPo = nivelPo; }

    public boolean isLeite() { return leite; }
    public void setLeite(boolean leite) { this.leite = leite; }

    public boolean isAcucar() { return acucar; }
    public void setAcucar(boolean acucar) { this.acucar = acucar; }

    public TiposXicara getTipo() { return tipo; }
    public void setTipo(TiposXicara tipo) { this.tipo = tipo; }
    
    public QuantiaLeite getQuantLeite() { return quantLeite; }
    public void setQuantLeite (QuantiaLeite quantLeite){ this.quantLeite = quantLeite; }
    
    public String[] getQtLeite(){ return qtLeite; }
    public void setQtLeite(String[] qtLeite){ this.qtLeite = qtLeite; }
    
    public ForcaCafe getForca(){ return forca; }
    public void setForca(ForcaCafe forca){ this.forca = forca; }
    
    public String convertaQuantLeite(){
        return switch (quantLeite) {
            case SEM_LEITE -> "sem leite";
            case POUCO_LEITE -> "pouco leite";
            case METADE_XICARA -> "leite ate a metade da xicara";
            default -> "bastante leite";
        };
    }
    
    public String convertaForca(){
        return switch(forca) {
            case FRACO -> "fraco";
            case MEDIO -> "medio";
            default -> "forte";
        };
    }
    
    //Construtor simples
    Cafe(String nivelPo, double qtdLeite, int qtdAcucar){
    this.nivelPo = nivelPo;
    this.qtdLeite = qtdLeite;
    this.qtdAcucar = qtdAcucar;
    }
    
    //Construtor default
    Cafe(){}
    
    public String pedido(){
     return ("Cafe " + convertaForca() + " com " 
             + qtdAcucar + " Colheres de acucar, e " 
      //       + qtdLeite + "ml de leite ou "
             + convertaQuantLeite());
    }
    
}
