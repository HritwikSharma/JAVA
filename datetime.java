import java.time.*;
class datetime{
    public static void main(String args[]){
        LocalDate d=LocalDate.now();
        LocalTime t=LocalTime.now();
        LocalDate d1=LocalDate.of(2002,12,27);
        System.out.println("Leap year custom"+d1.isLeapYear());
        System.out.println("date"+d);
        System.out.println("leap year now"+d.isLeapYear());
        System.out.println("plus day"+d.plusDays(5));
        System.out.println("time"+t);
        System.out.println("plus hour"+t.plusHours(5));
        System.out.println("plus minute"+t.plusMinutes(15));
    }
}