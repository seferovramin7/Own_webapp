package guru.ramin.springframework.spring5webapp.bootstrap;

import guru.ramin.springframework.spring5webapp.domain_model.Author;
import guru.ramin.springframework.spring5webapp.domain_model.Book;
import guru.ramin.springframework.spring5webapp.domain_model.Publisher;
import guru.ramin.springframework.spring5webapp.repositories.AuthorRepository;
import guru.ramin.springframework.spring5webapp.repositories.BookRepository;
import guru.ramin.springframework.spring5webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain driven design", "12345");
        Publisher orally = new Publisher("Biladjari", "Baku", "Azerbaijan", "12345");
        publisherRepository.save(orally);

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(orally);
        orally.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(orally);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("EJB", "121212");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(orally);
        orally.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(orally);

        System.out.println("Bootstrapped");
        System.out.println("Number of books : " + bookRepository.count());
        System.out.println("Publisher count : " + orally.getBooks().size());
    }
}
