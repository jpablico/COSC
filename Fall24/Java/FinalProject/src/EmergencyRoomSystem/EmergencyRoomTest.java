import java.time.LocalDate;

public class EmergencyRoomTest {
    public static void main(String[] args) {
        PatientComparator comparator = new PatientComparator();
        PriorityQueue<Patient> heap = new Heap<>(comparator);
        EmergencyRoom eRoom = new EmergencyRoom(heap);

        eRoom.checkIn(new Patient("Mirabella Jones", LocalDate.of(1973, 7, 11), Severity.SEVEN));
        eRoom.checkIn(new Patient("Ruth Mendez", LocalDate.of(1965, 1, 22), Severity.SEVEN));
        eRoom.checkIn(new Patient("Melvin Ingram", LocalDate.of(1965, 1, 22), Severity.SEVEN));
        eRoom.checkIn(new Patient("Tara Silva", LocalDate.of(1975, 5, 8), Severity.EIGHT));
        eRoom.checkIn(new Patient("Jeff Barnes", LocalDate.of(1968, 12, 19), Severity.EIGHT));

        System.out.println("\nAdmitting patients:");
        Patient patient;
        while ((patient = eRoom.admit()) != null) {
            System.out.println(patient + "Admitted \n");
        }
    }
}