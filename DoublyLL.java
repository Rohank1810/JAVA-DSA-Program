class DoublyLL{
    class Node{

        int data;
        Node next;
        Node prev;
        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
        public Node head=null;
        public Node tail=null;

        //add
        //1.Front
        public void addFront(int data)
        {
            Node newNode=new Node(data);
            if(head==null)
            {
                  head=tail=newNode;
                  return;
            }
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
        }

        public void addLast(int data)
        {
         Node newNode=new Node(data);
         if(head==null)
         {
            head=tail=newNode;
            return;
         }   
         newNode.prev=tail;
         tail.next=newNode;
         tail=newNode;
        }

        public void atAny(int pos,int data)
        {
            Node newNode=new Node(data);
            Node temp=head;
            Node ptr=temp.next;
            for(int i=0;i<pos-1;i++)
            {
                temp=temp.next;
                ptr=ptr.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=ptr;
            ptr.prev=newNode;

        }

        public void traversal()
        {
            Node temp=head;
            if(temp==null)
            {
                System.out.println("Empty");
            }
            while(temp!=null)
            {
                System.out.print(temp.data+" ->  ");
                temp=temp.next;
            }
            System.out.println();
        }

        public void deleteFront()
        {
            if(head==null)
            {
                System.out.println("Empty");
            }
            head=head.next;
        }

        public void deleteLast()
        {
            if(head==null)
            {
                System.out.println("Empty");
            }
            Node temp=head;
            while(temp.next.next!=null)
            {
              temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }

        public void DeleteAny(int pos)
        {
            if(head==null)
            {
                System.out.println("Empty");
            }
            Node temp=head;
            Node ptr=temp.next;
            for(int i=0;i<pos-1;i++)
            {
               temp=temp.next;
               ptr=ptr.next;
            }
            temp.next=ptr.next;



        }
    
    public static void main(String[] args) {
        
        DoublyLL p=new DoublyLL();
        p.traversal();
        p.addFront(34);
        p.traversal();
        p.addFront(90);
        p.traversal();
        p.addLast(789);
        p.traversal();
        p.atAny(2, 678);
        p.traversal();
        p.deleteFront();
        p.traversal();
        p.deleteLast();
        p.traversal();
        p.addFront(3456);
        p.traversal();
        p.DeleteAny(1);
        p.traversal();

    }
}
