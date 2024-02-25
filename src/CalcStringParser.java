public class CalcStringParser {
    private double firstOperand;
    private double secondOperand;
    private String operation;

    public CalcStringParser(String input) {
        StringParser(input);
    }

    private void StringParser(String input) {
        String[] stringArray = input.split(" ");
        this.firstOperand = Double.parseDouble(stringArray[0]);
        this.secondOperand = Double.parseDouble(stringArray[2]);
        this.operation = stringArray[1];
    }



}
