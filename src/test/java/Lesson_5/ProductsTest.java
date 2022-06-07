package Lesson_5;

import Lesson_5.api.CategoryService;
import Lesson_5.api.ProductService;
import Lesson_5.dto.GetCategoryResponse;
import Lesson_5.dto.Product;
import Lesson_5.utils.RetrofitUtils;
import com.github.javafaker.Faker;
import lombok.SneakyThrows;
import okhttp3.ResponseBody;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import retrofit2.Response;
import retrofit2.http.Body;

import java.io.IOException;

import static jdk.javadoc.internal.tool.Main.execute;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ProductsTest<GetProductsResponse> {
    static CategoryService categoryService;
    @BeforeAll
    static void beforeAll() {
        categoryService = RetrofitUtils.getRetrofit().create(CategoryService.class);
    }

    @SneakyThrows
    @Test
    void getProductsTest() {
        Response<GetProductsResponse> response = (Response<GetProductsResponse>) categoryService.getProducts().execute();

        assertThat(response.isSuccessful(), CoreMatchers.is(true));
    }

}
