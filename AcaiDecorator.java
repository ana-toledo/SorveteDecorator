public class AcaiDecorator extends SorveteDecorator{
    AcaiDecorator(SorveteI sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return "Açaí";
    }
    @Override
    public double getPreco() {
        return 25;
    }
}

