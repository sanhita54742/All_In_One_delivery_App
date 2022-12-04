/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Legal;

/**
 *
 * @author Admin
 */
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
public class LegalDirectory {
    private ArrayList<Legal> legalList;
    
    public LegalDirectory() {
        legalList = new ArrayList();
    }

    public ArrayList<Legal> getLegalList() {
        return legalList;
    }
    
     public void setLegalList(ArrayList<Legal> legalList) {
        this.legalList = legalList;
    }
    
    public void deleteLegal(String name) {
        for(int i = 0; i < legalList.size(); i ++) {
            if(legalList.get(i).getName().equals(name)) {
                legalList.remove(i);
            }
        }
    }
    
    