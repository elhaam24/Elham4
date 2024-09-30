public class Drinksmenu extends Drinks {
    int DrinksmenuID;
    String DrinksmenuName;

    public Drinksmenu(int Id, String Name, int drinkID, String drinkName, int drinksmenuID, String drinksmenuName) {
        super(Id, Name, drinkID, drinkName);
        DrinksmenuID = drinksmenuID;
        DrinksmenuName = drinksmenuName;
    }

    public int getDrinksmenuID() {
        return DrinksmenuID;
    }

    public String getDrinksmenuName() {
        return DrinksmenuName;
    }
}
