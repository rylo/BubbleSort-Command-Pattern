public class StringSortCommand implements Command {
    StringBubbleSort stringBubbleSort;

    public StringSortCommand(StringBubbleSort stringBubbleSort) {
        this.stringBubbleSort = stringBubbleSort;
    }

    public void execute() {
        stringBubbleSort.sort();
    }
}

