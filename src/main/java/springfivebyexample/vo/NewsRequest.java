package springfivebyexample.vo;

import lombok.Data;
import springfivebyexample.model.Category;
import springfivebyexample.model.Tag;

import java.util.Set;

@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;
}
