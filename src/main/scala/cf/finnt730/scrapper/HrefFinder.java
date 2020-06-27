package cf.finnt730.scrapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HrefFinder {


    public final int threads = 5;

    public ExecutorService EXE = Executors.newFixedThreadPool(threads);


    ArrayList<String> hrefsInPage(String htmlCode) {
        ArrayList<String> result = new ArrayList<>();

        Arrays.stream(htmlCode.split("href=[\"\'](.*?)[\"\']")).sequential().forEach((a) -> {
            System.out.println(a);
            result.add(a);
        });

        return result;
    }



}
