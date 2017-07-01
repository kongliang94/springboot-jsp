package org.spring.springboot.controller;

import java.util.List;
import java.util.Map;

import org.spring.springboot.domain.City;
import org.spring.springboot.domain.Menuitem;
import org.spring.springboot.domain.User;
import org.spring.springboot.service.CityService;
import org.spring.springboot.service.MenuitemService;
import org.spring.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author KL
 *
 */
@Controller
public class CityRestController {

	//private String hello="kongl";
    @Autowired
    private CityService cityService;
    @Autowired
    private UserService userService;
    @Autowired
    private MenuitemService menuitemService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    @ResponseBody
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }
    @RequestMapping("/helloJsp")
	public String helloJsp(Map<String,Object> map){
		//System.out.println("HelloController.helloJsp().hello=hello");
		//map.put("hello", hello);
		return "helloJsp";
	}
    @RequestMapping("/menu")
	public String showMuenList(Model model){
	
		return "menuitem";
	}
    @RequestMapping("/menu1")
    @ResponseBody
   	public List<Menuitem> muenList(Model model){
   	
    	return menuitemService.findAll();
   		
   	}
    @RequestMapping("/userlist")
	public String userlist(Model model,@RequestParam(value = "depId", required = true) Long depId){
    	List<User> userlist=userService.findUserByDepId(depId);
    	model.addAttribute("depId", depId);
		model.addAttribute("userlist", userlist);
		return "userlist";
	}
    @RequestMapping("/add")
    public String addUser(User user){
    	int n=userService.insert(user);
    	if (n!=0) {
    		return "redirect:/userlist?depId="+user.getDepId(); 
		}
    	return "fail";
    }


}
