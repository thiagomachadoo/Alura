package test;

import escola.Email;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {
    @Test
     public void Email(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailInvalido"));

    }



    @Test
   public  void deveriarCriar(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email("thiago@fsaaddada"));


        assertThrows(IllegalArgumentException.class,
                () -> new Email("thiago@2344343.com"));

    }

}

