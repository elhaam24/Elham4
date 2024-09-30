public class Drinks extends coffeeshop{
    int DrinkID;
    String DrinkName;

    public Drinks(int Id, String Name, int drinkID, String drinkName) {
        super(Id, Name);
        DrinkID = drinkID;
        DrinkName = drinkName;
    }

    public int getDrinkID() {
        return DrinkID;
    }

    public String getDrinkName() {
        return DrinkName;
    }

    @Override
    public String getCoffeeshopName() {
        return super.getCoffeeshopName();
    }


}
