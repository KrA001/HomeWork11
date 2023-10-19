import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> userA = new ArrayList<>();
        userA.add("гари1");
        userA.add("али2");
        userA.add("лар3");
        userA.add("шал4");
        userA.add("ха5");
        System.out.println(userA);

        ArrayList<String> userB = new ArrayList<>();
        userB.add("лейла1");
        userB.add("кармила2");
        userB.add("джон3");
        userB.add("псина4");
        userB.add("шар5");
        System.out.println(userB);

        ArrayList<String> userC = new ArrayList<>();
        Collections.reverse(userB);
        for (int i = 0; i < userA.size(); i++) {
            userC.add(userA.get(i));
            userC.add(userB.get(i));
        }
        System.out.println(userC);

        for (int i = 0; i < userC.size(); i++) {
            for (int j = 0; j < userC.size(); j++) {
                if (userC.get(i).length() < userC.get(j).length()) {
                    String name = userC.get(i);
                    userC.set(i, userC.get(j));
                    userC.set(j, name);
                }
            }
        }
        System.out.println(userC);
    }
}