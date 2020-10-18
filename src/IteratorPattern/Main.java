package IteratorPattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Notification n1 = new Notification("2 Exams are left!");
        Notification n2 = new Notification("OOAD on Monday!");
        Notification n3 = new Notification("Mass com on Thursday!");

        notificationCollection nc = new myCollection();
        nc.addNotification(n1);
        nc.addNotification(n2);
        nc.addNotification(n3);

        NotificationBar nb = new NotificationBar(nc);
        nb.printNot();
    }
}
