public class LinkedList {
    Node head; //ilk node, head her metodun ulaşması için main in dışında yazılır.



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

        //PrintList metodunu çağırdık
        printList(myList);
    }

    ////METOTLAR;

    //Eğer head boşsa true,değilse false döner. Listenin varlığını kontrol eder.
    //return cevabı geldiği yere döndürür
    //Main in dışına classın içine yazılır
    public boolean isEmpty() {
        return head == null;
    }


    //Listeyi yazdırmak için kullanılan metot
    //Main in dışına class ın içine yazılır

    public static void printList(LinkedList list)
    {
        // 1. Adım: Elimize bir el feneri alalım ve aramaya trenden başlayalım
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // 2. Adım: Vagonlar bitene kadar (null olana kadar) döngüye gir
        while (currNode != null) {
            // Şu an üzerinde olduğumuz vagonun içindeki veriyi yazdır
            System.out.print(currNode.data + " ");

            // Bir sonraki vagona geçiş yap (oku takip et!)
            currNode = currNode.next;
        }
    }






}
