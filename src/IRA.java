public class IRA extends Investment {
    private boolean isRoth;

    public IRA(String name, float currentValue, float monthlyContribution, float rateOfReturn, int compoundFrequency, boolean isRoth) {
        super(name, currentValue, monthlyContribution, rateOfReturn, compoundFrequency);
        this.isRoth = isRoth;
    }
}
