package ac.at.fhcampuswien;

public class Password {
    public boolean checkPassword(String word){
        return true;
    }



    public boolean Length(String word){
        if(word.length() >8 && word.length()<25){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean UpperLowerCase(String word){



        return true;
    }



    public boolean Numbers(String word){
        if(word.matches(".*\\d+.*")){
            return true;
        }else{
            return false;
        }
    }


}
