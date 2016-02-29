/**
 * 
 */
package com.rsinc.webretail.b2c.estore.web.controller.admin;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Roshan Titus
 *
 */
@Controller
public class DashboardController {

    @RequestMapping(value="/admin/dashboard.html", method=RequestMethod.GET)
    public String viewDashboard(Locale locale) {
        return "dashboard";
    }
    
    @RequestMapping(value="/admin/blank.html", method=RequestMethod.GET)
    public String viewContent(Locale locale) {
        return "blank";
    }    
}
