package springfivebyexample.cms.vo;

import lombok.Data;
import springfivebyexample.cms.models.Category;
import springfivebyexample.cms.models.Tag;

import java.util.Set;

@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;
}
