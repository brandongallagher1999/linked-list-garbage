package t1;

public class LinkedList
{
    public Node head;
    private int size;

    public LinkedList()
    {
        this.head = new Node();
    }

    public void push(int val)
    {
        Node current = this.head; //pointing to head node (beginning)
        while (current.next != null)
        {
            current = current.next;
        }
        current.next = new Node(val);
        this.size++;
    }

    public void pop()
    {
        Node current = this.head;

        while (current.next != null)
        {
            current = current.next;
        }
        
        current.next = null;
        this.size--;
    }

    public void print()
    {
        Node current = this.head;

        if (this.size > 0)
        {
            while (current != null)
            {
                System.out.println(current.val);
            }
        }
        
    }


    public static void main(String args[])
    {
        LinkedList list = new LinkedList();

        list.push(10);
        list.push(15);


        list.pop();
    }
}