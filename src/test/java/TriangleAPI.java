import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface TriangleAPI {

    @Headers("X-User: b65b9255-c3cf-4a19-a673-532f01443c7d")
    @POST("/triangle")
    Call<Triangle> createTriangle(@Body TriangleData triangleData);

}

