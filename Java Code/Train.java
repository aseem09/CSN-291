class Train
{
    public int trainNumber;
    public String date;
    public String source;
    public String destination;
    public String arrivalTime;
    public String departureTime;
    public int seatsFilled;
    public int totalSeats;
    public int distance;

    Train(){}

    Train(int trainNumber,String date,String source, String destination, String arrivalTime, String departureTime,int seatsFilled,int totalSeats, int distance)
    {
        this.trainNumber = trainNumber;
        this.date = date;
        this.source = source;
        this.destination = destination;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.totalSeats = totalSeats;
        this.seatsFilled = seatsFilled;
        this.distance = distance;
    }
}