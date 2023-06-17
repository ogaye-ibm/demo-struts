package com.bofa.demo.struts.action;

import com.bofa.demo.struts.service.HelloMessageService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

@Namespaces({
        @Namespace("/")
})
@Action("/hello")
@Result(name = "success", location = "result.jsp")
public class LegacyHelloAction {
    private String language;
    private String helloMessage;
    private HelloMessageService helloMessageService = new HelloMessageService();

    public String execute() {
        System.out.println("   ***** HelloAction called with: " + language) ;
        this.setHelloMessage(this.helloMessageService.getLanguage(language));
        return "success";
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public String getHelloMessage() {
        return helloMessage;
    }

    public void setHelloMessage(String helloMessage) {
        this.helloMessage = helloMessage;
    }

}
