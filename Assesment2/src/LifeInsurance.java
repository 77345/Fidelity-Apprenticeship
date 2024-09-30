class LifeInsurance  extends Insurance{
    private int policyterm;
    private Float benifitpercent;

    public int getPolicyterm() {
        return policyterm;
    }
    public void setPolicyterm(int policyterm) {
        this.policyterm = policyterm;
    }
    public Float getBenifitpercent() {
        return benifitpercent;
    }
    public void setBenifitpercent(Float benifitpercent) {
        this.benifitpercent = benifitpercent;
    }
    public double calculatePremium(){
        return (getAmountcover()-((getAmountcover() * benifitpercent)/100))/policyterm;
    }
}
