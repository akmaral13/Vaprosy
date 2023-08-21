public class Car {
    private int id;
    private int nomer;
    private  String name;

    public Car(int id, int nomer, String name) {
        this.id = id;
        this.nomer = nomer;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNomer() {
        return nomer;
    }

    public void setNomer(int nomer) {
        this.nomer = nomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", nomer=" + nomer +
                ", name='" + name + '\'' +
                '}';
    }
}
