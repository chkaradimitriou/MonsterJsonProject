import com.google.gson.Gson;

import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String content = null;
        URLConnection connection = null;

        try {
            connection = new URL("https://774906.youcanlearnit.net/feed/monster_data.json").openConnection();
            Scanner scanner = new Scanner(connection.getInputStream());
            scanner.useDelimiter("\\Z");
            content = scanner.next();
            scanner.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("This endpoint does not exist.");
        }

        Monster[] mon = new Gson().fromJson(content, Monster[].class);
        List<Monster> monsterList = new ArrayList(Arrays.asList(mon));

        for (int i = 0; i < monsterList.size(); i++) {
            System.out.println("Monster Name : " + monsterList.get(i).monsterName);
            System.out.println("Monster Description : " + monsterList.get(i).description);
            System.out.println("");
        }
    }
}
