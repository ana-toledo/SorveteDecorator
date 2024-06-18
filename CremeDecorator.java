public class CremeDecorator extends SorveteDecorator{
    CremeDecorator(SorveteI sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return "Sorvete de creme";
    }
    @Override
    public double getPreco() {
        return 20;
    }
}

