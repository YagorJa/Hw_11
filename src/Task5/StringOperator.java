package Task5;

public class StringOperator {
    private String[] strings;

    public StringOperator(String[] strings) {
        this.strings = strings;
        operation();
    }

    private void operation() {
        for (String s : strings) {
        String doobled =   dooblirovanue(s);
            System.out.println(doobled);
        }
    }

    private String dooblirovanue(String s) {
        char[] symbols = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <symbols.length ; i++) {
           sb.append(symbols[i]);
         sb.append(symbols[i]);

        }
        return sb.toString();
    }
}
