package ss8_clean_code_and_refactoring.exercise;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 15;
    private static final int THIRTY = 30;
    private static final int FORTY = 40;

    public static String getScore(int firstScore, int secondScore) {
        if (firstScore == secondScore) {
            return getFirstPoint(firstScore);
        } else if (firstScore >= 40 || secondScore >= 40) {
            return getMinusResult(firstScore, secondScore);
        } else {
            return getTempScore(firstScore, secondScore);
        }
    }

    public static String getFirstPoint(int firstScore) {
        switch (firstScore) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    public static String getMinusResult(int firstScore, int secondScore) {
        int minusResult = firstScore - secondScore;
        if (minusResult == 1) {
            return "Advantage ";
        } else if (minusResult == -1) {
            return "Advantage Second Player";
        } else if (minusResult >= 2) {
            return "Win for First Player";
        } else {
            return "Win for Second Player";
        }
    }

    public static String getTempScore(int firstScore, int secondScore) {
        int tempScore =0;
        for (int i = 1; i < 40; i++) {
            if (i == 1) {
                tempScore = firstScore;
            } else {
                tempScore = secondScore;
            }
            switch (tempScore) {
                case LOVE:
                    return "Love";
                case FIFTEEN:
                    return "Fifteen";
                case THIRTY:
                    return "Thirty";
                case FORTY:
                    return "Forty";
            }
        }
        return "error";
    }
}
