package ch10;

public class GetInternetFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetFileFromInternet gffi = new GetFileFromInternet("C://intersting");
		gffi.getConsecutiveFiles("http://www.space-fox.com/wallpapers/celebs/penelope-cruz/penelope_cruz_", ".jpg", 1, 64);
	}

}
