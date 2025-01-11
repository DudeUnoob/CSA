package AppointmentBook;

public class AppointmentBookRunner {
    public static void main(String[] args) {
    
        
        AppointmentBook book1 = new AppointmentBook();
        
      
        for (int i = 0; i < 10; i++) {
            book1.makeAppointment(2, 2, 1);
        }
        for (int i = 15; i < 30; i++) {
            book1.makeAppointment(2, 2, 1);
        }
        for (int i = 45; i < 50; i++) {
            book1.makeAppointment(2, 2, 1);
        }
        
        // Test findFreeBlock example cases
        System.out.println(book1.findFreeBlock(2, 15));
        
        System.out.println(book1.findFreeBlock(2, 9));
        
        System.out.println(book1.findFreeBlock(2, 20));
   
        
        AppointmentBook book2 = new AppointmentBook();
        
       
        for (int i = 0; i < 25; i++) {
            book2.makeAppointment(2, 2, 1);
        }
        for (int i = 30; i < 60; i++) {
            book2.makeAppointment(2, 2, 1);
        }
        
        for (int i = 15; i < 41; i++) {
            book2.makeAppointment(3, 3, 1);
        }
        
        for (int i = 0; i < 5; i++) {
            book2.makeAppointment(4, 4, 1);
        }
        for (int i = 30; i < 44; i++) {
            book2.makeAppointment(4, 4, 1);
        }
        

        System.out.println(book2.makeAppointment(2, 4, 22));
        
        System.out.println(book2.makeAppointment(3, 4, 3));
        
        System.out.println(book2.makeAppointment(2, 4, 30));
        
        
        AppointmentBook book3 = new AppointmentBook();
        
        System.out.println(book3.findFreeBlock(1, 15));
        
        System.out.println(book3.makeAppointment(1, 1, 60));
        
        System.out.println(book3.makeAppointment(2, 2, 1));
    }
}