public class LinkedList {
    Node head; //ilk node, head her metodun ulaşması için main in dışında yazılır.

    //Eğer head boşsa true,değilse false döner. Listenin varlığını kontrol eder.
    //return
    public boolean isEmpty() {
        return head == null;
    }


    public static void main(String[]args){

        //Değişkenlerin türü önceki classtan yardım alınarak Node olarak yazılır
        //yeni nesne(object) oluşturmak için new kullanırız
        // Node(10) kalıbı Node clasındaki constructor ı çalıştırır
        Node firstNode= new Node(10);
        Node secondNode= new Node(20);
        Node thirdNode= new Node(30);

        //Linked list i oluşturuyoruz
        LinkedList myList = new LinkedList();


        //Listede henüz eleman olmadığı için true dönecek
        System.out.println("Is The List Empty? " + myList.isEmpty());

        //Linked list'imizin ilk elemanını(head),first node yapıyoruz
        myList.head=firstNode;

        //diğer elemanları bağlıyoruz
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = null;

        System.out.println("3 nodes successfully connected!");

        //Listede elemanlar olduğu için false dönecek
        System.out.println("Now Is the List Empty? " + myList.isEmpty());

    }
}
