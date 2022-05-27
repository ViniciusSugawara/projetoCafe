package cafeteria;
import javax.swing.JOptionPane;
import java.util.Random;

public class Cafeteria {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        entrada(c);
        JOptionPane.showMessageDialog(null, "Bem vindo a cafeteria virtual, sr(a) " + c.getNome(), "Boa tarde!", JOptionPane.PLAIN_MESSAGE);
        menuCafe();
    }
    
    public static void entrada(Cliente c){
        c.setNome(JOptionPane.showInputDialog(null, "Bem vindo! Insira seu nome", "Entrada", JOptionPane.INFORMATION_MESSAGE));
    }
    
    public static void pedidoCafe(Cafe c){
        QuantiaLeite[] escolha = { QuantiaLeite.SEM_LEITE, QuantiaLeite.POUCO_LEITE, QuantiaLeite.METADE_XICARA, QuantiaLeite.BASTANTE_LEITE};
        ForcaCafe[] esc = { ForcaCafe.FRACO, ForcaCafe.MEDIO, ForcaCafe.FORTE };
        JOptionPane.showMessageDialog(null, "Voce escolheu pedir um cafezinho simplao :D");
        //c.setNivelPo(JOptionPane.showInputDialog("Insira qual a forca do cafe desejado"));
        c.setForca((ForcaCafe)JOptionPane.showInputDialog(null, "Escolha a forca do cafe", "Forca", JOptionPane.QUESTION_MESSAGE, null, esc, esc[0]));
        //c.setQtdLeite(Double.parseDouble(JOptionPane.showInputDialog("insira qts ml de leite")));
        c.setQuantLeite((QuantiaLeite)JOptionPane.showInputDialog(null, "Escolha a quantia de leite", "Quantia", JOptionPane.QUESTION_MESSAGE, null, escolha, escolha[0]));
        c.setQtdAcucar(Integer.parseInt(JOptionPane.showInputDialog("insira qts colheres de acucar deseja")));  
    }
    
    public static void geraCafe(Cafe c){
        Random r = new Random();
        int valor = r.nextInt(3);
        int outroValor = r.nextInt(4);
        int maisUmValor = r.nextInt(10);
        QuantiaLeite[] QuantiaRand = {QuantiaLeite.SEM_LEITE, QuantiaLeite.POUCO_LEITE, QuantiaLeite.METADE_XICARA, QuantiaLeite.BASTANTE_LEITE}; 
        ForcaCafe[] ForcaRand = { ForcaCafe.FRACO, ForcaCafe.MEDIO, ForcaCafe.FORTE };
        c.setForca(ForcaRand[valor]);
        c.setQuantLeite(QuantiaRand[outroValor]);
        c.setQtdAcucar(maisUmValor);
        JOptionPane.showMessageDialog(null, "O Cafe foi gerado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void menuCafe(){
        String msg = """
                     O que gostaria de fazer hoje?
                     0 = Sair do programa 
                     1 = Pedir cafe simples 
                     2 = Verificar pedido
                     3 = Gerar cafe  """;
        int opc;
        boolean exec = true;
        Cafe c = new Cafe();
        
        
        while(exec){
         opc = Integer.parseInt(JOptionPane.showInputDialog(null, msg, "Boa tarde!", JOptionPane.QUESTION_MESSAGE));
         switch(opc){
              case 0: exec = false; break;
              case 1: pedidoCafe(c); break;
              case 2: JOptionPane.showMessageDialog(null, c.pedido()); break;
              case 3: geraCafe(c); break;
              default: JOptionPane.showMessageDialog(null, "A opcao inserida nao existe! Tente novamente", "Vixe", JOptionPane.ERROR_MESSAGE);
         }
        }
        JOptionPane.showMessageDialog(null, "Obrigado por usar o programa", "Falows", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void menuPagamento(Cliente c){
        c.setPagamento(TiposPagamento.CREDITO);
    }
}
