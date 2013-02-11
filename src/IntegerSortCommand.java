public class IntegerSortCommand implements Command {
    IntegerBubbleSort integerBubbleSort;

    public IntegerSortCommand(IntegerBubbleSort integerBubbleSort) {
        this.integerBubbleSort = integerBubbleSort;
    }

    public void execute() {
        integerBubbleSort.sort();
    }
}

