public class SLL{
    private Node head;

    public SLL(){this.head = null;}

    public Node add(int value){
        if(this.head == null){
            this.head = new Node(value);
            return this.head;
        }
        Node ptr = this.head;

        while(ptr.next != null){
            ptr = ptr.next;
        }

        ptr.next = new Node(value);
        return this.head;
    }

    public Node remove(){
        Node ptr = this.head;

        while(ptr.next.next != null){
            ptr = ptr.next;
        }
        ptr.next = null;

        return this.head;
    }

    public Node removeAt(int ind){
        Node ptr = this.head;
        Node tmp = null;
        int cnt  = 0;

        while(ptr.next != null){
            if(cnt == ind){//step back to previous node to set its next to the next node.
                tmp.next = tmp.next.next;
                break;
            }

            tmp = ptr;//save old node
            ptr = ptr.next;
            cnt++;
        }
        return this.head;
    }

    public void printValues(){
        Node ptr = this.head;

        while(ptr != null){
            System.out.println(ptr.value);

            ptr = ptr.next;
        }
    }
}




