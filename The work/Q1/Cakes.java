public class Cakes extends coffeeshop{
    int CakeID;
    String CakeName;

    public Cakes(int Id, String Name, int cakeID, String cakeName) {
        super(Id, Name);
        CakeID = cakeID;
        CakeName = cakeName;
    }

    public int getCakeID() {
        return CakeID;
    }

    public String getCakeName() {
        return CakeName;
    }

    @Override
    public int getCoffeeshopId() {
        return super.getCoffeeshopId();
    }

    public static void main(String[] args){
        coffeeshop Coffeeshop = new coffeeshop(111,"MOJAel Coffe");
        System.out.println("The Coffee shop id is: " + Coffeeshop.getCoffeeshopId());
        System.out.println("The Coffee shop name is: " + Coffeeshop.getCoffeeshopName());

        Drinks Drink1 = new Drinks(111,"MOJAel Coffe",323,"Banana milkshik");
        System.out.println("The drink id is: " + Drink1.getDrinkID());
        System.out.println("The drink name is: " + Drink1.getDrinkName());

        Drinksmenu menu = new Drinksmenu(111,"MOJAel Coffe",323,"Banana milkshik",1,"MOJAel cofee menu");
        System.out.println("The menu id is: " + menu.getDrinksmenuID());
        System.out.println("The menu name is: " + menu.getDrinksmenuName());

        Cakes Cake1 = new Cakes(111,"MOJAel Coffe",675,"choclate cake");
        System.out.println("The Cake id is: " + Cake1.getCakeID());
        System.out.println("The Cake name is: " + Cake1.getCakeName());
    }
}
