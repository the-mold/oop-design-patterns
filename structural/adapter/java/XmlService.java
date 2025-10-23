package structural.adapter.java;

public class XmlService {
  public String getXml() {
      // In a real scenario, this might come from a database or another service.
      return "<data><name>John Doe</name><age>30</age></data>";
  }
}
