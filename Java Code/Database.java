class Database
{
    public static Train trains[] = new Train[10000];
    
    public Train searchTrain(int trainNumber)
    {
        for(int i = 0; i < trains.length; i++)
        {
            if(trains[i].trainNumber == trainNumber)
            {
                return trains[i];
            }
        }
        Train train = new Train();
        return train;
    }
    public boolean checkAvailiblity(Train train)
    {
        if(train.seatsFilled>=train.totalSeats)
        {
            return false;
        }
        train.seatsFilled++;
        return true;
    }
    public void addTrain(Train t1)
    {
        for(int i=0;i<trains.length;i++)
        {
            if(trains[i]==null)
            {
                trains[i]=t1;
            }
        }

    }
}