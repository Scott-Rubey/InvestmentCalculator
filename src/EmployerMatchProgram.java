public class EmployerMatchProgram extends Investment {
    private float matchPerMonth;
    private boolean isRoth;

    public EmployerMatchProgram(String name, float currentValue, float monthlyContribution, float rateOfReturn, int compoundFrequency, float matchPerMonth, boolean isRoth) {
        super(name, currentValue, monthlyContribution, rateOfReturn, compoundFrequency);
        this.matchPerMonth = matchPerMonth;
        this.isRoth = isRoth;
    }
}
