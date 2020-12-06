package L3.Challenge5;


public class DescBubbleSort extends TemplateMethodBubbleSort {


    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if (i1 < i2)
            return true;
        return false;
    }
}
