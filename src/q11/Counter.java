package q11;

public class Counter {
    static int count=0; //instance variable
    Counter(){
        count++; //incrementing value
        System.out.println(count);
    }
    public static void main(String args[]){
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
    }
}
