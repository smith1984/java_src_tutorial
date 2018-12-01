/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.smith.model;

/**
 *
 * @author ito
 */
public class SurveyData {

    private String fullName;
    private String[] progLangList;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String[] getProgLangList() {
        return progLangList;
    }

    public void setProgLangList(String[] progLangList) {
        this.progLangList = progLangList;
    }
}