public class Asus implements Computer{
    @Override
    public void name() {
        System.out.println("Bilgisayar markası ASUS");
    }

    @Override
    public void since(int year) {
        System.out.println(year + " yılında alındı.");
    }
}
