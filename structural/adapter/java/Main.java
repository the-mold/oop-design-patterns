package structural.adapter.java;

public class Main {

    public static void main(String[] args) {
        // legacy service that produces XML.
        XmlService legacyService = new XmlService();

        // create an adapter to make the legacy service compatible with our application.
        JsonData adapter = new XmlToJsonAdapter(legacyService);

        // The application can now use the adapter as if it were a native JsonData source.
        processJsonData(adapter);
    }

    // This method represents the part of our application that processes JSON data.
    public static void processJsonData(JsonData jsonData) {
        System.out.println("Application: Processing received data...");
        System.out.println(jsonData.getJson());
    }
}
