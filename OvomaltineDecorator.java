public class OvomaltineDecorator extends SorveteDecorator{

    public OvomaltineDecorator(Sorvete sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Ovomaltine";
    }
    @Override
    public double getPreco() {
        return super.getPreco() + 1;
    }

}
