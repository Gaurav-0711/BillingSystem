public class Cart
{

    public int size;
    public Node head;

    Cart()
    {
        head = null;
        size = 0;
    }
    Items object = new Items();
    public void add_to_cart(int pid)
    {
        int price =  Integer.parseInt(object.product[pid-101][2]);
        Node newNode = new Node(pid,price);

        if(head==null)
        {
            head = newNode;
            size++;
            return;
        }
        Node cur = head;
        while(cur.next!=null)
            cur = cur.next;

        cur.next =  newNode;
        size++;
        return;


    }

    public void remove_from_cart()
    {

    }

    // create a linked list to store cart items
    //functions to add and delete items
    // function to print bill
    // function to get sum and bill
    // yep thats all
}

class Node
{
    int productid;
    float cost;
    Node next;

    Node(int productid,float cost)
    {
        this.productid = productid;
        this.cost = cost;
        next = null;
    }

    Node(int productid,float cost,Node next)
    {
        this.productid = productid;
        this.cost = cost;
        this.next=next;
    }

}