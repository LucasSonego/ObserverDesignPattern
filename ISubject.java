public interface ISubject{
    public void register(Observer obs);
    public void unregister(Observer obs);

    public void notifyObservers();
}