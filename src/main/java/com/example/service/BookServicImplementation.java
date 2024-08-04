//package com.example.service;
//
//import java.util.List;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.example.binding.BookBinding;
//import com.example.entity.BookEntity;
//import com.example.entity.BookRepository;
//
//public class BookServicImplementation implements BookService {
//    @Autowired
//	private BookRepository book;
//    
//	public List<BookEntity> getAllBooks() {
//		List<BookEntity> allBooks = book.findAll();
//		return allBooks;
//		
//	}
//
//	@Override
//	public String saveBook(BookBinding bookBinding) {
//		BookEntity bookEntity = new BookEntity();
//		BeanUtils.copyProperties( bookBinding,bookEntity );
//		if(bookEntity!=null) {
//			book.save(bookEntity);
//			return "Data saved successfully";
//		}
//		
//		return "Data not saved";
//	}
//   
//}
