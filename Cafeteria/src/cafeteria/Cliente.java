package cafeteria;
public class Cliente { 
    private String nome;
    private TiposPagamento pagamento;
    
    public String getNome() { return nome; }
    public void setNome(String nome){ this.nome = nome; }
    
    public TiposPagamento getPagamento () { return pagamento; }
    public void setPagamento(TiposPagamento pagamento){ this.pagamento = pagamento; }
}
