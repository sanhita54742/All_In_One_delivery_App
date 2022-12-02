/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Maid.MaidDirectory;
import Business.MaidManager.MaidManagerDirectory;
import Business.Hotel.Hotel_Directory;
import Business.HotelManager.HotelManagerDirectory;
import Business.HospitalManager.HospitalManagerDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import Business.createNetwork;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;    
    private GroceryDirectory groceryDirectory;  
    private MaidDirectory maidDirectory;  
    private CustomerDirectory customerDirectory;
    private LegalDirectory legalDirectory;
    private UserAccountDirectory userAccountDirectory;
    private createNetwork createNetwork;
    private int organizationID;
    private static int counter=0;
    private DeliveryManDirectory deliveryManDirectory;
    private GroceryManagerDirectory groceryManagerDirectory;
    private MaidManagerDirectory maidManagerDirectory;
    private HotelDirectory hotelDirectory;
    private Hotel_Directory hotel_Directory;
    private HotelManagerDirectory hotelManagerDirectory;
    private HospitalManagerDirectory hospitalManagerDirectory;
    private OrderDirectory orderDirectory;
    
    
    public Organization(){
        System.out.println("organization..");
    }

    public MaidDirectory getMaidDirectory() {
        return maidDirectory;
    }

    public MaidManagerDirectory getMaidManagerDirectory() {
        return maidManagerDirectory;
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
    }

    public HotelDirectory getHotelDirectory() {
        return hotelDirectory;
    }

    public HotelManagerDirectory getHotelManagerDirectory() {
        return hotelManagerDirectory;
    }
    
    public HospitalManagerDirectory getHospitalManagerDirectory() {
        return hospitalManagerDirectory;
    }
    
    public GroceryDirectory getGroceryDirectory() {
        return groceryDirectory;
    }
    
    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }
    
    public LegalDirectory getLegalDirectory() {
        return legalDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public createNetwork getcreateNetwork() {
        return createNetwork;
    }
    
    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public GroceryManagerDirectory getGroceryManagerDirectory() {
        return groceryManagerDirectory;
    }
    
    public Hotel_Directory getHotel_Directory() {
        return hotel_Directory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
