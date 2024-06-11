public class ChocolateDecorator extends SorveteDecorator{
    ChocolateDecorator(Sorvete sorvete){
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

