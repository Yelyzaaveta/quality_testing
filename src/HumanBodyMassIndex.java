public class HumanBodyMassIndex {
    public double humanWeight;
    public double humanHeight;
    private static double bodyMassIndex;

    private void updateBodyMassIndex() {
        bodyMassIndex = humanWeight / (humanHeight * humanHeight);
    }

    public HumanBodyMassIndex(double weight, double height) {
        humanWeight = weight;
        humanHeight = height;
        updateBodyMassIndex();
    }

    public double getWeight() {
        return humanWeight;
    }

    public void setWeight(double weight) {
        humanWeight = weight;
        updateBodyMassIndex();
    }

    public double getHeight() {
        return humanHeight;
    }

    public void setHeight(double height) {
        humanHeight = height;
        updateBodyMassIndex();
    }

    public static double getBodyMassIndex() {
        return bodyMassIndex;
    }

    public String getBodyClassification() {
        String classification;

        if (bodyMassIndex >= 18.5 && bodyMassIndex < 25) {
            classification = "Normal";
        } else if (bodyMassIndex >= 25 && bodyMassIndex < 30) {
            classification = "Warning!";
        } else if (bodyMassIndex >= 30) {
            classification = "Fat";
        } else {
            classification = "Deficit";
        }
        return classification;
    }
}
