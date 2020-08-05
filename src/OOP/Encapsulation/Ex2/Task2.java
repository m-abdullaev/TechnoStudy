package OOP.Encapsulation.Ex2;

public class Task2 {

    //Why we need/use Encapsulation?
    public String ssn;
    public String empName;
    public int empAge;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssnNumber) {
        if (ssnNumber.length() == 9) {
            ssn = ssnNumber;
        } else {
            ssn = "This Number is invalid";
        }
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}

class myMainClass {
    public static void main(String[] args) {
        Task2 newEmp = new Task2();

//        newEmp.ssn = "6545445667";
//        if(newEmp.ssn.length() == 9){
//            System.out.println(newEmp.ssn);
//        }else{
//            System.out.println("This ssn is invalid");
//        }

        newEmp.setSsn("111222553");
        newEmp.setEmpName("Halit");
        newEmp.setEmpAge(25);

        System.out.println(newEmp.getSsn());
        System.out.println(newEmp.getEmpName());
        System.out.println(newEmp.getEmpAge());
    }
}

class newEmployer {
    public static void main(String[] args) {
        Task2 tsk = new Task2();

        tsk.setSsn("789456123");
        tsk.setEmpName("Samil");
        tsk.setEmpAge(22);

        System.out.println(tsk.getSsn());
        System.out.println(tsk.getEmpName());
        System.out.println(tsk.getEmpAge());

    }
}