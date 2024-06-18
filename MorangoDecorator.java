public class MorangoDecorator extends SorveteDecorator{
    MorangoDecorator(SorveteI sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return "Sorvete de morango";
    }
    @Override
    public double getPreco() {
        return 20;
    }
}
