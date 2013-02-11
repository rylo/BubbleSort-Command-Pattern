import java.util.ArrayList;

public class IntegerBubbleSort {
    public ArrayList<Integer> collectionToSort;

    public IntegerBubbleSort(ArrayList collectionToSort) {
        this.collectionToSort = collectionToSort;
    }

    public void sort() {
        Object first, second;
        boolean swapHappened = true;

        while(swapHappened){
            swapHappened = false;

            for(int x = 0; x < (collectionToSort.size() - 1); x++) {
                first = collectionToSort.get(x);
                second = collectionToSort.get(x+1);

                if (compare(first, second)) {
                    swap(x, collectionToSort, first, second);
                    swapHappened = true;
                }
            }
        }
        printArray(collectionToSort);
    }

    private boolean compare(Object first, Object second) {
        return ((Number) first).intValue() > ((Number) second).intValue();
    }

    private void swap(int index, ArrayList collectionToSort, Object first, Object second) {
        first = ((Number) first).intValue();
        second = ((Number) second).intValue();
        collectionToSort.set(index, second);
        collectionToSort.set(index + 1, first);
    }

    public void printArray(ArrayList arrayToPrint){
        System.out.println("Outcome:");
        for(int x = 0; x < arrayToPrint.size(); x++) {
            System.out.println(arrayToPrint.get(x));
        }
    }
}