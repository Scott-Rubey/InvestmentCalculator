import java.util.ArrayList;

public class User {
    private String name;
    private final int currentAge;
    private int retirementAge;

    private ArrayList<Investment> investments;

    public User(String name, int currentAge, int retirementAge) {
       this.name = name;
       this.currentAge = currentAge;
       this.retirementAge = retirementAge;
       this.investments = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentAge() {
        return this.currentAge;
    }

    public int getRetirementAge() {
        return this.retirementAge;
    }

    public void setRetirementAge(int age) {
        this.retirementAge = age;
    }

    public void addInvestment(Investment inv) {
        this.investments.add(inv);
    }

    private float calculateTotalInvestments() {
       float total = 0;

       for(Investment inv : this.investments) {
           total += inv.getValue();
       }

       return total;
    }

    public void displayAllInvestments() {
        for(Investment inv : this.investments){
           System.out.print("Current Value of " + inv.getName() + ": $" + inv.getValue() + "\n");
        }

        System.out.print("Total value of investments: $" + calculateTotalInvestments());
    }
}
