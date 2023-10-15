public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public LinkedList(){
        head=null;
    }
    public void insertAtBegining(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
        }else{
            temp.next=head;
            head=temp;
        }
    }
    public void insertAtEnd(int data){
        Node ptr=head;
        Node temp = new Node(data);
        if(head==null){
            head=temp;
        }else{
            while(ptr.next!=null){
                ptr=ptr.next;
            }
            ptr.next=temp;
        }
    }
    public void insertAtPos(int data,int pos) {
        Node ptr=head;
        Node temp=new Node(data);
        if(pos==1||pos==0){
            insertAtBegining(data);
        }else if(pos>length()){
            System.out.println("invalid position");
        }
        else{
            for(int i=2;i<pos;i++){
                ptr=ptr.next;
            }
            if(ptr==null){
                insertAtEnd(data);
            }else{
                temp.next=ptr.next;
                ptr.next=temp;
            }
        }
    }
    public void printList(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
        }else{
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public int length(){
        Node ptr=head;
        int count=0;
        if(head==null){
            return -1;
        }else{
            while(ptr!=null){
                ptr=ptr.next;
                count++;
            }
            return count;
        }
    }
    public void add(int data){
        insertAtEnd(data);
    }
public void removeFirst(){
        Node ptr=head;
        Node ptr2=null;
        if(head==null){
            return;
        }else{
            ptr2=ptr.next;
            ptr=null;
            head=ptr2;
        }
}
public void removeLast(){
        Node ptr,ptr1=null;
        ptr=head;
        if(head==null){
            System.out.println("list is empty");
        }else{
            while(ptr.next!=null){
                ptr1=ptr;
                ptr=ptr.next;
            }
               ptr=null;
                ptr1.next=null;
        }
}
public int getFirst(){
        if(head==null){
            return Integer.MIN_VALUE;
        }else{
            return head.data;
        }
}
public void remove(int pos){
        Node ptr=head;
        Node ptr2=null;
        if(pos>length()||pos<0||head==null){
            return;
        }else if(pos==length()){
            removeLast();
        }else if(pos==1){
            removeFirst();
        }else{
           for(int i=1;i<pos;i++){
               ptr2=ptr;
               ptr=ptr.next;
           }
           if(ptr==null){
               return;
           }else{
               ptr2.next=ptr.next;
               ptr=null;
           }
        }
}
}
