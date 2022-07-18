
class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id=i;  
        name=n;  
        salary=s;  
    }  
    void display(){System.out.println(id+"  "+name+"  "+salary);} 
    
    
    void display1(){System.out.println(id+"  "+name+ " " );}
    		
    //void display(){System.out.println(id+" "%-8s", "+name+" ,"%s"; "+salary);} 
    
    //void display(){System.out.printf("%-8s%20s%5s", id+"  "+name+"  "+salary);} 
}  


public class EmployeeDetails {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		Employee emp4 = new Employee();
		Employee emp5 = new Employee();
		
		emp1.insert(001, "Prince", 200000);
		emp2.insert(002, "Johnvx", 300000);
		emp3.insert(003, "Chrisy", 400000);
		emp4.insert(004, "Tonyva",  100000);
		emp5.insert(005, "Cruxtd",  600000);
		
		Employee [] employees = {emp1, emp2, emp3, emp4, emp5};
		
		
		System.out.printf("%-3s%-8s%6s\n", "ID", "Name", "Salary");
		//System.out.printf("%-8s%-20s%5s\n", id name salary);
		 
		for(Employee emp : employees) {
			emp.display();
		
		}
		
		System.out.println("**********************");
		System.out.printf("%-3s%-8s\n", "ID", "Name");
		for(Employee emp : employees) {
			emp.display1();
			
		}
		

	}

}
