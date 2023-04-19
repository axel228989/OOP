package Lab3;

public class MyStringChanger {
    String inString;
    int k;
    char symbol;
    String outString;

    public MyStringChanger(String string, int k, char symbol) {
        this.inString = string;
        this.k = k;
        this.symbol = symbol;
        this.change();
    }

    public void change(){
        StringBuilder strBldr = new StringBuilder(inString);
        int klst = 0;   //кількість букв у слові
        Character probil = new Character(' ');
        for (int i = 0; i < strBldr.length(); i++) {
            if (probil.equals(strBldr.charAt(i))) {
                klst = 0;
            } else {
                klst++;
            }
            if (klst == k){
                strBldr.setCharAt(i,symbol);
            }
        }
        outString = strBldr.toString();
    }

    public String getOutString() {
        return outString;
    }



    @Override
    public String toString() {
        return "MyStringChanger{" +
                "inString='" + inString + '\'' +
                ", k=" + k +
                ", symbol=" + symbol +
                ", outString='" + outString + '\'' +
                '}';
    }
}
