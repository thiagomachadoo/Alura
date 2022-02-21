import dominio.aluno.Email;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmailTest {
    @Test
     public void Email(){
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));

        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));

    }



    @Test
   public  void deveriarCriar(){
       assertThrows(IllegalArgumentException.class,
                () -> new Email("thiago@fsaaddada"));

        assertThrows(IllegalArgumentException.class,
                () -> new Email("thiagofsa12123"));

        new Email("thiago@2344343.com");
    }

}

