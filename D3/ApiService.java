package D3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;

public class ApiService {
    public static String fetchData(String name) {
        String apiUrl = "https://jsonplaceholder.typicode.com/users/1"; // random api for data
        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int status = conn.getResponseCode();
            if (status == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = in.readLine()) != null) {
                    response.append(line);
                }
                in.close();
                conn.disconnect();

                return "Hello, " + name + "! Here's some user data: " + response; // this is where we return API data to show the successful API request
            } else {
                conn.disconnect();
                return "Error: Unable to fetch data (HTTP " + status + ")";
            }
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            return "Error: " + e.getMessage();
        }
    }
}