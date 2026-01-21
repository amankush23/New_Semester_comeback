// Last updated: 21/01/2026, 11:58:11
class ParkingSystem {
    private int arr[];
    public ParkingSystem(int big, int medium, int small) {
        arr = new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        if(arr[carType-1]>0)
        {   
            arr[carType-1]--;
            return true;
        }
        return false;
    }
}