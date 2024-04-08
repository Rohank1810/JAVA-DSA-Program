class SinglyLL{
    class Node{

        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
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
            newNode.next=ptr;
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
        
        SinglyLL p=new SinglyLL();
        p.traversal();
        p.addFront(12);
        p.traversal();
        p.addLast(45);
        p.traversal();
        p.addFront(78);
        p.traversal();
        p.atAny(1, 80);
        p.traversal();
        p.atAny(3, 101);
        p.traversal();
        System.out.println("Delete");
        p.deleteFront();
        p.traversal();
        p.deleteLast();
        p.traversal();
        p.DeleteAny(1);
        p.traversal();

    }
}