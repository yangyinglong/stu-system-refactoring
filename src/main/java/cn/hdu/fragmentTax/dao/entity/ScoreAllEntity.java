package cn.hdu.fragmentTax.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;


@Entity
public class ScoreAllEntity implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String stuId;
    @Column
    private float engineeringMathematics;  // 工程数学
    @Column
    private float firstForeignLanguage;  // 第一外国语
    @Column
    private float characteristicSocialism;  // 中国特色社会主义理论与实践研究
    @Column
    private float numericalAnalysis;  // 数值分析
    @Column
    private Integer state;  // 0-无效，1-有效
    @Column
    private String createdTime;
    @Column
    private String changedTime;

    public static Map<String, Object> getAverageScore(ScoreAllEntity scoreAllEntity) {
        Map<String, Object> score = new HashMap<String, Object>();
        float allScores = 0;
        float averageScore = 0;
        int currNumber = 0;
        if (-1 != scoreAllEntity.getEngineeringMathematics()) {
            allScores = allScores + scoreAllEntity.getEngineeringMathematics();
            currNumber = currNumber + 1;
        }
        if (-1 != scoreAllEntity.getFirstForeignLanguage()) {
            allScores = allScores + scoreAllEntity.getFirstForeignLanguage();
            currNumber = currNumber + 1;
        }
        if (-1 != scoreAllEntity.getCharacteristicSocialism()) {
            allScores = allScores + scoreAllEntity.getCharacteristicSocialism();
            currNumber = currNumber + 1;
        }
        if (-1 != scoreAllEntity.getNumericalAnalysis()) {
            allScores = allScores + scoreAllEntity.getNumericalAnalysis();
            currNumber = currNumber + 1;
        }
        averageScore = allScores / currNumber;
        score.put("averageScore", averageScore);
        score.put("currNumber", currNumber);
        return score;
    }

    public ScoreAllEntity() {
    }

    public ScoreAllEntity(Integer id, String stuId, float engineeringMathematics, float firstForeignLanguage, float characteristicSocialism, float numericalAnalysis, Integer state, String createdTime, String changedTime) {
        this.id = id;
        this.stuId = stuId;
        this.engineeringMathematics = engineeringMathematics;
        this.firstForeignLanguage = firstForeignLanguage;
        this.characteristicSocialism = characteristicSocialism;
        this.numericalAnalysis = numericalAnalysis;
        this.state = state;
        this.createdTime = createdTime;
        this.changedTime = changedTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public float getEngineeringMathematics() {
        return engineeringMathematics;
    }

    public void setEngineeringMathematics(float engineeringMathematics) {
        this.engineeringMathematics = engineeringMathematics;
    }

    public float getFirstForeignLanguage() {
        return firstForeignLanguage;
    }

    public void setFirstForeignLanguage(float firstForeignLanguage) {
        this.firstForeignLanguage = firstForeignLanguage;
    }

    public float getCharacteristicSocialism() {
        return characteristicSocialism;
    }

    public void setCharacteristicSocialism(float characteristicSocialism) {
        this.characteristicSocialism = characteristicSocialism;
    }

    public float getNumericalAnalysis() {
        return numericalAnalysis;
    }

    public void setNumericalAnalysis(float numericalAnalysis) {
        this.numericalAnalysis = numericalAnalysis;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getChangedTime() {
        return changedTime;
    }

    public void setChangedTime(String changedTime) {
        this.changedTime = changedTime;
    }

}