package com.SpringDataExcelViewController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class EmployeeController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request,
        HttpServletResponse response) throws Exception {
        
        String output =
            ServletRequestUtils.getStringParameter(request, "output");
        
        //dummy data
        Map<String,String> employeeData = new HashMap<String,String>();
        employeeData.put("Block A abc", "Vachi");
        employeeData.put("Block-B xyz", "Raj");
        employeeData.put("Block-C PQR", "Ravi");
        employeeData.put("Block_D EFG", "Harry");
        employeeData.put("Block-Z PQR", "Sam");
        
        if(output ==null || "".equals(output)){
            //return normal view
            return new ModelAndView("EmployeeData","employeeData",employeeData);
            
        }else if("EXCEL".equals(output.toUpperCase())){
            //return excel view
            return new ModelAndView("ExcelEmployeeData","employeeData",employeeData);
            
        }else{
            //return normal view
            return new ModelAndView("EmployeeData","employeeData",employeeData);
            
        }
    }
}