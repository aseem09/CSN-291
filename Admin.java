class Admin extends Passenger{
	public int id;
	public String password;

	public void addTrainToDatabase(Train t1){
		Database db = new Database();
		db.addTrain(t1);
	}
}