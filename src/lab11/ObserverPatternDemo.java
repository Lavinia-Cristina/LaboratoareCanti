package lab11;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        YouTubeChannel canalInfo = new YouTubeChannel("Tech IT");

        MediaInterested abonat1 = new MediaInterested("Ion");
        MediaInterested abonat2 = new MediaInterested("Maria");

        canalInfo.addObserver(abonat1);
        canalInfo.addObserver(abonat2);

        canalInfo.uploadVideo("Introducere in Java Streams");

        canalInfo.removeObserver(abonat2);
        canalInfo.uploadVideo("Design Pattern Observer Explicat");
    }
}