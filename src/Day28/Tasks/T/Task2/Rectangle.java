package Day28.Tasks.T.Task2;

public class Rectangle {
    int length;
    int width;

    int getPerimeter() {
        return (length + width) * 2;

    }
    // create method to print attributes

    void printAttributes() {
        System.out.println();

    }

    // create method to calculate area of rectangle
    int areaOfRectangle() {
        return length * width;

    }

    //to get string representation of instance
    // you need to create method below
    public String toString() {
        return "Length" + length +
                "\nWidth" + width;
    }
}

