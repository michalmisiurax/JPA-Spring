package pl.michalm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import pl.michalm.dao.BookDao;
import pl.michalm.model.Book;

@Configuration
@ComponentScan
public class SpringJpaApplication {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringJpaApplication.class);
		BookDao bookDao = ctx.getBean(BookDao.class);
		
		// zapis
		Book book = new Book("12345678904689", "Spring JPA", "Michal M");
		bookDao.save(book);
		
		// odczyt
		Book bookGet = bookDao.get(1L);
		System.out.println(bookGet);
		ctx.close();
	}
}