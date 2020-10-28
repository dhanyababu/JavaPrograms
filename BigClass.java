package Mjuk19_package;

public class BigClass {
    private int number;
    private String text;

    public BigClass(){
        this(0,"null");
    }
    public BigClass(int number) {
        this.number = number;
        this.text = "null";
    }
    public BigClass(String text) {
        this.number = 0;
        this.text = text;
    }

    public BigClass(int number,String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber(){
        return this.number;
    }

    public String getText(){
        return this.text;
    }

    public void setNumber(int newNumber){
        number= newNumber;
    }
    public void setText(String newText){
        text= newText;
    }


    public void textToUppercase(){
        this.text=text.toUpperCase();
    }

    public void textToNull(){
        this.text= "NULL";
    }


    public void replaceNumber(int newNum){
        if(newNum<0)
            System.out.println("Not possible to add negative number");
        else {
            //int sum = this.getNumber()+newNum;
            setNumber(newNum);
        }
    }

    public String toString() {
        return "number is" + number +"text='" + text;
    }

}
