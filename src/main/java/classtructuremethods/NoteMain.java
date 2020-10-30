package classtructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();

        note.setName("Kovács András");
        note.setTopic("Fák és bokrok");
        note.setText("Ez itt a hosszú szöveg.");


        System.out.println(note.getNoteText());
    }
}
