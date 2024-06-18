public class NutellaDecorator extends SorveteDecorator{

    public NutellaDecorator(SorveteI sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Nutella";
    }
    @Override
    public double getPreco() {
        return super.getPreco() + 2;
    }

}
