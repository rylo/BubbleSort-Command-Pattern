import java.util.ArrayList;

public class BSMain {

    public static void main(String[] args){
        ArrayList stringList = new ArrayList<String>();
            stringList.add("Zelda");
            stringList.add("Epona");
            stringList.add("Link");
            stringList.add("Ganondorf");
        StringBubbleSort stringBubbleSort =  new StringBubbleSort(stringList);
        StringSortCommand stringSortCommand = new StringSortCommand(stringBubbleSort);
        Invoker invoker = new Invoker();
        invoker.setCommand(stringSortCommand);
        invoker.doCommand();

        ArrayList floatList = new ArrayList<Float>();
            floatList.add(9.0);
            floatList.add(0.005);
            floatList.add(0.001);
            floatList.add(32.0123);
            floatList.add(0.002);
        FloatBubbleSort floatBubbleSort =  new FloatBubbleSort(floatList);
        FloatSortCommand floatSortCommand = new FloatSortCommand(floatBubbleSort);
        invoker.setCommand(floatSortCommand);
        invoker.doCommand();

        ArrayList integerList = new ArrayList<Integer>();
            integerList.add(9);
            integerList.add(0);
            integerList.add(1458);
            integerList.add(44);
            integerList.add(2);
        IntegerBubbleSort integerBubbleSort =  new IntegerBubbleSort(integerList);
        IntegerSortCommand integerSortCommand = new IntegerSortCommand(integerBubbleSort);
        invoker.setCommand(integerSortCommand);
        invoker.doCommand();
    }

}