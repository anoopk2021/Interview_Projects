package coding_with_java8;
public class Current_Date_Time {
        public static void main(String[] args) {
            System.out.println("Current Local Date: " + java.time.LocalDate.now());
            //Used LocalDate API to get the date
            System.out.println("Current Local Time: " + java.time.LocalTime.now());
            //Used LocalTime API to get the time
            System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
            //Used LocalDateTime API to get both date and time
        }
    }

