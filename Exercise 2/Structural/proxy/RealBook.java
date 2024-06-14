package proxy;

class RealBook implements Book {
 private String content;

 public RealBook() {
     // Simulate loading content from a resource-intensive source
     this.content = loadFromLibrary();
 }

 private String loadFromLibrary() {
     return "Very long and detailed book content...";
 }

 @Override
 public String getContent() {
     return content;
 }
}
