package ac.at.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    @DisplayName("Does the password have the correct length?")
    public void checkPassword(){
        Password word = new Password();
        boolean answer=word.checkPassword("Ichduersie2?");
        assertTrue(answer);
    }

    @Test
    @DisplayName("Does the password have the correct length?")
    public void checkPassword2(){
        Password word = new Password();
        boolean answer=word.checkPassword("Ich");
        assertFalse(answer);
        }

    @Test
    @DisplayName("Does the password contain lower and uppercase?")
    public void CheckPassword3(){
        Password word= new Password();
        boolean answer = word.checkPassword("Ichduersie8?");
        assertTrue(answer);
    }

    @Test
    @DisplayName("Does the password contain lower and uppercase?")
    public void CheckPassword4(){
        Password word= new Password();
        boolean answer = word.checkPassword("ichduersie8?");
        assertFalse(answer);
    }



    @Test
    @DisplayName("Does the password contain numbers?")
    public void CheckPassword5(){
      Password word= new Password();
      boolean answer = word.checkPassword("Ichduersie2?");
      assertTrue(answer);
    }

    @Test
    @DisplayName("Does the password contain numbers?")
    public void CheckPassword6(){
        Password word= new Password();
        boolean answer = word.checkPassword("Ichduersie?");
        assertFalse(answer);
    }

    @Test
    @DisplayName("Does the password contain special characters?")
    public void CheckPassword7(){
        Password word= new Password();
        boolean answer = word.checkPassword("Ichduersie8?");
        assertTrue(answer);
    }

    @Test
    @DisplayName("Does the password contain special characters?")
    public void CheckPassword8(){
        Password word= new Password();
        boolean answer = word.checkPassword("Ichduersie");
        assertFalse(answer);
    }

    @Test
    @DisplayName("Does the password contain increasing numbers?")
    public void CheckPassword9(){
        Password word= new Password();
        boolean answer = word.checkPassword("Ichduersie1234#");
        assertFalse(answer);
    }


    @Test
    @DisplayName("Does the password contain same numbers?")
    public void CheckPassword10(){
        Password word= new Password();
        boolean answer = word.checkPassword("Ichduersie111#");
        assertFalse(answer);
    }


    @Test
    @DisplayName("Does the password contain same numbers?")
    public void CheckPassword11(){
        Password word= new Password();
        boolean answer = word.checkPassword("Ichdue22111#");
        assertFalse(answer);
    }
}
