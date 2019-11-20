public interface IObserver{
    public void update(String msg);
    public void setSubject(Subject sub);
}