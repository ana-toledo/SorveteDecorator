public abstract class SorveteDecorator implements SorveteI{
    private SorveteI sorvete;

    public SorveteDecorator(SorveteI sorvete){
        this.sorvete = sorvete;
    }
    public String getDescricao() {
        return sorvete.getDescricao();
    }
    public double getPreco() {
        return sorvete.getPreco();
    }
}
