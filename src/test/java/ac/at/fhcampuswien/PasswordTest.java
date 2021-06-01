package ac.at.fhcampuswien;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {
    @Test
    @DisplayName("Does the password have the correct length?")
    public void checkPassword(){
        Password word = new Password();
        boolean answer=word.Length("Ichduersie2?");
        assertTrue(answer);
    }

    @Test
    @DisplayName("Does the password have the correct length?")
    public void checkPassword2(){
        Password word = new Password();
        boolean answer=word.Length("Ich");
        assertTrue(answer);
        }

    @Test
    @DisplayName("Does the password contain lower and uppercase?")
    public void CheckPassword1(){
        Password word= new Password();
        boolean answer = word.UpperLowerCase("Ichduersie2?");
        assertTrue(answer);
    }

    @Test
    @DisplayName("Does the password contain numbers?")
    public void CheckPassword4(){
      Password word= new Password();
      boolean answer = word.Numbers("Ichduersie2?");
      assertTrue(answer);
    }

    @Test
    @DisplayName("Does the password contain numbers?")
    public void CheckPassword5(){
        Password word= new Password();
        boolean answer = word.Numbers("Ichduersie?");
        assertTrue(answer);
    }
}
