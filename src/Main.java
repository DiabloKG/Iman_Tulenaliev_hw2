import java.util.Random;
public class Main {
    public static void main(String[] args) {
        System.out.println(ageAndTemperature(25,29));
        System.out.println(ageAndTemperature(10,22));
        System.out.println(ageAndTemperature(75, -24));
        System.out.println(ageAndTemperature(34,-13));
        System.out.println(ageAndTemperature(60, 26));
        int age = 0;
        for (int i = 0; i < 5; i++) {
            generateRandomAge(age);
            System.out.println(ageAndTemperature(age, 31));
        }

    }
    public static String ageAndTemperature (int age, int temperature) {
        String ageAndTemperature;
     if (age >= 25 && age <= 45 && temperature >= -20 && temperature <= 30){
       ageAndTemperature = "Можно идти гулять";

     }
     else if (age <= 20 && temperature >= 0 && temperature <= 28) {
         ageAndTemperature = "Можно идти гулять";

     }
     else if (age >= 45 && temperature >= -10 && temperature <= 25){
         ageAndTemperature = "Можно идти гулять";
     } else {
         ageAndTemperature = "Оставайтесь дома";

     }
    return ageAndTemperature;
    }
    public static int generateRandomAge(int age)
    {
        return new Random().nextInt(age + 1);
    }
    }