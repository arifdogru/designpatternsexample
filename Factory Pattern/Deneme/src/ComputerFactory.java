public class ComputerFactory {
    public static Computer createComputer(Class aClass) throws InstantiationException , IllegalAccessException{
        return (Computer) aClass.newInstance();

    }
}
