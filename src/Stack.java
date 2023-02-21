import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> container = new ArrayList<>();
    public int size(){
        return container.size();
    }
    public void push(int i){
        container.add(i);
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.size());
        s.push(1);
        System.out.println(s.size());

    }
}
