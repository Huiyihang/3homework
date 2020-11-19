import jdk.nashorn.api.scripting.ScriptObjectMirror;

public class Computerstore {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Computer computer = new Computer() {
        };
        computer.ss("computer1");
        System.out.println(computer.getName("computer1"));
        computer.cpu("Intel", 2, 800);
        computer.board("Seagate", 2, 800);
        computer.Memory("Samsung", 30, 900);
        computer.harddisk("Gigabyte", 6, 1200);
        computer.price(800, 800, 900, 1200);

        computer.ss("computer2");
        System.out.println(computer.getName("computer1"));
        computer.cpu("AMD", 2, 800);
        computer.board("Seagate", 2, 800);
        computer.Memory("Samsung", 30, 900);
        computer.harddisk("Gigabyte", 6, 1200);
        computer.price(800, 800, 900, 1200);
    }
}
