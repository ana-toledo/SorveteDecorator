public class ChocolateDecorator extends SorveteDecorator{
    ChocolateDecorator(SorveteI sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return "Sorvete de chocolate";
    }
    @Override
    public double getPreco() {
        return 20;
    }
}

