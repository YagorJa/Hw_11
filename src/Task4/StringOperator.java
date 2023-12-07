package Task4;

public class StringOperator {
    private String[] strings;

    public StringOperator(String[] strings) {
        this.strings = strings;
        operation();
    }
    private void operation(){
        for (String s: strings) {
            if (unique(s)) {
                System.out.println("Первая уникальная строка: " + s);
            }
        }
    }
    private boolean unique(String s){
    char[] symbols =s.toCharArray();
        for (int i = 0; i < symbols.length - 1; i++) {
            for (int j = i + 1; j < symbols.length; j++) {
                if (symbols[i] == symbols[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
