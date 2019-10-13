class Admin extends Passenger{

	public int id;
	public String password;

	Admin(int id, String password,String name,int age,String gender,String address,int phoneNo){
		this.id= id;
		this.password = password;
		this.name= name;
        this.age= age;
        this.gender = gender;
        this.address= address;
        this.phoneNo= phoneNo;
	}
	
	public void addTrainToDatabase(Database db,Train t1){
		db.addTrain(t1);
	}
}