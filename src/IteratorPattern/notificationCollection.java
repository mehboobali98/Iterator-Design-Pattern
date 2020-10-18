package IteratorPattern;

import java.util.ArrayList;

public interface notificationCollection {
    notificationIterator getIterator();
    void addNotification(Notification n);
    void removeNotification(Notification n);

}

class myCollection implements notificationCollection{
    ArrayList<Notification> n_list = new ArrayList<>();

    public notificationIterator getIterator()
    {
        return new myIterator(n_list);
    }

    public void addNotification(Notification n)
    {
        this.n_list.add(n);
    }

    public void removeNotification(Notification n)
    {
        this.n_list.remove(n);
    }
}
