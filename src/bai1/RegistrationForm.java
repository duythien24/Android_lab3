package bai1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bai1.Student;

@WebServlet("/RegistrationForm")
public class RegistrationForm  extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname = request.getParameter("txtFName");
		String lname = request.getParameter("txtLName");
		String birthdate = request.getParameter("day");
		String month = request.getParameter("month");
		String year = request.getParameter("year");
		String email = request.getParameter("txtEmail");
		String mobileNum = request.getParameter("txtMobileNumber");
		String gender = request.getParameter("gender");
		String address = request.getParameter("taAddress");
		String city = request.getParameter("txtCity");
		String pinCode = request.getParameter("txtPinCode");
		String state = request.getParameter("txtState");
		String country = request.getParameter("txtCountry");
		String hobbies[] = request.getParameterValues("ckHobbies");
		String course = request.getParameter("txtrCourse");
		//String birthdate = day + " "+ month + " "+ year;
		Student sv = new Student();
		sv.setFirstName(fname);
		sv.setLastName(lname);
		sv.setEmail(email);
		sv.setGender(gender);
		sv.setDateOfBirth(birthdate);
		List<String> h=new ArrayList<String>(); 
		for (int i = 0; i < hobbies.length; i++) {
			h.add(hobbies[i]);
		}
		sv.setHobbies(h);
		
		request.setAttribute("student", sv);
		RequestDispatcher rd = request.getRequestDispatcher("resutl-form.jsp");
		rd.forward(request, response);
		}
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException { 
			doGet(request, response);
		}
	
}
