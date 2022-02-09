/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurveyMC;

/**
 *
 * @author Phil
 */
import javax.faces.component.UICommand;
import javax.faces.component.UIForm;
import javax.faces.event.ActionEvent;
import javax.faces.model.SelectItem;
import java.util.ArrayList;

public class SurveyController 
{
    private ArrayList<Survey> surveyArr;
    private Survey survey;
    
    //JSF variables
    private UIForm form;
    private UIForm tableForm;
    private UICommand addCommand;
    
    public SurveyController()
    {
        surveyArr = new ArrayList<Survey>();
    }

    public ArrayList<Survey> getSurveyArr() {
        return surveyArr;
    }

    public void setSurveyArr(ArrayList<Survey> surveyArr) {
        this.surveyArr = surveyArr;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public UIForm getForm() {
        return form;
    }

    public void setForm(UIForm form) {
        this.form = form;
    }

    public UIForm getTableForm() {
        return tableForm;
    }

    public void setTableForm(UIForm tableForm) {
        this.tableForm = tableForm;
    }

    public UICommand getAddCommand() {
        return addCommand;
    }

    public void setAddCommand(UICommand addCommand) {
        this.addCommand = addCommand;
    }
    
    public void save(){
        surveyArr.add(this.survey);
    }
}
