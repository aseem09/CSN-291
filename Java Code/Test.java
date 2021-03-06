public class Test{
    public static void main(String[] args) {

        System.out.println("\n");

        Database db = new Database();

        Admin admin = new Admin(123,"temp123","Admin", 18, "Male", "Temp Address",987654321);
        User user = new User("User", 18, "Male", "Temp Address",987654321);

        Train t1 = new Train(10001,"7 February","Roorkee","Haridwar", "10:00", "9:00",100,100, 1000);
        Train t2 = new Train(10002,"9 July","Roorkee","Haridwar", "10:00", "9:00",5,100, 1000);

        admin.addTrainToDatabase(db, t1);
        admin.addTrainToDatabase(db, t2);
        
        try {
            Train temp1 = user.searchTrain(db,10001);
            Train temp2 = user.searchTrain(db,10003);
        } catch (Exception e) {
            if(e.toString() == "java.lang.NullPointerException") {
                System.out.println("Train Not Found \n");
            }
        }

        
        Bank bank = new Bank("HDFC Bank");
        Reservation r1 = user.reservation(db, t1, bank);

        user.cancellation(r1);
        
        System.out.println("\n");
    }
}