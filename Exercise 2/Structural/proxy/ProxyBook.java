package proxy;

class ProxyBook implements Book {
 private RealBook realBook;

 @Override
 public String getContent() {
     if (realBook == null) {
         realBook = new RealBook();
     }
     return realBook.getContent();
 }
}
