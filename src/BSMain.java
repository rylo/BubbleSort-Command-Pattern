import java.util.ArrayList;

public class BSMain {

    public static void main(String[] args){
//        ArrayList floatList = new ArrayList<Float>();
    //        floatList.add(9.0);
    //        floatList.add(0.005);
    //        floatList.add(0.001);
    //        floatList.add(32.0123);
    //        floatList.add(0.002);
//        FloatBubbleSort floatBubbleSort =  new FloatBubbleSort(floatList);
//        FloatSortCommand floatSortCommand = new FloatSortCommand(floatBubbleSort);
//        Invoker invoker = new Invoker();
//        invoker.setCommand(floatSortCommand);
//        invoker.doCommand();

        ArrayList floatList = new ArrayList<Float>();
            floatList.add(9.0);
            floatList.add(0.005);
            floatList.add(0.001);
            floatList.add(32.0123);
            floatList.add(0.002);
        FloatBubbleSort floatBubbleSort =  new FloatBubbleSort(floatList);
        FloatSortCommand floatSortCommand = new FloatSortCommand(floatBubbleSort);
        Invoker invoker = new Invoker();
        invoker.setCommand(floatSortCommand);
        invoker.doCommand();

//        ArrayList floatList = new ArrayList<Float>();
//            floatList.add(9.0);
//            floatList.add(0.005);
//            floatList.add(0.001);
//            floatList.add(32.0123);
//            floatList.add(0.002);
//        FloatBubbleSort floatBubbleSort =  new FloatBubbleSort(floatList);
//        FloatSortCommand floatSortCommand = new FloatSortCommand(floatBubbleSort);
//        Invoker invoker = new Invoker();
//        invoker.setCommand(floatSortCommand);
//        invoker.doCommand();
    }

}