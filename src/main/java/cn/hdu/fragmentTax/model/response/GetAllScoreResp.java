package cn.hdu.fragmentTax.model.response;

public class GetAllScoreResp {
    private Integer currNumber;
    private Float averageScore;
    private Float engineeringMathematics;
    private Float firstForeignLanguage;
    private Float characteristicSocialism;
    private Float numericalAnalysis;

    public GetAllScoreResp() {
    }

    public GetAllScoreResp(Integer currNumber, Float averageScore, Float engineeringMathematics, Float firstForeignLanguage, Float characteristicSocialism, Float numericalAnalysis) {
        this.currNumber = currNumber;
        this.averageScore = averageScore;
        this.engineeringMathematics = engineeringMathematics;
        this.firstForeignLanguage = firstForeignLanguage;
        this.characteristicSocialism = characteristicSocialism;
        this.numericalAnalysis = numericalAnalysis;
    }

    public Integer getCurrNumber() {
        return currNumber;
    }

    public void setCurrNumber(Integer currNumber) {
        this.currNumber = currNumber;
    }

    public Float getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(Float averageScore) {
        this.averageScore = averageScore;
    }

    public Float getEngineeringMathematics() {
        return engineeringMathematics;
    }

    public void setEngineeringMathematics(Float engineeringMathematics) {
        this.engineeringMathematics = engineeringMathematics;
    }

    public Float getFirstForeignLanguage() {
        return firstForeignLanguage;
    }

    public void setFirstForeignLanguage(Float firstForeignLanguage) {
        this.firstForeignLanguage = firstForeignLanguage;
    }

    public Float getCharacteristicSocialism() {
        return characteristicSocialism;
    }

    public void setCharacteristicSocialism(Float characteristicSocialism) {
        this.characteristicSocialism = characteristicSocialism;
    }

    public Float getNumericalAnalysis() {
        return numericalAnalysis;
    }

    public void setNumericalAnalysis(Float numericalAnalysis) {
        this.numericalAnalysis = numericalAnalysis;
    }
}
