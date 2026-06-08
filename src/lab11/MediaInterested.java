package lab11;

public class MediaInterested implements Observer {
    private String subscriberName;

    public MediaInterested(String name) {
        this.subscriberName = name;
    }

    @Override
    public void update(String message) {
        IO.println("Salut " + subscriberName + ", notificare noua: " + message);
    }
}