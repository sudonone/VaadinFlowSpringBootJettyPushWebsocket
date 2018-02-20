package com.vaadin.starter.skeleton.spring;

import org.springframework.beans.factory.annotation.Autowired;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * The main view contains a button and a template element.
 */
@HtmlImport("styles/shared-styles.html")
@Route(value = "", layout = MainLayout.class)
public class MainView extends VerticalLayout {

	public MainView(@Autowired ExampleTemplate template) {


		Button button = new Button("Click me", event -> {
			new Thread(() -> {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				getUI().get().access(() -> {
					template.setValue("Clicked!");
				});
			}).start();
		});

		add(button, template);
		setClassName("main-layout");
	}
}
