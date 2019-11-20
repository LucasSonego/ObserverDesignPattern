public class Observer implements IObserver{

    private String nome, variavel;

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVariavel() {
        return this.variavel;
    }
    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }

    public Observer(String nome){
        setNome(nome);
    }

    @Override
    public void update(String variavel) {
        setVariavel(variavel);
        System.out.println("Variavel de " + this.nome + " atualizada para " + variavel);
    }

    @Override
    public void setSubject(Subject sub) {
        sub.register(this);
    }
    
}