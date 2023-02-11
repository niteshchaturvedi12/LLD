package introtooops;

public class Student {
    // Attributes
    private String name;
    String batchName;
    int age;
    double psp;

    void changeBatch(String newBatch) {
        batchName = newBatch;
    }

    void giveInterview() {
        System.out.printf(name + " gave interview%n");
    }

    void printName() {
        System.out.println(name);
    }

    void changeName(String newName) {
        name = newName;
    }
}
