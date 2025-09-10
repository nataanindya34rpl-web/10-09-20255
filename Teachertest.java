public class Teachertest {
    public static void main(String[] args) {
        // Membuat objek Teacher
       Teacher teacher1 = new Teacher("Mathematics",
        "Bagas", 
        50000,
         30);
       Teacher teacher2 = new Teacher("Science",
        "Boby",
        55000,
        35);

       // Menampilkan data teacher
       teacher1.print();
       System.out.println();
       teacher2.print();
    }
}


