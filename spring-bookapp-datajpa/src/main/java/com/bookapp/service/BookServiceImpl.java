package com.bookapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	IBookRepository bookRepository;
	
	@Override
	public void addBook(Book book) {
		bookRepository.save(book);

	}

	@Override
	public void updateBook(Book book) {
		bookRepository.save(book);

	}

	@Override
	public void deleteBook(int bookId) {
		bookRepository.deleteById(bookId);

	}

	@Override
	public Book getById(int bookId) {
		Optional<Book> bookopt = bookRepository.findById(bookId);
		if(bookopt.isPresent())
			return bookopt.get();
		
		return null;
	}

	@Override
	public List<Book> getAll() {
		
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		return bookRepository.findByAuthor(author);
	}

	@Override
	public List<Book> getByCatagery(String catagery) {
		return bookRepository.findByCatagery(catagery);
	}

	@Override
	public List<Book> getByPrice(double price) {
		// TODO Auto-generated method stub
		return bookRepository.findByPriceLessThan(price);
	}

	
	

}
