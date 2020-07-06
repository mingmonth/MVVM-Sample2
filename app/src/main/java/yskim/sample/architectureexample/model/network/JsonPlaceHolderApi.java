package yskim.sample.architectureexample.model.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import yskim.sample.architectureexample.model.db.entities.Post;

public interface JsonPlaceHolderApi {

    // https://jsonplaceholder.typicode.com/posts
    @GET("posts")
    Call<List<Post>> getPosts();

}

