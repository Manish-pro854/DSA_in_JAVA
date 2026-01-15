package OOPS;

class Pizza {

    private int price;
    private boolean isVeg;
    private String bill = "";

    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isPaperbagAdded;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            bill += "Base of the Pizza: 300\n";
            price += 300;
        } else {
            bill += "Base of the Pizza: 400\n";
            price += 400;
        }
    }

    public int getPrice(){
        return price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
            price += 80;
            bill += "Extra Cheese Added: 80\n";
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded){
            if(isVeg){
                price += 70;
                bill += "Extra Toppings Added: 70\n";
            } else {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
            }
            isExtraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isPaperbagAdded){
            price += 20;
            bill += "Paperbag Added: 20\n";
            isPaperbagAdded = true;
        }
    }

    public String getBill(){
        return bill + "Total Price: " + price;
    }
}

class DeluxePizza extends Pizza {
    public DeluxePizza(boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
    }
}

public class Question {
    public static void main(String[] args) {

        DeluxePizza dp = new DeluxePizza(true);
        System.out.println(dp.getPrice());
        dp.addTakeaway();
        dp.addExtraCheese(); // won’t add again
        System.out.println(dp.getBill());

        System.out.println("------------");

        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addExtraCheese(); // ignored
        p.addTakeaway();
        System.out.println(p.getBill());
    }
}
