import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Sorvete sorveteDoCliente = new Sorvete();
        sorveteDoCliente = JOptionPaneUtils.adicionaSabor(JOptionPaneUtils.selecionaSabor("Seja bem vindo! Por favor, escolha o sabor de seu sorvete."), sorveteDoCliente);
        int n = 0;
        JOptionPaneUtils.iniciaAdicionais();
        while(n==0){
            if(("Sim")==(JOptionPaneUtils.desejaAdicional("Deseja um adicional?"))){
                sorveteDoCliente = JOptionPaneUtils.adicionaAdicional(sorveteDoCliente, JOptionPaneUtils.selecionaAdicional("Escolha seu adicional"));
                if(JOptionPaneUtils.adicionaisIsEmpty()){
                    JOptionPane.showMessageDialog(null, "Todos os adicionais possíveis foram selecionados");
                    n=1;
                }
            }else{
               n=1;
            }
        }
        JOptionPane.showMessageDialog(null, getMensagem(sorveteDoCliente));
    }
    static private String getMensagem(Sorvete sorvete){
        String mensagem = "Pedido:\n";
        mensagem += sorvete.getDescricao();
        mensagem += "\n\n";
        mensagem += "Preço total:\n";
        mensagem += sorvete.getPreco() + " R$";
        return mensagem;
    }
}
