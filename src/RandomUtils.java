import org.testng.annotations.DataProvider;

import java.util.Iterator;
import java.util.Random;

public class RandomUtils {
    private StringBuilder stringBuilder = new StringBuilder();
    private Random random = new Random();
    private String engChars = "abcdefghijklmnopqrstuvwxyz";
    private String engCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String cyrChars = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
    private String digitsChars = "0123456789";
    private String pswd;


    @DataProvider(name = "test1")
    public static Iterator<Object[]> rvd(){

        return null;
    }

    public String getRandomValidPassword(){
        for (int i = 0; i < 11; i++) {
            int randomEngIndex = random.nextInt(engChars.length());
            char randomEngChar = engChars.charAt(randomEngIndex);
            stringBuilder.append(randomEngChar);
        }

        stringBuilder.append(cyrChars.charAt(random.nextInt(cyrChars.length())));
        stringBuilder.append(digitsChars.charAt(random.nextInt(digitsChars.length())));
        stringBuilder.append(engCapital.charAt(random.nextInt(engCapital.length())));

        return pswd = stringBuilder.toString();
    }

    public String getRandomValidEmail(){

        for (int i = 0; i < 8; i++) {
            int randomEngIndex = random.nextInt(engChars.length()-3);
            char randomEngChar = engChars.charAt(randomEngIndex);
            stringBuilder.append(randomEngChar);
        }

        return stringBuilder.append("mail").toString();
    }

    public String getRandomInvalidPassword(){
        for (int i = 0; i < 11; i++) {
            int randomEngIndex = random.nextInt(engChars.length());
            char randomEngChar = engChars.charAt(randomEngIndex);
            stringBuilder.append(randomEngChar);
        }

        return stringBuilder.toString();
    }


}
