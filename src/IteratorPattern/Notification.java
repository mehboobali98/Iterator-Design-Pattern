package IteratorPattern;

public class Notification {
    String name;

    Notification(String name)
    {
        this.name = name;
    }

    public void print()
    {
        System.out.println(this.name);
    }
}
