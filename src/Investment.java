public class Investment {
    private String name;
    private float currentValue;
    private float monthlyContribution;
    private float rateOfReturn;
    private int compoundFrequency;

    public Investment(String name, float currentValue, float monthlyContribution, float rateOfReturn, int compoundFrequency) {
        this.name = name;
        this.currentValue = currentValue;
        this.monthlyContribution = monthlyContribution;
        this.rateOfReturn = rateOfReturn;
        this.compoundFrequency = compoundFrequency;
    }

    public String getName() {
        return this.name;
    }

    public float getValue() {
        return this.currentValue;
    }
}

