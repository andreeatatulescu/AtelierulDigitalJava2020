import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class challenge1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(20);
        list.add(15);
        list.add(9);
        list.add(19);

        // new list to store the leaders
        List<String> leadersList = new ArrayList<>();

        // reverse the initial list
        Collections.reverse(list);

        // the last element in the initial list
        // aka the first one in the reversed list is always a LEADER
        leadersList.add("LEADER");

        // retains the greatest element until a certain iteration
        int max = list.get(0);

        // iterating through the list
        for(int i = 1; i < list.size(); i++) {
            // update the maximum if necessary and
            // naming the LEADERS
            if(list.get(i) > max) {
                max = list.get(i);
                leadersList.add("LEADER");
            } else {
                leadersList.add("basic");
            }
        }

        // back to the initial list
        Collections.reverse(list);
        Collections.reverse(leadersList);

        System.out.println(list);
        System.out.println(leadersList);

    }
}




