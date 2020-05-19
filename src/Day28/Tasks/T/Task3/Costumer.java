package Day28.Tasks.T.Task3;

public class Costumer {
    String name;
    ElectricityAcc electricityAcc;

    void consumeElectricity(double wph) {
        if (wph < 0) {
            System.out.println();
        } else {


            electricityAcc.totalWpt += wph;
        }


    }

}
