import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class JOptionPaneUtils {
    private static List<String> adicionais = new ArrayList<String>();

    public static String lerString(String mensagem) {
        return JOptionPane.showInputDialog(mensagem);
    }
    public static String selecionaSabor(String mensagem){
        List<String> sabores = new ArrayList<String>();
        sabores.add("Morango");
        sabores.add("Creme");
        sabores.add("Chocolate");
        sabores.add("Açaí");
        return (String) JOptionPane.showInputDialog(null, mensagem, "Opção", JOptionPane.INFORMATION_MESSAGE, null, sabores.toArray(), sabores.get(0));
    }
    public static SorveteI adicionaSabor(String sabor, SorveteI sorvete){
        switch(sabor){
            case "Morango":
            sorvete = new MorangoDecorator(sorvete);
            break;
            case "Creme":
            sorvete = new CremeDecorator(sorvete);
            break;
            case "Chocolate":
            sorvete = new ChocolateDecorator(sorvete);
            break;
            case "Açaí":
            sorvete = new AcaiDecorator(sorvete);
            break;
        }
        return sorvete;
    }
    public static String desejaAdicional(String mensagem){
        List<String> opcoes = new ArrayList<String>();
        opcoes.add("Sim");
        opcoes.add("Não");
        return (String) JOptionPane.showInputDialog(null, mensagem, "Opção", JOptionPane.INFORMATION_MESSAGE, null, opcoes.toArray(), opcoes.get(0));
    }
    public static void iniciaAdicionais(){
        adicionais.add("Ovomaltine");
        adicionais.add("Leite Ninho");
        adicionais.add("Granulado");
        adicionais.add("Nutella");
    }
    public static SorveteI adicionaAdicional(SorveteI sorvete, String adicional){
            switch (adicional){
                case "Ovomaltine":
                sorvete = new OvomaltineDecorator(sorvete);
                break;
                case "Leite Ninho":
                sorvete = new LeiteNinhoDecorator(sorvete);
                break;
                case "Granulado":
                sorvete = new GranuladoDecorator(sorvete);
                break;
                case "Nutella":
                sorvete = new NutellaDecorator(sorvete);
            }
            return sorvete;
        }
    public static boolean adicionaisIsEmpty(){
        if(adicionais.isEmpty()) return true;
        else return false;
    }
    public static String selecionaAdicional(String mensagem){
        String adicional = (String) JOptionPane.showInputDialog(null, mensagem, "Opção", JOptionPane.INFORMATION_MESSAGE, null, adicionais.toArray(), adicionais.get(0));
        adicionais.remove(adicional);
        return adicional;
    }
}
