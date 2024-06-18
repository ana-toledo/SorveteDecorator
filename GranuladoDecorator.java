public class GranuladoDecorator extends SorveteDecorator{

    public GranuladoDecorator(SorveteI sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Granulado";
    }
    @Override
    public double getPreco() {
        return super.getPreco() + 0.5;
    }

}
