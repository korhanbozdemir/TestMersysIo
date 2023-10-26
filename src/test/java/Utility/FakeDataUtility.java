package Utility;

import com.github.javafaker.Faker;

public class FakeDataUtility {

    public String[] FakeData() {

        Faker faker = new Faker();
        String fakePosition = faker.job().position();

        String[] shortNameSplit = fakePosition.split(" ");//Kelimeleri boşluğa göre ayır
        String firstChar = shortNameSplit[0].substring(0, 1); //ilk cümlenin ilk harfini al
        String secondChar = "";

        //String newfakePosition=faker.job().position(); //update için oluşturdum

        if (shortNameSplit.length > 1) {
            secondChar = shortNameSplit[1].substring(0, 1);// eğer büyükse 2inci cümleninde ilk harfini alır
        } else {
            secondChar = "";
        }


        String shortName = firstChar + secondChar;

        //System.out.println("newfakePosition = " + newfakePosition);

        String[] data = {fakePosition, shortName};

        return data;
    }

    public String[] FakeDataTable()
    {
        Faker faker=new Faker();
        String name =faker.name().firstName();
        String code=Integer.toString(faker.code().hashCode());
        String email=faker.internet().emailAddress();



        String[] faketablo={name,code,email};

        return faketablo;

    }

}