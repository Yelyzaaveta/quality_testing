public class Main {
    public static void main(String[] args) {
        HumanBodyMassIndex humanBodyMassIndex = new HumanBodyMassIndex(80, 1.52);
        System.out.println(humanBodyMassIndex.getBodyClassification());
    }
}
