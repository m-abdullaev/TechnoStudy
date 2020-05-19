package StudyRoom1;

public class MixedCombo {
    public static void main(String[] args) {
        String name = "Michael Jackson";
        System.out.println("Full name is : " + name);
        int indexM = name.indexOf('M'); //0
        System.out.println("index M is " + indexM);
        //int indexM1=indexM+1; //1

        int indexJ = name.indexOf('J'); //8
        System.out.println("index J is " + indexJ);
        //int indexJ1=indexJ+1; //9
        System.out.println("coordinate for letter M is " + indexM + "," + (indexM + 1));//0,1
        System.out.println("coordinate for letter J is " + indexJ + "," + (indexJ + 1));//8,9


        System.out.println("Initials are : " + name.substring(indexM, (indexM + 1))
                + "." + name.substring(indexJ, (indexJ + 1)) + ".");

        //System.out.println("Initials are : "+name.substring(0,1) +"."+name.substring(8,9)+".");
    }
}
