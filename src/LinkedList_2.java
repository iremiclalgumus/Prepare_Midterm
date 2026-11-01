public class LinkedList_2 {
    Node head;
    public static void main (String[]args){

        Node firstNode= new Node(15);
        Node secondNode= new Node(20);
        Node thirdNode= new Node(25);
        Node fourthNode= new Node(30);

        LinkedList_2 myList_2= new LinkedList_2();

        myList_2.head= firstNode;
        firstNode.next= secondNode;
        secondNode.next=thirdNode;
        thirdNode.next=fourthNode;
        fourthNode.next=null;

        insertIntoEmpty(myList_2, 15);
        printList(myList_2);



    }

    public static void printList(LinkedList_2 list){
        Node currNode= list.head;
        System.out.print("LinkedList_2: ");
        while(currNode!=null){
            System.out.print(currNode.data+ " , ");
            currNode=currNode.next;

        }
    }

//Insertion Cases:

// CASE 1: Liste boşken oluşturulan node u head yapmak için kullanılır

    public static LinkedList_2 insertIntoEmpty(LinkedList_2 list,int data) {
        //yeni node oluşturulur
        Node newNode = new Node(data);

        //Liste boşsa oluşturduğumuz node head olur
        if (list.head == null) {
            list.head = newNode;
            System.out.println("List is Empty, first node added: " + data);
        } else {
            System.out.println("List is not empty");
        }

        return list;
    }

//Case 2: Liste doluyken oluşturulan node u head yapmak için kullanılır.













}

