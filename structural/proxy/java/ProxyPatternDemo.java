// 1. The Subject Interface
interface Document {
    void display();
}

// 2. The RealSubject
class RealDocument implements Document {
    private String filename;

    public RealDocument(String filename) {
        this.filename = filename;
        // Simulate loading a large document from disk
        System.out.println("Loading document: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Displaying document: " + filename);
    }
}

// Represents a user with a specific role
class User {
    private String role;

    public User(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}

// 3. The Proxy
class DocumentProxy implements Document {
    private RealDocument realDocument;
    private String filename;
    private User user;

    public DocumentProxy(String filename, User user) {
        this.filename = filename;
        this.user = user;
    }

    @Override
    public void display() {
        // Access control check
        if (!"Admin".equals(user.getRole())) {
            System.out.println("Access Denied: User with role '" + user.getRole() + "' cannot view the document.");
            return;
        }

        // Lazy initialization: create the RealDocument only if access is granted
        if (realDocument == null) {
            realDocument = new RealDocument(filename);
        }

        // Delegate the call to the real object
        realDocument.display();
    }
}

// 4. The Client
public class ProxyPatternDemo {
    public static void main(String[] args) {
        User adminUser = new User("Admin");
        User guestUser = new User("Guest");

        // Admin user tries to access the document
        System.out.println("--- Admin User Access ---");
        Document adminProxy = new DocumentProxy("ConfidentialReport.pdf", adminUser);
        adminProxy.display(); // Access will be granted

        System.out.println("\n--- Guest User Access ---");
        // Guest user tries to access the same document
        Document guestProxy = new DocumentProxy("ConfidentialReport.pdf", guestUser);
        guestProxy.display(); // Access will be denied
    }
}
