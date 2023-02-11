package introtooops;

public class Main {
    public static void main(String[] args) {
        Student naveen = new Student();
        naveen.changeName("Naveen");
        naveen.age = 30;

        naveen.giveInterview();


        Student yenduri = new Student();
        yenduri.changeBatch("A");

        System.out.println(yenduri.batchName);

    }
}
