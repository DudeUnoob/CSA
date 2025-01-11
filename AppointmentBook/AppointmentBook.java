package AppointmentBook;

public class AppointmentBook {
    private boolean[][] schedule; 
    
    public AppointmentBook() {
        schedule = new boolean[8][60];
    }
    
    private boolean isMinuteFree(int period, int minute) {
        return !schedule[period-1][minute];
    }
    
    private void reserveBlock(int period, int startMinute, int duration) {
        for (int i = startMinute; i < startMinute + duration && i < 60; i++) {
            schedule[period-1][i] = true;
        }
    }
    
    public int findFreeBlock(int period, int duration) {
        if (duration > 60) {
            return -1;
        }
        
        for (int startMin = 0; startMin <= 60 - duration; startMin++) {
            boolean blockFound = true;
            
           
            for (int i = 0; i < duration; i++) {
                if (!isMinuteFree(period, startMin + i)) {
                    blockFound = false;
                    while (startMin < 60 && !isMinuteFree(period, startMin)) {
                        startMin++;
                    }
                    startMin--; 
                    break;
                }
            }
            
            if (blockFound) {
                return startMin;
            }
        }
        
        return -1;
    }
    
    public boolean makeAppointment(int startPeriod, int endPeriod, int duration) {
        for (int period = startPeriod; period <= endPeriod; period++) {
            int startMinute = findFreeBlock(period, duration);
            if (startMinute != -1) {
                reserveBlock(period, startMinute, duration);
                return true;
            }
        }
        return false;
    }
}