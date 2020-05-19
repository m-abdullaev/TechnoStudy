package Day28.Tasks.T.Task3;

public class Task1 {
    public static void main(String[] args) {
        Costumer costumer1 = new Costumer();
        costumer1.name = "Danny";

        ElectricityAcc electricityAcc = new ElectricityAcc();
        costumer1.electricityAcc = electricityAcc;

        costumer1.consumeElectricity(100);
        costumer1.consumeElectricity(200);
        costumer1.consumeElectricity(50);

        costumer1.consumeElectricity(-10000);

        double costumer1bill = costumer1.electricityAcc.calculateBill();

        System.out.println("Customer: " + costumer1.name);
        System.out.println("Total Bill: " + costumer1.electricityAcc.bill);
        System.out.println("Total Bill $ : " + costumer1.electricityAcc.bill);


    }
}
