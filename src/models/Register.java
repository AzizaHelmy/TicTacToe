/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Azza Helmy
 */
public class Register {

    private String userName;
    private int passward;

    public Register() {
    }

    public Register(String userName, int passward) {
        this.userName = userName;
        this.passward = passward;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassward() {
        return passward;
    }

    public void setPassward(int passward) {
        this.passward = passward;
    }
}
