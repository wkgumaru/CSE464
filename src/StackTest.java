import org.junit.Assert;
import org.junit.Test;
public class StackTest {
    Stack s = new Stack();
    public static void testStackPush(){
        Stack s = new Stack();
        System.out.println(s.size());
        s.push(1);
        System.out.println(s.size());
    }
    public void setup(){

    }
    public void teardown(){

    }
    public static void main(String[] args){
          testStackPush();
    }
}
