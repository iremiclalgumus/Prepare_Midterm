
//Linked List için Node oluşturma;

public class Node {
    int data; //Node'un içindeki sayı ve türü
    Node next; //Bir sonraki node u işaret edecek ok

    public Node (int d){//constructor(Kurucu metot),temel amacı oluşan nesnenin ilk durumunu hazırlamak
      data = d; //node un o an içinde bulunan değer
      next=null; //node dan sonrası boş çünkü tek node

    }
}
