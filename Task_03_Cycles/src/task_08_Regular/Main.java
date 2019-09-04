package task_08_Regular;

public class Main {

    public static void main (String [] args)
    {
        CheckDomain checkDomain = new CheckDomain();
        checkDomain.checkDomain("esc_blr@mail.com");

        HexNumber hexNumber = new HexNumber();
        hexNumber.hexNumber("0x16352f 567");

        Phone phone = new Phone();
        phone.phone("+375293935955 36589854852 375293935955");

        Tags tags = new Tags();
        tags.tags("sdsdsds <d> sdsdsds </d> sdsdsds <psdsdsdsp> dsds sdsdsd <p ied = 'd1'> sdsdsds </d> ");

        IpAdress ipAdress = new IpAdress();
        System.out.println("IP adress is "+ ipAdress.ipAdress("258.168.1.1"));
    }
}