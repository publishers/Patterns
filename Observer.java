package ObserverPattern;

/**
 * Created by sergey on 23.05.16.
 */

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
