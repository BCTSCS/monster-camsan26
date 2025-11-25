import java.util.ArrayList;

public class MyList extends ArrayList<Object> {

    public MyList() {
        super();
    }

    public void printAll() {
        if (!this.isEmpty()) {
            for (Object thing : this) {
                System.out.println(thing);
            }
        }
    }

    public static void main(String[] args) throws Exception{
        MyList list = new MyList();
        list.add("Happy");
        list.add("Thanksgiving");
        list.add(2025);
        list.printAll();
    }
}

