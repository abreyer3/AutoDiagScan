

import java.io.IOException;
import java.net.URISyntaxException;

import com.google.appengine.repackaged.com.google.api.client.http.HttpResponse;
import com.google.appengine.repackaged.com.google.common.flogger.parser.ParseException;

public class GooglePlacesClient
{
    /*private static final String GOOGLE_API_KEY  = "AIzaSyCjg1ytm_HiKvu2B0Jwj3qECgEhKmcnmUM";

    private final HttpClient client = new DefaultHttpClient();

    public static void main(final String[] args) throws ParseException, IOException, URISyntaxException
    {
        new GooglePlacesClient().performSearch("establishment", 8.6668310, 50.1093060);
    }

    public void performSearch(final String types, final double lon, final double lat) throws ParseException, IOException, URISyntaxException
    {
        final URIBuilder builder = new URIBuilder().setScheme("https").setHost("maps.googleapis.com").setPath("/maps/api/place/search/json");

        builder.addParameter("location", lat + "," + lon);
        builder.addParameter("radius", "5");
        builder.addParameter("types", types);
        builder.addParameter("sensor", "true");
        builder.addParameter("key", GooglePlacesClient.GOOGLE_API_KEY);

        final HttpUriRequest request = new HttpGet(builder.build());

        final HttpResponse execute = this.client.execute(request);

        final String response = EntityUtils.toString(execute.getEntity());

        System.out.println(response);
    }*/

}