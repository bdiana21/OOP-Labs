public class Bus {
    private int capacity;
    private int id;
    private String name;
    static int contorId=-2;

    public int getCapacity() {
        return capacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Bus(int capacity, String name) {
        this.capacity = capacity;
        this.name = name;
        contorId=contorId+3;
        id=contorId;
    }
}
