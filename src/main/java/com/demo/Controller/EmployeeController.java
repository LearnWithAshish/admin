package com.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Employee")
public class EmployeeController {
	
 public void name() {
	System.out.println("new method is added in tthe controller class");
}
	@GetMapping("/get")
	public int getString () {
		int temp;
		int []a= {11,23,45,1,33};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				
				if (a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
				
				
			}
			


			
			
		}
			
		return a[a.length-2];
	}

}
