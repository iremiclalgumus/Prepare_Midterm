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

        //Search metodunu çağırdık
        //2 parametreli olduğu için parantez içi :(myList.head, 20)
        System.out.println("We have 20 in list? " + myList.search(myList.head, 20));

        //PrintList metodunu çağırdık
        //metottaki list myList e dönüştü
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
    //LinkedList türünü belli eder
    //list oraya yazılacak liste anlamı taşır ex:myList

    //Burada parantezin içine bütün listeyi (LinkedList list olarak) gönderiyoruz.
    // Elimizde bir bütün olarak liste olduğu için, onun başını bulmak adına ,
    // içeri girmemiz gerekiyor: list.head (Listenin başı).

    public static void printList(LinkedList list)
    {
        //geçici bir değişken oluşturup head e atıyoruz
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        //şu an bulunduğum node boş olmadığı sürece devam ettir
        while (currNode != null) {

            // Şu an üzerinde olduğumuz node un içindeki veriyi yazdır
            //.data derken erişim operatörü kullanıyoruz yani dataya eriş ve yazdır
            System.out.print(currNode.data + " ");

            // Bir sonraki node a geçiş yap (oku takip et!)
            //.next derken de erişim operatörü kullanıyoruz yani sonraki node a eriş
            currNode = currNode.next;
        }
    }



    //Listede bir sayı aramak istediğimizde bu metodu kullanırız
    //sayı var mı yok mu? boolean
    //Burada parantezin içine tüm listeyi değil, doğrudan listenin baş düğümünü (Node head) veriyoruz.

    public boolean search(Node head, int x){

        //current node u head e eşitliyoruz
        Node current = head;

        //current boş olmadığı sürece devam ettir
        while (current != null)
        {
            //current node un datası x değerine eşitse true döndür
            if (current.data == x)
                return true;
            //eşit değilse bir sonraki node a geç
            current = current.next;
        }


        return false;

    }






}
