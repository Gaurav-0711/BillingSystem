import java.io.IOException;

public class Items
{
    // to store all items in the market with id and price
    String[][] product = {{"101", "Maggi", "12"},
            {"102", "Kurkure", "10"},
            {"103", "Oreo", "35"},
            {"104", "Nutella", "80"},
            {"105", "Surf Excel", "45"},
            {"106", "Bulb", "120"},
            {"107", "Bag", "750"},
            {"108", "Shirt", "499"}
    };

    public void display()throws IOException
    {
        int i ;
        for(i=0;i<8;i++)
        {
            System.out.println(product[i][0]+"\t"+product[i][1]+"\t\t\t"+product[i][2]);
        }
    }
    }
