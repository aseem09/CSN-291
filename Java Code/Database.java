class Database
{
    public static Train trains[] = new Train[10000];
    int count =0 ;
    
    public Train searchTrain(int trainNumber)
    {
        for(int i = 0; i < trains.length; i++)
        {
            if(trains[i].trainNumber == trainNumber)
            {
                System.out.print("Train Number: "+ trains[i].trainNumber + "\n");
                System.out.print("Seats: "+ (trains[i].totalSeats - trains[i].seatsFilled)+ "/" + trains[i].totalSeats + "\n");
                System.out.print("Train Source: "+ trains[i].source + "\n");
                System.out.print("Train Destination: "+ trains[i].destination + "\n\n");
                return trains[i];
            }
        }
        Train train = new Train();
        System.out.println("Train Not Found \n");
        return train;
    }
    public boolean checkAvailiblity(Train t1)
    {
        if(t1.seatsFilled>= t1.totalSeats)
        {
            return false;
        }
        for(int i=0;i<trains.length;i++){
            if(trains[i] == t1){
                trains[i].seatsFilled += 1;
            }
        }
        return true;
    }
    public void addTrain(Train t1)
    {
        trains[count] = t1;
        count++;
    }
}