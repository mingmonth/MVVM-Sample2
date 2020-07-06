package yskim.sample.architectureexample.model.network;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;
import yskim.sample.architectureexample.model.db.entities.Comment;
import yskim.sample.architectureexample.model.db.entities.Post;

public interface JsonPlaceHolderApi {

    // https://jsonplaceholder.typicode.com/posts
//    @GET("posts")
//    Call<List<Post>> getPosts();

    // 	/posts?userId=1
//    @GET("posts")
//    Call<List<Post>> getPosts(@Query("userId") int userId);

    // https://jsonplaceholder.typicode.com/posts?userId=1&_sort=id&_order=desc
    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
    );

    @GET("posts")
    Call<List<Post>> getPosts(
            @QueryMap Map<String, String> parameters
    );

    //@GET("posts/1/comments")
    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);

    @GET
    Call<List<Comment>> getComments(@Url String url);

}

