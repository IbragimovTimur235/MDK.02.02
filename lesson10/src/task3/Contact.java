package task3;

public abstract class Contact {
    protected final String name;

    protected Contact(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sendMessage();

    public abstract void print();
}