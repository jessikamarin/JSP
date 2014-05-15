package br.com.treinamento.taglib;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ImprimeDataAtualTagHandler extends TagSupport {

	private static final long serialVersionUID = -7526678921910114523L;

	@Override
	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
	    Date dataAtual = new Date();
	    
		try {
			writer.println(sd.format(dataAtual));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return SKIP_BODY;
	}
}
