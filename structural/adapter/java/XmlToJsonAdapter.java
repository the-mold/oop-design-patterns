package structural.adapter.java;

public class XmlToJsonAdapter implements JsonData {
  private XmlService xmlService;

  public XmlToJsonAdapter(XmlService xmlService) {
    this.xmlService = xmlService;
  }

  @Override
  public String getJson() {
    String xml = xmlService.getXml();
    // In a real application, you would use a proper library to convert XML to JSON.
    // This is a simplified conversion for demonstration purposes.
    System.out.println("Adapter: Converting XML ('" + xml + "') to JSON...");
    String json = "{\n" +
            "  \"name\": \"John Doe\",\n" +
            "  \"age\": 30\n" +
            "}";
    return json;
}
}
