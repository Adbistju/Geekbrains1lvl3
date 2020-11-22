import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main d = new Main();
        d.mainNoStatic();
        d.createFruit();
    }

    public void createFruit(){
        Apple a = new Apple();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();
        Apple a5 = new Apple();
        Apple a6 = new Apple();

        Fruit b = new Banana();
        Fruit b1 = new Banana();
        Fruit b2 = new Banana();

        Box fistBox = new Box(a);
        fistBox.addToBoxFruit(a1);
        fistBox.addToBoxFruit(a2);
        System.out.println(fistBox.boxos);

        Box secondBox = new Box(b);
        secondBox.addToBoxFruit(b1);
        secondBox.addToBoxFruit(b2);
        System.out.println(secondBox.boxos);

        Box treeBox = new Box(a3);
        treeBox.addToBoxFruit(a4);
        treeBox.addToBoxFruit(a5);
        treeBox.addToBoxFruit(a6);
        System.out.println(treeBox.boxos);

        System.out.println(treeBox.compare(fistBox));
        System.out.println(secondBox.compare(fistBox));

        System.out.println(treeBox.getWeightBox());
        System.out.println(secondBox.getWeightBox());

        transferBoxes(fistBox,treeBox);
        transferBoxes(fistBox,secondBox);
    }
    public void transferBoxes(Box i,Box j){
        System.out.println("_______________________________");
        System.out.println(i.boxos);
        System.out.println(j.boxos);
        Box.transferOfBoxes(i, j);
        System.out.println(i.boxos);
        System.out.println(j.boxos);
    }


    public void mainNoStatic() {
        Integer[] a = {1,2,3,4,5,6,7,8,9,10};
        String[] arrayOfStrings = {"1", "2", "3", "4"};

        ArrayList listOfInteger=setArray(a);
        ArrayList listOfStrings=setArray(arrayOfStrings);
        System.out.println(listOfInteger);
        System.out.println(listOfStrings);


        setIndexValArray(listOfInteger, 2, 6);
        System.out.println(listOfInteger);
        setIndexValArray(listOfStrings, 0, 3);
        System.out.println(listOfStrings);
    }
    public  <T> ArrayList setIndexValArray(ArrayList<T> thisArrayList, int index1, int index2) {
        T buffer = thisArrayList.get(index1);
        thisArrayList.set(index1,thisArrayList.get(index2));
        thisArrayList.set(index2,buffer);
        return thisArrayList;
    }
    public <T> ArrayList setArray(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }
}
