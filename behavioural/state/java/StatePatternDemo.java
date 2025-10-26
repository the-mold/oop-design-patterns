// 1. The State Interface
interface DocumentState {
    void render();
    void publish();
}

// 2. The Context Class
class Document {
    private DocumentState state;
    private String content;

    public Document() {
        // The document starts in the Draft state
        this.state = new DraftState(this);
        this.content = "Initial content.";
    }

    // The context allows changing the State object at runtime.
    public void setState(DocumentState state) {
        this.state = state;
    }

    public String getContent() {
        return content;
    }

    public void render() {
        this.state.render();
    }

    public void publish() {
        this.state.publish();
    }
}

// 3. ConcreteState Classes
class DraftState implements DocumentState {
    private Document document;

    public DraftState(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering document in Draft state with a watermark: " + document.getContent());
    }

    @Override
    public void publish() {
        System.out.println("Moving document to moderation...");
        document.setState(new ModerationState(document));
    }
}

class ModerationState implements DocumentState {
    private Document document;

    public ModerationState(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering document in Moderation state for review: " + document.getContent());
    }

    @Override
    public void publish() {
        System.out.println("Approving document. Moving to published state...");
        document.setState(new PublishedState(document));
    }
}

class PublishedState implements DocumentState {
    private Document document;

    public PublishedState(Document document) {
        this.document = document;
    }

    @Override
    public void render() {
        System.out.println("Rendering final, published document: " + document.getContent());
    }

    @Override
    public void publish() {
        System.out.println("Action not allowed: Document is already published.");
    }
}

// 4. The Client
public class StatePatternDemo {
    public static void main(String[] args) {
        Document doc = new Document();

        System.out.println("--- Document in Draft State ---");
        doc.render();  // Renders with draft watermark
        doc.publish(); // Moves to Moderation

        System.out.println("\n--- Document in Moderation State ---");
        doc.render();  // Renders for review
        doc.publish(); // Moves to Published

        System.out.println("\n--- Document in Published State ---");
        doc.render();  // Renders final version
        doc.publish(); // Action is denied
    }
}