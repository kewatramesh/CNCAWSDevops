package awsdevops.example.awsdevopsdemo;

public class Result {
    public Result(int mathResult, String message) {
        this.mathResult = mathResult;
        this.message = message;
    }

    public int getMathResult() {
        return mathResult;
    }

    public void setMathResult(int mathResult) {
        this.mathResult = mathResult;
    }

    private int mathResult;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;
}
