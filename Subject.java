import java.util.ArrayList;

public class Subject implements ISubject{

    private ArrayList<Observer> observers = new ArrayList<>();
    private String variavel;

    public String getVariavel() {
        return this.variavel;
    }
    public void setVariavel(String variavel) {
        this.variavel = variavel;
        notifyObservers();
    }

    @Override
    public void register(Observer obs) {
        if(!observers.contains(obs)) observers.add(obs);
    }

    @Override
    public void unregister(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(this.variavel);
        }
    }
    
}