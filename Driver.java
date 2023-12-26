public class Driver {

    public static void main(String[] args) {

        double charge1=TicketSystem.getCharge(Location.GLORIOUSLAKE,true,5);
        System.out.println(charge1);
        double charge2=TicketSystem.getCharge(Location.HAPPYTOWN,false,2);
        System.out.println(charge2);
        double charge3=TicketSystem.getCharge(Location.SUNNYCITY,true,3);
        System.out.println(charge3);
    }
}