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
        //For testing purpose. Test code starts here
        product_id = 101;
        ShoppingList.add_to_cart(product_id);
        int i = 1;
        while(i<10){
            ShoppingList.add_to_cart(product_id + i);
            i++;
        }
        ShoppingList.displayCart();
        ShoppingList.remove_from_cart(103);
        ShoppingList.remove_from_cart(106);
        ShoppingList.remove_from_cart(101);
        ShoppingList.displayCart();
        // Testing code ends here
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