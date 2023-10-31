package Utility;

import com.github.javafaker.Faker;

public class FakeDataUtility {

    public String[] FakeData() {

        Faker faker = new Faker();
        String fakePosition = faker.job().position();

        String[] shortNameSplit = fakePosition.split(" ");
        String firstChar = shortNameSplit[0].substring(0, 1);
        String secondChar = "";



        if (shortNameSplit.length > 1) {
            secondChar = shortNameSplit[1].substring(0, 1);
        } else {
            secondChar = "";
        }


        String shortName = firstChar + secondChar;
        String[] data = {fakePosition, shortName};

        return data;
    }

    public String[] FakeDataTable()
    {
        Faker faker=new Faker();
        String name =faker.name().firstName();
        String code=Integer.toString(faker.code().hashCode());
        String email=faker.internet().emailAddress();
        String EdtName=faker.name().firstName();
        String EdtCode=Integer.toString(faker.code().hashCode());




        String[] faketablo={name,code,email,EdtName,EdtCode};

        return faketablo;
    }

}