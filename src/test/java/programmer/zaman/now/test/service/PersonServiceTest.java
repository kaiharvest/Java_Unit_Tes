package programmer.zaman.now.test.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import programmer.zaman.now.test.data.Person;
import programmer.zaman.now.test.repository.PersonRepository;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    void setUp() {
        personService = new PersonService(personRepository);
    }

    @Test
    void testNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        Mockito.when(personRepository.selectById("indra"))
                .thenReturn(new Person("indra", "Indra"));

        var person = personService.get("indra");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("indra", person.getId());
        Assertions.assertEquals("Indra", person.getName());
    }

    @Test
    void testRegisterSuccess() {
        var person = personService.register("Indra");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Indra", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Indra"));
    }

}
