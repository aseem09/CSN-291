public class Test{
    public static void main(String[] args) {

        Database db = new Database();

        Admin admin = new Admin(123,"temp123","Admin", 18, "Male", "Temp Address",987654321);
        User user = new User("User", 18, "Male", "Temp Address",987654321);

        Train t1 = new Train(10001,"7 February","Roorkee","Haridwar", "10:00", "9:00",5,100, 1000);
        Train t2 = new Train(10002,"9 July","Roorkee","Haridwar", "10:00", "9:00",5,100, 1000);

        admin.addTrainToDatabase(db, t1);
        admin.addTrainToDatabase(db, t2);

        Train temp1 = user.searchTrain(db,10002);
        
        try {
            Train temp2 = user.searchTrain(db,10003);
        } catch (Exception e) {
            if(e.toString() == "java.lang.NullPointerException") {
                System.out.println("Train Not Found \n");
            }
        }

        Reservation r1= new Reservation();
        Bank bank = new Bank();
        Ticket ticket = user.reservation(db,r1, t1, bank);
        
        





    }
}