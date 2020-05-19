package SenaMentoring;

public class Apr18MethodsTask1 {
    // TASKS:

    // 1. Mary, John, Alice, Kyle and Edson are a family of 5. All of them are working.
    // Create a method of how much tax they are paying by
    // getting the 7 percent of each of their income and summing all up

    // acceptance criteria:
    // have 5 ints as incomes as your parameters, return a double
    public double taxCalc(int income1, int income2, int income3, int income4, int income5) {
        int[] arr = {income1, income2, income3, income4, income5};
        double taxTotal = 0.0;
        for (int i = 0; i < arr.length; i++) {
            taxTotal += (double) (arr[i] * 7 / 100);
        }
        return taxTotal;
    }
}
