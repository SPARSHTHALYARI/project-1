

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class api {

    public static void main(String[] args) {

        var url = "https://api.githuhb.com/users/LearnCodeWithDurgesh";
        // http request

        var request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();

        var client =HttpClient.newBuilder().build();

        var response=client.send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.statusCode());
        System.out.println(response.body());



        


    }
    
}
