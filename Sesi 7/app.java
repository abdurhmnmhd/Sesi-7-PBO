
public class app {
    public static void main(String[] args) throws Exception{
        mahasiswa<Integer> mhs1 = new mahasiswa<Integer>("Abdurahman", 20220040);
        mahasiswa<String> mhs2 = new mahasiswa<String>("Abdurahman", "20220040");
        mahasiswa<Double> mhs3 = new mahasiswa<Double>("Abdurahman", 20220040.0);

        mhs1.info();
        mhs2.info();
        mhs3.info();

        concatenation X = new concatenation();
        X.add(1, "Abdurahman");
        X.add(1,"abdurahman", 2022004);
        X.add(2, "Rahman", 1233.0, "Teknik Informatika");
       
        
    }

    
    
}
