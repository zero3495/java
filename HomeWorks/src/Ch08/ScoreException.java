package Ch08;

@SuppressWarnings("serial")
public class ScoreException extends Exception {
	int score;
	private String errorMessage;
	ScoreException(int s){
		score = s;
		setErrorMessage();
	}
	private void setErrorMessage() {
		if(score<0) {
			errorMessage = "分數 < 0";
		}else if(score>100) {
			errorMessage = "分數 > 100";
		}
	}
	String getErrorMessage() {
		return errorMessage;
	}
}
