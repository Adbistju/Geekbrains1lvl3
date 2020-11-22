public abstract class Fruit {
    private  int weight;
    public int index;

    public Fruit(int weight, int index) {
        this.weight=weight;
        this.index=index;
    }

    public int getWeight(){
        return weight;
    }

    public int getIndex(){
        return index;
    }

    @Override
    public String toString() {
        return "{"+ this.getClass() + "=" + this.getWeight() +"in"+ this.index+"}";
    }
}
