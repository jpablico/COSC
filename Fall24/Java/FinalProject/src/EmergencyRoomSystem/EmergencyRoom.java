import java.time.LocalTime;

public class EmergencyRoom {
    private final PriorityQueue<Patient> priorityQueue;

    public EmergencyRoom(PriorityQueue<Patient> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }

    public void checkIn(Patient patient, Severity severity) {
        patient.setSeverity(severity);
        patient.setArrivalTime(LocalTime.now());
        priorityQueue.add(patient);
    }

    public Patient admit() {
        return priorityQueue.remove();
    }
}