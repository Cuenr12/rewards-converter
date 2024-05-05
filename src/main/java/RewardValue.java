public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor accepting cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor accepting miles value
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    // Method to get cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get miles value
    public double getMilesValue() {
        return milesValue;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create RewardValue instances
        RewardValue reward1 = new RewardValue(100);
        RewardValue reward2 = new RewardValue(500);

        // Get cash and miles values
        System.out.println("Reward 1:");
        System.out.println("Cash Value: " + reward1.getCashValue());
        System.out.println("Miles Value: " + reward1.getMilesValue());

        System.out.println("\nReward 2:");
        System.out.println("Cash Value: " + reward2.getCashValue());
        System.out.println("Miles Value: " + reward2.getMilesValue());
    }
}
