package com.example.books;

import com.example.books.entity.Language;
import com.example.books.repository.LanguageRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class LanguageRepositoryTest {

    @Autowired
    private LanguageRepository langRepository;

    @Test
    public void testInsertLanguage() {
        Language lang = new Language();
        lang.setName("English");
        langRepository.save(lang);
        Long langID = lang.getId();

        Language langTest = langRepository.findById(langID).orElseThrow();

        assertEquals(langID, langTest.getId());
        assertEquals("English", langTest.getName());
    }
}
