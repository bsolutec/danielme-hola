package de.solutec.jakartaee.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {

	private static final long serialVersionUID = -1273771946552218359L;
	private static final Logger log = LoggerFactory.getLogger(HelloServlet.class);

	private static final String HELLO_MESSAGE = "Jakarta EE rocks!!";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter printWriter = response.getWriter();
		response.setContentType("text/plain;charset=UTF-8");
		log.debug("returning the message {}", HELLO_MESSAGE);
		printWriter.println(HELLO_MESSAGE);
		printWriter.print("Es otro mensaje, para subir a github");

	}

}
