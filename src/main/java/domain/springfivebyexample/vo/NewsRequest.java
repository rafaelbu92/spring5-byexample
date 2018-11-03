package domain.springfivebyexample.vo;

import lombok.Data;
import domain.springfivebyexample.model.Category;
import domain.springfivebyexample.model.Tag;

import java.util.Set;

@Data
public class NewsRequest {

    String title;

    String content;

    Set<Category> categories;

    Set<Tag> tags;
}
