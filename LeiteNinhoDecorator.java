public class LeiteNinhoDecorator extends SorveteDecorator{

    public LeiteNinhoDecorator(Sorvete sorvete){
        super(sorvete);
    }
    @Override
    public String getDescricao() {
        return super.getDescricao() + "\n+ Leite Ninho";
    }
    @Override
    public double getPreco() {
        return super.getPreco() + 0.5;
    }

}
