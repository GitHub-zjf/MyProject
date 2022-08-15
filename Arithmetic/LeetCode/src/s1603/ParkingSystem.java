package s1603;

class ParkingSystem {

	public static int bigNum;
	public static int mediumNum;
	public static int smallNum;

	public ParkingSystem(int big, int medium, int small) {
		bigNum = big;
		mediumNum = medium;
		smallNum = small;
	}

	public boolean addCar(int carType) {
		if (carType == 1) {
			return bigNum-- > 0;
		} else if (carType == 2) {
			return mediumNum-- > 0;
		} else {
			return smallNum-- > 0;
		}
	}
}