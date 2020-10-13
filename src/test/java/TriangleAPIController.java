import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class TriangleAPIController {

    static final String BASE_URL = "https://qa-quiz.natera.com";

    public Triangle createTriangle(TriangleData triangleData) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        TriangleAPI triangleAPI = retrofit.create(TriangleAPI.class);
        Call<Triangle> triangle = triangleAPI.createTriangle(triangleData);
        Response<Triangle> response = triangle.execute();
        if (response.isSuccessful()) {
            Triangle triangleResponse = response.body();
            return triangleResponse;
        } else {
            throw new IOException("Exception occurred during talking to server");
        }
    }

}
