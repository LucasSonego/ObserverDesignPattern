public class Main{
    public static void main(String[] args) {
        Subject sub = new Subject();

        Observer obs1 = new Observer("Observer 1");
        Observer obs2 = new Observer("Observer 2");
        Observer obs3 = new Observer("Observer 3");

        obs1.setSubject(sub);
        obs2.setSubject(sub);
        obs3.setSubject(sub);

        sub.setVariavel("Just keep me where the light is...");
    }
}