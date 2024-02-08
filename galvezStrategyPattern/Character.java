package galvezStrategyPattern;

public class Character {
    private String characterType;
    private Attack attack;
    private Defend defend;
    
    public Character (String characterType){
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    }

    public String calculatePayment(){
        return "Your order amount is " + orderAmount + "\n" + paymentType.calculatePayment();
    }
}
