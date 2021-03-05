import java.util.ArrayList;
import java.util.List;

public class challenge4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(4);
//        list.add(3);
//        list.add(7);
//        list.add(8);
//        list.add(6);
//        list.add(2);
//        list.add(1);

        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);

        for(int i = 0; i < list.size() - 1; i++) {
            if(i % 2 == 0) {
                if(list.get(i) > list.get(i + 1)) {
                    int aux = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, aux);
                }
            }
            if(i % 2 != 0) {
                if(list.get(i) < list.get(i + 1)) {
                    int aux = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, aux);
                }
            }
        }

        System.out.println(list);
    }
}
