package cn.hdu.fragmentTax.model.request;

public class EditAllScoreRequ {
    private String stuId;
    private Float engineeringMathematics;
    private Float firstForeignLanguage;
    private Float characteristicSocialism;
    private Float numericalAnalysis;

    public EditAllScoreRequ() {
    }

    public EditAllScoreRequ(String stuId, Float engineeringMathematics, Float firstForeignLanguage, Float characteristicSocialism, Float numericalAnalysis) {
        this.stuId = stuId;
        this.engineeringMathematics = engineeringMathematics;
        this.firstForeignLanguage = firstForeignLanguage;
        this.characteristicSocialism = characteristicSocialism;
        this.numericalAnalysis = numericalAnalysis;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
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
