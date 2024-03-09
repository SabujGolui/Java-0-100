package Controller;

import Dao.SaveClassWork;
import Dto.ClassWorks;

/**
 * This class serves as a sample controller for demonstrating the usage of
 * SaveClassWork.
 */
public class MyController {

	/**
	 * The main method to execute the controller logic.
	 *
	 * @param args Command line arguments (not used in this example).
	 */
	public static void main(String[] args) {

//		 insert operation
//		 Create a new instance of ClassWorks and set its properties
		ClassWorks cw = new ClassWorks();
		cw.setC_id(4);
		cw.setName("Sabujgf");
		cw.setEmail("SabujGolui3@gmail.com");
		cw.setNo(1234586);

		// Create an instance of SaveClassWork to save the ClassWorks entity
		SaveClassWork saveclasswork = new SaveClassWork();

		// Save the ClassWorks entity using the SaveClassWork instance
//		saveclasswork.save(cw);

		// update operation

//		// Create a new instance of ClassWorks and set its properties
//		ClassWorks cw = new ClassWorks();
//		cw.setC_id(2);
//		cw.setName("Ritwika");
//		cw.setEmail("SabujGolui1@gmail.com");
//		cw.setNo(123456);
//
//		// Create an instance of SaveClassWork to save the ClassWorks entity
//		SaveClassWork saveclasswork = new SaveClassWork();
//
//		// Update the ClassWorks entity using the SaveClassWork
//		saveclasswork.Update(cw);

		// fetch data
		// Create an instance of SaveClassWork to save the ClassWorks entity
//		SaveClassWork saveclasswork = new SaveClassWork();
//
//		// Update the ClassWorks entity using the SaveClassWork
//		saveclasswork.fetch(1);

		// delete

//		SaveClassWork saveclasswork = new SaveClassWork();
//
//		// Update the ClassWorks entity using the SaveClassWork
//		saveclasswork.delete(1);

//		SaveClassWork saveclasswork = new SaveClassWork();
		//
//				// Update the ClassWorks entity using the SaveClassWork
		saveclasswork.fetchAll();
//		saveclasswork.fetchAll(email);

	}
}
