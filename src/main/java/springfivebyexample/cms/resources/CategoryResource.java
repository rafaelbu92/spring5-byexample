package springfivebyexample.cms.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import springfivebyexample.cms.models.Category;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findOne(@PathVariable("id") String id){
		return ResponseEntity.ok(new Category());
	}
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		return ResponseEntity.ok(Arrays.asList(new Category(), new Category()));
	}
	
	@PostMapping
	public ResponseEntity<Category> newCategory(CategoryRequest category){
		return new ResponseEntity<>(new Category(), new Category());
	}
	
	@DeleteMapping("/id")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void removeCategory(@PathVariable("id") String id) {
		
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable("id") String id){
		return new ResponseEntity<>(new Category(), HttpStatus.OK);
	}
	
}
