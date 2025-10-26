import java.util.ArrayList;
import java.util.List;

// 1. The Observer Interface
interface Observer {
    void update(String news);
}

// 2. The Subject Interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// 3. The ConcreteSubject
class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String news;

    public void setNews(String news) {
        this.news = news;
        System.out.println("\nNews Agency received a new story: \"" + news + "\". Notifying channels...");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}

// 4. The ConcreteObserver
class NewsChannel implements Observer {
    private String channelName;

    public NewsChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void update(String news) {
        System.out.println("[" + channelName + "] Breaking News: " + news);
    }
}

// 5. The Client
public class ObserverPatternDemo {
    public static void main(String[] args) {
        // Create the subject (the news agency)
        NewsAgency agency = new NewsAgency();

        // Create observers (the news channels)
        NewsChannel bbc = new NewsChannel("BBC");
        NewsChannel cnn = new NewsChannel("CNN");
        NewsChannel reuters = new NewsChannel("Reuters");

        // Register observers with the subject
        agency.registerObserver(bbc);
        agency.registerObserver(cnn);
        agency.registerObserver(reuters);

        // The agency gets a new story, and all registered channels are notified automatically
        agency.setNews("New AI Breakthrough Promises to Change the World");

        // Unregister an observer
        System.out.println("\nCNN unsubscribes from the agency.");
        agency.removeObserver(cnn);

        // The agency gets another story, and only the remaining observers are notified
        agency.setNews("Major Storm Headed for the Coast");
    }
}