package IteratorPattern;

public class NotificationBar {
    notificationCollection nc;

    NotificationBar(notificationCollection nc)
    {
        this.nc = nc;
    }

    public void printNot()
    {
        notificationIterator iter = nc.getIterator();

        while(iter.hasNext())
        {
            Notification n = (Notification)iter.next();
            n.print();
        }
    }
}
