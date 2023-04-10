//package dev.shafayet.Books;
//
//import org.bson.types.ObjectId;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/v1/books")
//public class BookController {
//    @GetMapping
//    public ResponseEntity<String> getAllBooks(){
//        return new ResponseEntity<List<Book>>(., HttpStatus.OK);
//    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Optional<Book>> getSingleBook(@PathVariable ObjectId Id){
//        return new ResponseEntity<Optional<Books>>()
//    }
//}
