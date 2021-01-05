import java.io.*;

class working
{
    public static void main(String []args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int product_id,number;

        System.out.println("*********************************Mangalore Hypermarket***********************************");
        System.out.println("                          Urva Market , Chilimbi                                         ");
        System.out.println("                          Mangalore, Karnataka -575123   ");
        System.out.println();
        System.out.println();
        System.out.println("*****************************************************************************************");

        Items obj =  new Items();
        Cart ShoppingList = new Cart();
        Boolean flag = Boolean.TRUE;
        obj.display();
       // System.out.println("Press -1 to exit");
        product_id = 101;
        ShoppingList.add_to_cart(product_id);
        ShoppingList.displayCart();
       /* while(!flag)
        {
             System.out.println("Enter Product id and number of such itmes: ");
             productid = Integer.parseInt(in.readLine());
             number = Integer.parseInt(in.readLine());
             // push into linked list


        }*/
        // list all items which is stored in class items
        // while loop to until confirm purchase
        // only the item id and how many instances of the item should be entered
        // store each item in a node and form a linked list
        // print linked list as a bill



    }
}