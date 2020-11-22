import java.util.ArrayList;

public class Box <T extends Fruit> {
    public ArrayList<T> boxos;

    public Box(T fruit) {
        boxos = new ArrayList<>();
        boxos.add(fruit);
    }

    public T getFruitInBox(int index){
        return this.boxos.get(index);
    }

    public void addToBoxFruit(T fruit){
        if(boxos.equals(null)){
            boxos.add(0,fruit);
        }
        if (boxos.get(0).getClass().equals(fruit.getClass())){
            boxos.add(fruit);
        }else {
            System.out.println("это не для этой коробки");
        }

    }

    public int getWeightBox(){
        int weigth = 0;
        for (int i = 0; i < boxos.size(); i++) {
            weigth = weigth + boxos.get(i).getWeight();
        }
        return weigth;
    }

    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        return Math.abs(getWeightBox() - boxWithSomething.getWeightBox()) < 0;
    }

    public static void transferOfBoxes(Box inital, Box added){
        if(inital.boxos.get(0).getClass().equals(added.boxos.get(0).getClass())){
            for (int i = 0; i < added.boxos.size(); i++) {
                inital.addToBoxFruit(added.getFruitInBox(i));
            }
            added.boxos.clear();
            System.out.println("Переложили!");
        }else {
            System.out.println("Мы не можем переложить разные фрукты в одну коробку");
        }

    }
}
