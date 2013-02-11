public class FloatSortCommand implements Command {
    FloatBubbleSort floatBubbleSort;

    public FloatSortCommand(FloatBubbleSort floatBubbleSort) {
        this.floatBubbleSort = floatBubbleSort;
    }

    public void execute() {
        floatBubbleSort.sort();
    }
}
