public class Mac implements Computer{

    @Override
    public void name() {
        System.out.println("Bilgisayar markası MAC");
    }

    @Override
    public void since(int year) {
        System.out.println(year + " yılında alındı.");
    }
}
