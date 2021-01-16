
import java.io.*;


class working
{
    public static void main(String []args)throws IOException
    {
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);

        int product_id,number;
        int choice_of_customer,number_of_products;

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

        while(flag)
        {
            choice_of_customer = 0;
            number_of_products = 0;
            System.out.println("1. Add items to cart");
            System.out.println("2. Remove items from cart");
            System.out.println("3. Display Cart");
            System.out.println("  Anything else to proceed to checkout");

            choice_of_customer= Integer.parseInt(in.readLine());
            switch (choice_of_customer)
            {

                case 1: System.out.println("How many products do you want to enter");
                        number_of_products = Integer.parseInt(in.readLine());
                        for(int i=1;i<=number_of_products;i++)
                        {
                            System.out.print("Enter product if and number of items");
                            product_id = Integer.parseInt(in.readLine());
                            number = Integer.parseInt(in.readLine());
                            ShoppingList.add_to_cart(product_id,number);
                            System.out.println();
                        }
                        break;
                case 2: System.out.println("How many products do you want to delete?");
                        number_of_products =  Integer.parseInt(in.readLine());


                         for(int i=1;i<=number_of_products;i++)
                         {
                             System.out.println("Enter product id and number of instances");
                             product_id = Integer.parseInt(in.readLine());
                             number = Integer.parseInt(in.readLine());
                             ShoppingList.remove_from_cart(product_id,number);


                         }
                         break;
                case 3: ShoppingList.displayCart();
                         break;
                default: flag = Boolean.FALSE;
                          break;

            }

        }


        ShoppingList.displayCart();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Mode of payment:");
        System.out.println("1.Cash");
        System.out.println("2.UPI") ;
        System.out.println("3.Card");
        System.out.println("Enter your choice:");
        choice_of_customer =Integer.parseInt(in.readLine());
        flag = Boolean.TRUE;
        do {

            Boolean check_number = Boolean.TRUE;

            switch (choice_of_customer) {
                case 1:
                    flag = Boolean.FALSE;
                    break;
                case 2:
                    System.out.println("Enter Mobile number");
                    Long mobilenumber = Long.parseLong(in.readLine());
                    if (Long.toString(mobilenumber).length()!= 10) {
                        check_number = Boolean.FALSE;
                    }

                    if(check_number)
                    {
                        System.out.println("OTP has been sent to your registered mobile number");
                        flag = Boolean.FALSE;
                    }
                    else
                    {
                        System.out.println("Wrong number entered , try again!");
                    }
                    break;
                case 3:
                    System.out.println("Enter 16 digit number");
                   Long cardnumber = Long.parseLong(in.readLine());
                    if (Long.toString(cardnumber).length()!= 16) {
                        check_number = Boolean.FALSE;
                    }

                    if(check_number)
                    {
                        System.out.println("OTP has been sent to your registered mobile number");
                        flag = Boolean.FALSE;
                    }
                    else
                    {
                        System.out.println("Wrong number entered , try again!");
                    }
                    break;
                default: System.out.println("Enter again");
                         break;



            }

        }
        while(flag);

        System.out.println("***************************************************");
        System.out.println("           Thank you for shopping with us ");
        System.out.println("****************************************************");


    }
}