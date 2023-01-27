/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO241022;

/**
 *
 * @author RIMTECH COMPUTER
 */
public class MVCPatternDemo 
{
    
    public static void main(String[] args) 
    { 
	//fetch student record based on his roll no from the database 
	Student model = retriveStudentFromDatabase(); 
	
	//Create a view : to write student details on console 
	StudentView view = new StudentView(); 
	StudentController controller = new StudentController(model, view); 	
        controller.updateView();
        
	controller.setStudentName("Rahmitul Hasanah"); 
	controller.updateView(); 
    }

	private static Student retriveStudentFromDatabase()
       { 
	Student student = new Student(); 
	student.setName("Annisa"); 
	student.setNim("2101092016"); 
	return student; 
	} 
}
