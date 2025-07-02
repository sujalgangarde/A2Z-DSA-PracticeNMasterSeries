public class EnumEg {

    enum weekdays implements A {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        weekdays(){
            System.out.println("Weekday created: " + this);
        }

        @Override
        public void hello() {
            System.out.println("Hello");
        }
    }

    public static void printWeekdays() {
        for (weekdays day : weekdays.values()) {
            System.out.println(day);
        }
    }

    public static void main(String[] args) {
        
        weekdays today = weekdays.WEDNESDAY;
        System.out.println();
        System.out.println("Today is: " + today);
        System.out.println();
        System.out.println("All days of the week:");
        printWeekdays();
        System.out.println("Enum can not extend another class, but can implement an interface.");
        today.hello();

    }

}
