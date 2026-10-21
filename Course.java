import java.util.Vector;
import java.util.Enumeration;

public class Course {
    private String title;
    // Tambahkan <CourseRecord> di sini
    private Vector<CourseRecord> courseRecords;

    Course() { 
        // Tambahkan <CourseRecord> (atau cukup <> ) di sini
        courseRecords = new Vector<CourseRecord>(); 
    }

    public String getTitle() { return title; }
    public void setTitle(String t) { title = t; }

    public void addCourseRecord(CourseRecord cr) { 
        courseRecords.addElement(cr); 
    }

    // Tambahkan <CourseRecord> pada Return Type Enumeration
    public Enumeration<CourseRecord> getCourseRecords() { 
        return courseRecords.elements(); 
    }

    public void printCourseStudents() {
        /* lengkapi: cetak seluruh mahasiswa yang mengambil course */
    }

    public void printBestStudent() {
        /* lengkapi: cetak mahasiswa dengan nilai rata-rata terbaik */
    }

    public void printFinalExamStudents() {
        /* lengkapi: cetak mahasiswa yang layak ujian akhir */
    }
}