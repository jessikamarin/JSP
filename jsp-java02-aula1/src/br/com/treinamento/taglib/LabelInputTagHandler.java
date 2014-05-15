package br.com.treinamento.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class LabelInputTagHandler extends TagSupport {

	private static final long serialVersionUID = 4764928714396695759L;

	private String componentId;
	private String componentLabel;
	private String componentName;

	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();

		try {
			
			out.println("<div class=\"input-group\">");
			
			out.println("<label for=\"" + componentId + "\">");
			out.println(componentLabel);
			out.println("</label>");

			out.println("<input type=\"text\" id=\"" + componentId + "\" class=\"form-control\" name=\"" + componentName + "\" />");
			
			out.println("</div>");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return SKIP_BODY;

	}

	public String getComponentId() {
		return componentId;
	}

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	public String getComponentLabel() {
		return componentLabel;
	}

	public void setComponentLabel(String componentLabel) {
		this.componentLabel = componentLabel;
	}

	public String getComponentName() {
		return componentName;
	}

	public void setComponentName(String componentName) {
		this.componentName = componentName;
	}
	
	

}
