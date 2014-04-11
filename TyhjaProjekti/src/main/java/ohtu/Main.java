package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public class Main {

    public static void main(String[] args) throws IOException {
        String studentNr = "014033982";
        if ( args.length>0) {
            studentNr = args[0];
        }

        String url = "http://ohtustats.herokuapp.com/students/"+studentNr+"/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);

        InputStream stream =  method.getResponseBodyAsStream();

        String bodyText = IOUtils.toString(stream);

        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        System.out.println("Opiskelija "+studentNr);
        int sumOfAlltheExercises = 0;
        int totalhours = 0;
        for (Submission submission : subs) {
           
            System.out.println("  " +submission);
        sumOfAlltheExercises+=submission.totalDoneEx();
        totalhours+=submission.getHours();
        }
        System.out.println("Total amount of points so far is " + sumOfAlltheExercises+" and total amount of time spent is " +totalhours+" hours");

    }
}