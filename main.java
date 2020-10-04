import java.util.Scanner;
import java.util.ArrayList;

class Main 
{
  public static void main(String[] args) 
  {
    /*
    food test = new food("name",8.1,20);
    System.out.println(test.getName());
    System.out.println(test.getScore());
    */

    Scanner sc = new Scanner(System.in);
    ArrayList<food> ingredients = new ArrayList();
    ArrayList<String> recipe = new ArrayList( );
    ArrayList<Double> amount = new ArrayList( );
    ArrayList<Integer> index = new ArrayList( );
    String check;

    Boolean loop = true;
    int i = 0;

    ingredients.add(new food("beef",60));
    ingredients.add(new food("lamb",24));
    ingredients.add(new food("mutton",24));
    ingredients.add(new food("cheese",21));
    ingredients.add(new food("chocolate",19));
    ingredients.add(new food("coffee",17));
    ingredients.add(new food("prawns",12));
    ingredients.add(new food("palm oil",8));  ingredients.add(new food("olive oil",6));
    ingredients.add(new food("fish",5));
    ingredients.add(new food("eggs",4.5));
    ingredients.add(new food("rice",4));
    ingredients.add(new food("milk",3));
    ingredients.add(new food("sugar",3));
    ingredients.add(new food("groundnuts",2.5));
    ingredients.add(new food("wheat flour",1.4));
    ingredients.add(new food("rye flour",1.4));
    ingredients.add(new food("tomatoes",1.4));
    ingredients.add(new food("corn",1));
    ingredients.add(new food("cassava",1));
    ingredients.add(new food("soymilk",.9));
    ingredients.add(new food("peas",.9));
    ingredients.add(new food("bananas",.7));
    ingredients.add(new food("root vegetables",.4));
    ingredients.add(new food("apples",.4));
    ingredients.add(new food("citrus fruit",.3));
    ingredients.add(new food("nuts",.3));
    ingredients.add(new food("potatoes",.5));


  

    while(loop)
    {
          System.out.print("\nIngredient: ");
          recipe.add(sc.nextLine());

          System.out.print("\nAmount(kg): ");
          String amountInput = sc.nextLine();
          amount.add(Double.parseDouble(amountInput));

          index.add(find(recipe.get(i), ingredients));

          System.out.print("\nDone?(yes/no) ");
          check = sc.nextLine();

          i=i+1;

          if(check.equals("yes"))
              loop = false;

            
    }

      double total = total(index, ingredients, amount);

      System.out.print("\tyour climate rank is " + rank(total) + " out of 10, 10 being the most harmful" + "\n\n your CO2 emission total for this meal is " + total + " KG CO2E");

    

  }

  public static int find(String str, ArrayList<food> list)
  {
    for(int i = 0; i<list.size();i++)
      {
        String check = list.get(i).getName();
        if(str.equals(check))
          return i;
      }

      return 13;
  }

  public static double total(ArrayList<Integer> num,ArrayList<food> list, ArrayList<Double> quant)
  {
    double total = 0;
    for( int i = 0; i<num.size(); i++)
    {
      total=total+list.get(num.get(i)).getCarbon()* quant.get(i);
    }

    return total;
  }

  	public static int rank(double testCO2Sum)
	{
		
		int rating = 1;

		if (testCO2Sum > 2 && testCO2Sum <=20)
		{
			rating = 1;
		}
		if (testCO2Sum > 20 && testCO2Sum <=28)
		{
			rating = 2;
		}
		if (testCO2Sum > 28 && testCO2Sum <=46)
		{
			rating = 3;
		}
		if (testCO2Sum > 46 && testCO2Sum <=64)
		{
			rating = 4;
		}
		if (testCO2Sum > 64 && testCO2Sum <=82)
		{
			rating = 5;
		}
		if (testCO2Sum > 82 && testCO2Sum <=100)
		{
			rating = 6;
		}
		if (testCO2Sum > 100 && testCO2Sum <=118)
		{
			rating = 7;
		}
		if (testCO2Sum > 118 && testCO2Sum <=136)
		{
			rating = 8;
		}
		if (testCO2Sum > 136 && testCO2Sum <=154)
		{
			rating = 9;
		}
		if (testCO2Sum > 154)
		{
			rating = 10;
		}

  return rating;
	}

}
