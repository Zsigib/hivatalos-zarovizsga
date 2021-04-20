package hu.nive.ujratervezes.zarovizsga.aquarium;

public abstract class Fish {

    private String name;

    private int weight;

    private String color;

    private boolean shortTermMemoryLoss;

    public Fish(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public boolean isShortTermMemoryLoss() {
        return shortTermMemoryLoss;
    }

    public void setShortTermMemoryLoss(boolean shortTermMemoryLoss) {
        this.shortTermMemoryLoss = shortTermMemoryLoss;
    }

    public String status()
    {
        return name + ", weight: " + weight + ", color: " + color + ", short-term memory loss: " + shortTermMemoryLoss;
    }

    public abstract void feed();

    public void increasewight(int food)
    {
    weight+=food;
    }

    public boolean hasMemoryLoss()
    {
        return shortTermMemoryLoss;
    }
}
