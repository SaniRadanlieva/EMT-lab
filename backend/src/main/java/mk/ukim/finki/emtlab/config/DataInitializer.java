package mk.ukim.finki.emtlab.config;

import mk.ukim.finki.emtlab.model.Author;
import mk.ukim.finki.emtlab.model.Country;
import mk.ukim.finki.emtlab.service.AuthorService;
import mk.ukim.finki.emtlab.service.BookService;
import mk.ukim.finki.emtlab.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static mk.ukim.finki.emtlab.model.enumeration.Category.*;

@Component
public class DataInitializer {

    private final AuthorService authorService;
    private final CountryService countryService;
    private final BookService bookService;

    public DataInitializer(AuthorService authorService, CountryService countryService, BookService bookService) {
        this.authorService = authorService;
        this.countryService = countryService;
        this.bookService = bookService;
    }

    @PostConstruct
    public void initData() {
        Country country = new Country("Macedonia", "Europe");
        Country country1 = new Country("Serbia", "Europe");
        Country country2 = new Country("Germany", "Europe");
        Country country3 = new Country("Spain", "Europe");

        countryService.create(country);
        countryService.create(country1);
        countryService.create(country2);
        countryService.create(country3);

        Author author1 = new Author("Pamela", "Kler", country);
        Author author2 = new Author("Sebastian", "Ficek", country1);
        Author author3 = new Author("Aleks", "Foley", country2);
        Author author4 = new Author("Kolin", "Huver", country);
        Author author5 = new Author("Sofi", "Kinsela", country1);
        Author author6 = new Author("Dzudit", "Meknot", country2);
        Author author7 = new Author("Sara", "Dzio", country);
        Author author8 = new Author("Dzil", "Pol", country1);
        Author author9 = new Author("Dzon", "Mars", country2);

        authorService.create(author1);
        authorService.create(author2);
        authorService.create(author3);
        authorService.create(author4);
        authorService.create(author5);
        authorService.create(author6);
        authorService.create(author7);
        authorService.create(author8);
        authorService.create(author9);

        this.bookService.create("Dokaz za ljubov", NOVEL, author1.getId(), 2);
        this.bookService.create("Pacientot", THRILER, author2.getId(), 4);
        this.bookService.create("Nemata pacientka", FANTASY, author3.getId(), 5);
        this.bookService.create("Sovrsena nedomakinka", DRAMA, author4.getId(), 8);
        this.bookService.create("Kralstvo od sonistata", THRILER, author5.getId(), 6);
        this.bookService.create("Temjanuski vo mart", NOVEL, author6.getId(), 1);
        this.bookService.create("Tajnata sopruga", NOVEL, author7.getId(), 1);
        this.bookService.create("Patnicite", NOVEL, author8.getId(), 1);
        this.bookService.create("Prodadena", NOVEL, author9.getId(), 1);
    }
}